package jp.hashitaro._03_TemplateMethod;

public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    // finalメソッド：サブクラスでオーバーライドするのを防ぐ。
    public final void display() {
        open();
        for (int i = 0; i < 5; i++ ) {
            print();
        }
        close();
    }
}
