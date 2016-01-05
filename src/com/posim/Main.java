package com.posim;

import java.util.Scanner;

/**
 * 这里是主类
 * 主类Main就是这个控制台程序的起始点
 */
public class Main {

    public static void main(String[] args) {

        item[] buylist;
        init();


    }
    public static item input(){
        /**
         * 输入条码的实现部分
         * 功能：读取一个商品（或条码）
         * 返回一个商品
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("\nbarcode: ");
        String bar=sc.nextLine();
        System.out.print("\nname: ");
        String name=sc.nextLine();
        System.out.print("\nprice: ");
        float price=sc.nextFloat();
        System.out.print("\ndiscount: ");
        float discount=sc.nextFloat();

        /**
         * 暂时就这些信息 (需求1，2)
         * 还可以根据需求改变输入输出
         */
        return new item(bar,name,price,discount);
    }
    public static void output(){
        /**
         * 输出刚才输入商品的实现部分
         * 功能：打印上一次输入的商品信息
         */
    }
    public static void subtotal(){
        /**
         * 输出所有输入商品总信息的实现部分
         * 功能：打印input()用到的数组列表中所有信息
         */
    }
    public static void init(){
        /**
         * 初始化整个POS系统的仓库
         * 功能：暂为welcome信息
         */
        System.out.println("欢迎使用日乐购POS系统");
    }

}
