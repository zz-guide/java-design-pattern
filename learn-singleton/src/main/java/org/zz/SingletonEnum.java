package org.zz;

/**
 * 枚举[极推荐使用]
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 可能是因为枚举在JDK1.5中才添加，所以在实际项目开发中，很少见人这么写过，
 * 这种方式也是最好的一种方式，如果在开发中JDK满足要求的情况下建议使用这种方式。
 */
public enum SingletonEnum {
    instance;

    private SingletonEnum() {
    }

    public void method() {
    }

}
