package org.example;

public class Obj {
    private Producto[] products;
    private int total;
    private int skip;
    private int limit;

    public Producto[] getProducts() {
        return products;
    }

    public void setProducts(Producto[] products) {
        this.products = products;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
