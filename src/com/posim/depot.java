package com.posim;

/**
 * Created by Tomas on 2016/1/5.
 * 这是仓库类
 * 一个仓库存放若干个商品
 * 仓库设定了自己的容量上限，存放了里面商品的数量
 */
public class depot {

    public item itemlist[];
    public int itemNumber;
    public int maxNumber;

    depot(int num){
        /**
         * 初始化仓库
         * 新建一个 商品列表[最大容量]
         * 获得仓库最大容量
         * 设置当前商品数为0
         */
        this.itemlist=new item[num];
        this.maxNumber=num;
        this.itemNumber=0;
    }
    public int addItem(item add)
    /**
     * Param:(待添加商品)
     * 增加商品
     */
    {
        if(itemNumber<maxNumber)
        {
            itemlist[itemNumber]=add;
            itemNumber++;
        return 1;
        }
        else
            System.out.println("该仓库已满，不能添加商品！");
        return 0;
    }
    public int delItem(item del)
    /**
     * Param:(待删除商品）
     * 删除商品
     */
    {
        for(int i=0;i<itemNumber;i++)
        {
            if(itemlist[i]== searchItemById(del.barcode))
            {
                itemNumber--;
                for(int j=i;j<itemNumber;j++)
                {
                    itemlist[j]=itemlist[j+1];
                }
                return 1;
            }
        }
        System.out.println("商品删除出现错误，商品不存在于该仓库!");
        return 0;

    }
    public int modItem(item modify,item toModify)
    /**
     * Param:(待修改商品，已修改商品）
     * 修改商品属性,将指定商品更换为修改后的商品
     */
    {
        for(int i=0;i<itemNumber;i++)
        {
            if(itemlist[i]==searchItemById(modify.barcode))
            {
                itemlist[i]=toModify;
                return 1;
            }
        }
        System.out.println("修改商品属性出错，可能没有这个商品，或格式有误！");
        return 0;
    }
    public item searchItemById(String bar)
    /**
     * Param:(待查条码）
     * 通过条形码查找商品
     */
    {
        for(int i=0;i<itemNumber;i++)
        {
            if(itemlist[i].barcode.equals(bar))
            {
                return itemlist[i];
            }
        }
        System.out.println("所请求的商品不在这个仓库里!");
        return null;
    }
}
