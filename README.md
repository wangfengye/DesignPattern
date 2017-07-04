## Design Patterns(设计模式)

### 设计原则：
* 单一职责原则 Single Responsibility Principle
* 对扩展开放,对修改关闭

### 创建型模式
* 单例模式(Singleton)
* 工厂模式(Factoty)
* 抽象工厂模式(Abstarct Factory)
* 建造者模式(Builder)
    >用于创建复合对象
* 原型模式

### 结构型模式
* 适配器模式(adapter)
    >接口转换
* 装饰器模式(decorator)
    >不改变接口的情况下,添加责任;
     例子 javaI/O
* 代理模式
* 外观模式(facade)
    >简化接口,降低复杂性(ps: 即定义一个高级接口,操作一系列接口)
* 桥接模式
* 组合模式(composite)
    >对象组合成树状结构,实现统一处理个别对象及对象组合
* 享元模式

### 行为型模式
* 策略模式
* 模板方法模式(template)
    >在一个方法内定义一个算法的骨架,具体算法步骤有由子类实现,
    例如:数组的 sort方法
* 观察者模式(Observer)
* 迭代器模式(Iterator pattern)
    >提供统一的方法顺序访问聚合对象的每个元素,而又不暴露内部细节;
* 责任链模式
* 命令模式(method invocation)
* 备忘录模式
* 状态模式(Pattern of Objects for States）)
* 访问者模式
* 中介者模式
* 解释器模式