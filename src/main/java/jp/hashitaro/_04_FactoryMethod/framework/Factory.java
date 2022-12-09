package jp.hashitaro._04_FactoryMethod.framework;

public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        resisterProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void resisterProduct(Product product);
}
