package jp.hashitaro._04_FactoryMethod.idcard;

import jp.hashitaro._04_FactoryMethod.framework.Factory;
import jp.hashitaro._04_FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void resisterProduct(Product product) {
        System.out.println(product + "を登録しました。");
    }
}
