package Utils;

import java.math.BigInteger;
import java.math.MathContext;

/**
 * @author maple on 2019/1/2 16:42.
 * @version v1.0
 * @see 1040441325@qq.com
 * 模拟大数运算的核心方法
 */
public class SimpleBigDecimal {
    private  BigInteger intVal;// 未缩放的值(即真实值)
    private  int scale;// 缩放比例  真实值 = 整数化的值 / (10^scale)
    private transient int precision;//数值的位数
    private transient long intCompact;//数值(如果数值大于Long.MAX_VALUE,值为Long.MIN_VALUE)

    public void BigDecimal(char[] in, int offset, int len, MathContext mc) {
        int prec = 0;//数值位数(不计数值前面的0)
        int scl = 0;//放大的倍数
        long rs = 0;//数值
        BigInteger rb = null;
        // 取符号位
        boolean isneg = false;          // assume positive
        if (in[offset] == '-') {
            isneg = true;               // leading minus means negative
            offset++;
            len--;
        } else if (in[offset] == '+') { // leading + allowed
            offset++;
            len--;
        }
        // 取数值
        boolean dot = false;//是否到小数部分
        long exp = 0;//指数
        char c;
        boolean isCompact = len <= 18;
        int idx = 0;
        if (isCompact) {// 有足够的空间计算
            for (; len > 0; offset++, len--) {
                c = in[offset];
                if ((c == '0')) {
                    if (prec == 0) prec = 1;
                    else if (rs != 0) {
                        rs *= 10;
                        ++prec;
                    }
                    if (dot) ++scl;//记录小数位数
                } else if (c >= '1' && c <= '9') {
                    int digit = c - '0';
                    if (prec != 1 || rs != 0) ++prec;
                    rs = rs * 10 + digit;
                    if (dot) ++scl;
                } else if (c == '.') {//之后是小数位
                    if (dot) throw new NumberFormatException();//存在两个及以上的小数点
                    dot = true;
                } else if (Character.isDigit(c)) {//判断char是否为数值
                    //尝试转换字符为数字
                } else if ((c == 'e') || (c == 'E')) {//指数计算
                    exp = parseExp(in, offset, len);
                    if ((int) exp != exp) // overflow
                        throw new NumberFormatException();
                    break;//指数计算完成,退出循环
                } else {
                    throw new NumberFormatException();
                }
            }
            if (prec == 0)//无数值
                throw new NumberFormatException();
            if (exp != 0) scl = adjustScale(scl, exp);
            rs = isneg ? -rs : rs;
            int mcp = mc.getPrecision();//获取精度位数
            int drop = prec - mcp;
            if (mcp > 0 && drop > 0) {
                while (drop > 0) {
                    // 检查缩放位数是否超出限制
                    scl = checkScaleNonZero((long) scl - drop);
                    // 三个参数一次为:数值.10^drop , 舍入模式对应的常量,返回结果为舍入后的值
                 //   rs = divideAndRound(rs, 10^drop, mc.roundingMode.oldMode);//roundingMode只允许同包访问.这里会报错
                    // 计算舍入后数值的位数
                    prec = longDigitLength(rs);
                    //再次计算需要丢弃的位数,直至符合精度要求
                    drop = prec - mcp;
                }
            }else {
                // 省略,逻辑相似,但考虑到数值超int上限,使用char[]存储数值,
                // 完成后将char[]转为BigInt类型

            }
        }
        this.scale = scl;
        this.precision = prec;
        this.intCompact = rs;
        this.intVal = rb;
    }

    private int longDigitLength(long rs) {
        return 0;
    }


    // 放大的倍数 - 10的指数 , 真实放大的倍数
    private int adjustScale(int scl, long exp) {
        long adjustedScale = scl - exp;
        if (adjustedScale > Integer.MAX_VALUE || adjustedScale < Integer.MIN_VALUE)
            throw new NumberFormatException("Scale out of range.");
        scl = (int) adjustedScale;
        return scl;
    }
    private static int checkScaleNonZero(long val) {
        int asInt = (int)val;
        if (asInt != val) {
            throw new ArithmeticException(asInt>0 ? "Underflow":"Overflow");
        }
        return asInt;
    }


    /**
     * 指数计算
     *
     * @param in 传入数据
     * @param offset 下标起始点
     * @param len 长度
     * @return 指数值
     */
    private static long parseExp(char[] in, int offset, int len) {
        long exp = 0;
        offset++;
        char c = in[offset];
        len--;
        boolean negexp = (c == '-');
        // optional sign
        if (negexp || c == '+') {
            offset++;
            c = in[offset];
            len--;
        }
        if (len <= 0) // no exponent digits
            throw new NumberFormatException();
        // skip leading zeros in the exponent
        while (len > 10 && (c == '0' || (Character.digit(c, 10) == 0))) {
            offset++;
            c = in[offset];
            len--;
        }
        if (len > 10) // too many nonzero exponent digits
            throw new NumberFormatException();
        // c now holds first digit of exponent
        for (; ; len--) {
            int v;
            if (c >= '0' && c <= '9') {
                v = c - '0';
            } else {
                v = Character.digit(c, 10);
                if (v < 0) // not a digit
                    throw new NumberFormatException();
            }
            exp = exp * 10 + v;
            if (len == 1)
                break; // that was final character
            offset++;
            c = in[offset];
        }
        if (negexp) // apply sign
            exp = -exp;
        return exp;
    }
}
