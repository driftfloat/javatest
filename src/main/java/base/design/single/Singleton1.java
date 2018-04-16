package base.design.single;

public class Singleton1 {
	 //访问级别设置为private，确保在系统的其他代码不会被实例化
    private Singleton1(){}
    
    //声明static，在jvm加载单例类时，单例对象就会被建立
    private static Singleton1 singleton = new Singleton1();

    public static Singleton1 getInstance(){
        return singleton;
    }

}
