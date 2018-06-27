## DesignPatterns
`This project contain 23 kinds of design patterns.`

>　**设计模式**是指控件在页面设计器中呈现时运行的代码。设计模式使人们可以更加简单方便地复用成功的设计和体系结构。将已证实的[技术](http://wiki.mbalib.com/wiki/%E6%8A%80%E6%9C%AF "技术")表述成设计模式也会使新[系统](http://wiki.mbalib.com/wiki/%E7%B3%BB%E7%BB%9F "系统")开发者更加容易理解其设计思路。

设计模式有23种，在编程规范和体系结构设计中被广泛采用，其中最常用的有以下10种，本为以简单的例子介绍设计模式的核心内容并通过android项目开发过程深入介绍设计模式在其中的作用。笔者水平有限，如有错误还请联系改正，谢谢。以上，笔者默认读者有一定的Java基础，对纯小白不太友好，若是有一定Android基础阅读更佳。

>以下式设计模式的分类汇总，根据使用频度的不同，笔者将部分比较重要或使用频度更高的部分特别标注出来，并详细展开。
tips：不知为何，图片看起来好模糊，可以点开查看原图会好一些，见谅。

![image.png](https://upload-images.jianshu.io/upload_images/2480310-1d20b660ad737b84.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)




*这里不得不提一下设计模式的设计原则，也正得益于这些设计原则，在程序健壮、高效、可复用方面有章可循*

- 1、开闭原则（Open Close Principle）
`对扩展开放，对修改关闭`。在程序需要进行拓展的时候，为了使程序的扩展性好，易于维护和升级,不能去修改原有的代码，使用接口和抽象类实现一个热插拔的效果。

- 2、里氏代换原则（Liskov Substitution Principle）
`任何基类可以出现的地方，子类一定可以出现`。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，里氏代换原则是对实现抽象化的具体步骤的规范。

- 3、依赖倒转原则（Dependence Inversion Principle）
`针对接口编程，依赖于抽象而不依赖于具体`。

- 4、接口隔离原则（Interface Segregation Principle）
`使用多个隔离的接口，比使用单个接口要好`。降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

- 5、迪米特法则，又称最少知道原则（Demeter Principle）
`一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立`。

- 6、合成复用原则（Composite Reuse Principle）
`尽量使用合成/聚合的方式，而不是使用继承`。




## 单例模式 
单例模式（Singleton Pattern）：确保一个类只有一个实例，并提供一个全局的访问点。

**单例模式要点**
- 私有的构造方法
- 指向实例的私有静态引用
- 获取实例对象的公有静态方法
##### 饿汉模式（非线程安全）`类在被Java虚拟机加载过程中直接创建`
```
public class SingleTon {
    private SingleTon(){}//私有化构造函数
    private static final SingleTon singleTon=new SingleTon();
    public static SingleTon getInstance(){
        return singleTon;
    }
}
```
##### 懒汉模式（非线程安全）`类只有在被实例化时才被创建`
```
public class SingleTon {
    private SingleTon() {}//私有化构造函数
    private static SingleTon singleTon;
    public static SingleTon getInstance() {
        if (singleTon == null)
            singleTon = new SingleTon();
        return singleTon;
    }
}
```
##### 双重线程锁检查单例（线程安全）
```
public class SingleTon {
    private SingleTon() {}//私有化构造函数
    private static volatile SingleTon singleTon;
    public static SingleTon getInstance() {
        if (singleTon == null){
            synchronized (SingleTon.class){
                SingleTon st=singleTon;
                if (st == null) {
                    st=new SingleTon();
                    singleTon=st;
                }
            }
        }
        return singleTon;
    }
}
```
##### 枚举单例
```
public enum SingleTon{
    Instance;
}
```
## 简单工厂模式
工厂方法模式(Factory Method Pattern)：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个工厂方法，让类把实例化推迟到子类。

- **第一步**
创建一个抽象的Vehicle类,注意其中的抽象方法`public abstract void assemble()；`
```
public abstract class Vehicle {
    protected String name;
    public abstract void assemble();
    public void constructFrame(){
        System.out.println("construct the frame of vehicle");
    }
    public void assembleTyre(){
        System.out.println("assemble tyres");
    }
    public void attachBody(){
        System.out.println("attach body");
    }
    public void setName(String name) {
        this.name = name;
    }
}
```
- **第二步**
创建两个类`Car`和`Truck`继承自Vehicle类并覆写上面定义的`public abstract void assemble()`方法

*Car.java*
```
public class Car extends Vehicle{
    @Override
    public void assemble() {
        super.setName("Car");
        System.out.println("assemble "+name);
    }
}
```
*Truck.java*
```
public class Truck extends Vehicle {
    @Override
    public void assemble() {
        super.setName("Truck");
        System.out.println("assemble "+name);
    }
}
```
代码很简单，而且也不长，即使是入门水平，看懂也没什么问题，不多废话。

- **第三步**
创建`VehicleFactory`工厂方法类，该类只包含一个`createVehicle()`方法，用于创建Vehicle；
```
public class VehicleFactory {
    public Vehicle createVehicle(String vehicleType){
        Vehicle vehicle=null;
        if (vehicleType.equals("Truck"))
            vehicle=new Truck();
        else if(vehicleType.equals("Car"))
            vehicle=new Car();
        vehicle.constructFrame();
        vehicle.assembleTyre();
        vehicle.attachBody();
        return vehicle;
    }
}
```
至此我们的简单工厂就完成了，下面我们测试一下
```
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory=new VehicleFactory();
        Vehicle vehicle=vehicleFactory.createVehicle("Car");
        vehicle.assemble();
    }
}
```
运行结果如下：
```
D:\installdirectory\jdk\bin\java 
construct the frame of vehicle
assemble tyres
attach body
assemble Car

Process finished with exit code 0
```
## 观察者模式
观察者模式（Observer Pattern）:定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，他们的所有依赖者都会收到通知并自动更新。

这里我们使用Android开发中的一个实例来说明观察者模式即：Android的广播通信BroadcastReceiver，这里我们会略去Android相关知识，仅仅关注核心代码；
- **第一步**
定义一个检测网络变化的接口,一旦网络状态发生变化，就调用`notifyNetWorkStatusChange()`方法通知注册用户更新网络状态。
- `registerObserver()`注册通知
- `unRegisterObserver()`取消通知注册

```
public interface NetWorkDetectiveManager {
    void registerObserver(NetWorkStatusChange netWorkStatusChange);
    void unRegisterObserver(NetWorkStatusChange netWorkStatusChange);
    void notifyNetWorkStatusChange();
}
```
然后定义一个接口用于更新网络状态,这里我们直接忽略参数，只关注`onNetWorkChange()`方法本身。
```
public interface NetWorkStatusChange {
    void onNetWorkChange(Boolean wifiStatus,Boolean dataStatus);
}
```
- **第二步**

定义一个广播接收器实现`NetWorkDetectiveManager`接口的三个方法；

这里我们只关注一下标注的几个方法
- `private ArrayList<NetWorkStatusChange> notifyList=new ArrayList<>()`;这里定义了一个`ArrayList<NetWorkStatusChange>`集合用于存放注册监听的类对象。
- `registerObserver()` *notifyList.add(netWorkStatusChange);*注册的过程其实就是向集合中添加元素的过程。
- `unRegisterObserver()`*notifyList.remove(netWorkStatusChange)*
同样，解注册就是将元素从集合中移除.
-`notifyNetWorkStatusChange()`最后我们通知注册通知的所有元素，网络状态发生了改变，（通过遍历集合中的元素实现）
```
public class NetWorkDetectiveReceiver 
extends BroadcastReceiver implements NetWorkDetectiveManager{
    private ArrayList<NetWorkStatusChange> notifyList=new ArrayList<>();
    private boolean wifiStaus=false;
    private boolean dataStaus=false;
    @Override
    public void onReceive(Context context, Intent intent) {
         ···
        if (wifiNetworkInfo.isConnected() && !dataNetworkInfo.isConnected()) {
                wifiStaus=true;
                dataStaus=false;
                notifyNetWorkStatusChange();
         }
          ···
    }

    @Override
    public void registerObserver(NetWorkStatusChange netWorkStatusChange) {
        notifyList.add(netWorkStatusChange);
    }

    @Override
    public void unRegisterObserver(NetWorkStatusChange netWorkStatusChange) {
        if(notifyList.indexOf(netWorkStatusChange)>=0){
            notifyList.remove(netWorkStatusChange);
        }
    }

    @Override
    public void notifyNetWorkStatusChange() {
        for (int i=0;i<notifyList.size();i++){
            NetWorkStatusChange netWorkStatusChange=notifyList.get(i);
            netWorkStatusChange.onNetWorkChange(true,true);
        }
    }
}
```
- **第三步**
更新数据的部分已经完成，一下是接收数据的部分，这里我们需要是实现`NetWorkStatusChange`接口，在`onNetWorkChange()`方法里我们可以实现自己的处理逻辑。至此，观察者模式的实例已经结束了，思路很简单，就是通过接口实现注册通知进行数据更新。此外，Android的广播通信设计模式同样是观察者模式，我们可以通过静态注册或是动态注册的方法注册广播，当系统发送广播时，我们就会收到相应的数据信息并及时更新app数据。
```
public class ContentAdapter 
extends BaseAdapter implements NetWorkStatusChange {
    ···
    @Override
    public void onNetWorkChange(Boolean wifiStatus, Boolean dataStatus) {
        //to-do 
        //这里我们可以写一些相关的处理逻辑
    }
    ···
}
```
## 装饰者模式
装饰者模（Decorate Pattern）：式动态地将责任附加到对象上，装饰者提供比继承更加有弹性的替代方案。
为了便于理解，我们暂且不讨论该模式怎么实现，我们先看一下应用的小例子：
```
public class DecoratorPatterners {
	public static void main(String[] args) {
		Base base=new Frame();
		base=new DectoratorA(base);
		base=new DectoratorB(base);
	}
}
```
上面这段代码定义了三个类分别是
- `Base`所有类的父类
- `Frame`被装饰者基类
- `DecoratorA` 装饰者A
- `DecoratorB`装饰者B
要想实现上述`base=new DectoratorA(base);`的效果，很显然，Frame类和Decorator类都是继承自同一个类`Base`，如此很容易推出，我们需要创建一个抽象基类Base，下面来看代码，这里我简单定义了一些方法和属性，便于继承和累加。
- **第一步**
Base基类其实就是一个简单的POJO类，定义了两个属性`name`和`length`以及他们的get和set方法，这里我们留意一下最后一个抽象方法`public abstract float totalLength();`，后面会提及.
```
public abstract class Base {
    public String name="";
    private int length=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract float totalLength();
}
```
而后定义一个被装饰的类`Frame`继承自Base类并覆写抽象方法`totalLength();`用于返回当前对象长度。
```
public class Frame extends Base{
    @Override
    public float totalLength() {
        return super.getLength();
    }
}
```
- **第二步**
开始创建装饰者类A，B，为了减少文件数量，我将`Decorator`和另外两个类放在同一个文件中，这里实现了传如Base基类的过程，之后调用`totalLength()`方法计算被装饰后的总长度，而子类`DecoratorA `和`DecoratorB`两个类只需要调用父类的构造函数并设置自身长度就可以了；至此，装饰者模式已经创建完毕，我们直接使用一开始的小例子就可以直接执行了。
```
//Decorator.java
public class Decorator extends Base{
    private Base Obj;
    public Decorator(Base obj) {
        Obj = obj;
    }
    @Override
    public float totalLength() {
        return super.getLength()+Obj.totalLength();
    }
}
class DecoratorA extends Decorator{
    public DecoratorA(Base obj) {
        super(obj);
        super.setLength(3);
    }
}
class DecoratorB extends Decorator{
    public DecoratorB(Base obj) {
        super(obj);
        super.setLength(2);
    }
}
```
## 模板方法模式
模板方法模式：（Template Method Pattern）在一个方法中定义一个算法框架，而将一些步骤延迟到子类中，模板方法可以使子类在不改变算法结构的情况下重新定义算法中的某些步骤。
我们假定组装一辆车需要四个步骤，其中`assembleTyre()`和`paint()`是相同的，我们在父类中定义好，另外两个写成抽象方法，在子类中实现。
- constructFrame();
- assembleTyre();
- attachBody();
- paint();
- **第一步**
创建抽象类，定义汽车组装过程为final，
```
public abstract class Vehicle {
    public final void assembleVehicle(){
        constructFrame();
        assembleTyre();
        attachBody();
        paint();
    }

    public abstract void constructFrame();
    public void assembleTyre() {
        System.out.println("assemble vehicle tyre");
    }
    public abstract void attachBody();
    public void paint() {
        System.out.println("paint vehicle body");
    }
}
```
- **第二步**
定义两个不同类型的车`Car`和`Truck`继承自`Vehicle`，实现父类未完成抽象方法，至此，模板方法模式已经完成了，怎么样，是不是很简单呢？下面我们就可以写主函数做测试了，
```
//Car.java
public class Car extends Vehicle{
    @Override
    public void constructFrame() {
        System.out.println("construct car frame");
    }

    @Override
    public void attachBody() {
        System.out.println("attach car body");
    }
}
//Truck.java
public class Truck extends Vehicle{
    @Override
    public void constructFrame() {
        System.out.println("construct truck frame");
    }

    @Override
    public void attachBody() {
        System.out.println("attach truck body");
    }
}
```
**测试**代码比较简单，不多赘述。
```
public class Main {
    public static void main(String[] args) {
        System.out.println("##########################Car");
        Car car=new Car();
        car.assembleVehicle();
        System.out.println("##########################Truck");
        Truck truck=new Truck();
        truck.assembleVehicle();
    }
}
```
**输出结果如下**
```
D:\installdirectory\jdk\bin\java
##########################Car
construct car frame
assemble vehicle tyre
attach car body
paint vehicle body
##########################Truck
construct truck frame
assemble vehicle tyre
attach truck body
paint vehicle body

Process finished with exit code 0
```

#### 未完待续。。。

