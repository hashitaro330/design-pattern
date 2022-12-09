package jp.hashitaro._04_FactoryMethod;

import jp.hashitaro._04_FactoryMethod.framework.Factory;
import jp.hashitaro._04_FactoryMethod.framework.Product;
import jp.hashitaro._04_FactoryMethod.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Hiroshi Yuki");
        Product card2 = factory.create("Hashimoto");

        card1.use();
        card2.use();
    }
}
