package com.posim;

/**
 * Created by Tomas on 2016/1/5.
 * 这是个别商品的类
 * 存放的是一个商品的属性，如条码ID，名称, 数量，单价，（折扣属性，活动优惠）
 */
public class item {

    public String barcode;
    public String name;
    public float price;
    public float discount;
    public int number;
    public boolean onSale;

    item(String b,String n,float p,float d)
    /**
     * 这是阶段1，2的构造函数
     */
    {
        this.barcode=b;
        this.name=n;
        this.price=p;
        this.discount=d;
        this.number=1;
    }
    item(String b,String n,float p,float d,boolean s)
        /**
         * 这是阶段3，4的构造函数
         */
    {
        this.barcode=b;
        this.name=n;
        this.price=p;
        this.discount=d;
        this.onSale=s;
        this.number=1;
    }
}
