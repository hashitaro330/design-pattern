package jp.hashitaro._06_Prototype;

import jp.hashitaro._06_Prototype.framework.Manager;
import jp.hashitaro._06_Prototype.framework.Product;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, World");

        Product p2 = manager.create("warning box");
        p2.use("Hello, World");

        Product p3 = manager.create("slash");
        p3.use("Hello, World");
    }
}
