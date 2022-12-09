package jp.hashitaro._05_Singleton;

public class Singleton {

    private static final Singleton singleton = new Singleton();

    // コンストラクタをprivateに設定する必要あり。
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
