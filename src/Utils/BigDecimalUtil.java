package Utils;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author maple on 2019/1/2 14:14.
 * @version v1.0
 * @see 1040441325@qq.com
 * 对浮点数运算的封装
 */
public class BigDecimalUtil {
    /**
     * @param v1 被加数
     * @param v2 加数
     * @return v1 + v2
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * @param v1 被减数
     * @param v2 减数
     * @return v1 - v2
     */
    public static double subtract(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * @param v1 被乘数
     * @param v2 乘数
     * @return v1 * v2
     */
    public static double multiply(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * @param v1    被除数
     * @param v2    除数
     * @param scale 精确位数
     * @return v1 / v2
     */
    public static double divide(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();

    }
}
