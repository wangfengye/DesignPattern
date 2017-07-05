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
* 原型模式(prototype)
    >对象的拷贝

### 结构型模式
* 适配器模式(adapter)
    >接口转换
* 装饰器模式(decorator)
    >不改变接口的情况下,添加责任;
     例子 javaI/O
* 代理模式(proxy)
    >为另一个对象提供一个对象或占位符以控制对这个对象的访问
    
* 外观模式(facade)
    >简化接口,降低复杂性(ps: 即定义一个高级接口,操作一系列接口)
* 桥接模式(bridge)
    >主要特点是把抽象（abstraction）与行为实现（implementation）分离开来，
    从而可以保持各部分的独立性以及应对它们的功能扩展
* 组合模式(composite)
    >对象组合成树状结构,实现统一处理个别对象及对象组合
* 享元模式(Flyweight)
    >采用一个共享来避免大量拥有相同内容对象的开销
    
### 行为型模式
* 策略模式(strategy pattern)
    > 定义算法族,分别封装,各算法间可相互替换,一般由调用算法族的类组合算法
    与状态模式类似,都可以动态改变行为(算法)区别在于状态模式由状态类控制行为的改变
* 模板方法模式(template)
    >在一个方法内定义一个算法的骨架,具体算法步骤有由子类实现,
    例如:数组的 sort方法
* 观察者模式(Observer)
* 迭代器模式(Iterator pattern)
    >提供统一的方法顺序访问聚合对象的每个元素,而又不暴露内部细节;
* 责任链模式(Chain of Responsibility)
    >很多对象由每一个对象对其下家的引用而连接起来形成一条链
    例如:对申请审批的流转,权限不足向上流转直达有满足权限的人处理
* 命令模式(method invocation)
* 备忘录模式
* 状态模式(Pattern of Objects for States）
    >允许对象在内部状态改变是改变他的行为;行为的改变一般由状态类控制
* 访问者模式
* 中介者模式
* 解释器模式