package com.cxk06602.bugcrusher.jdbc_.basicdao.javabean;

public class Goods {
    private int goods_id;
    private String goods_name;
    private float unitprice;
    private String category;
    private String provider;

    public Goods() {
    }

    public Goods(int goods_id, String goods_name, float unitprice, String category, String provider) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.unitprice = unitprice;
        this.category = category;
        this.provider = provider;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", unitprice=" + unitprice +
                ", category='" + category + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
