package pers.wh.designmode.simplefactory.impl;

import pers.wh.designmode.simplefactory.Chart;

public class PieChart implements Chart {

    public PieChart(){
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
