package pers.wh.designmode.simplefactory.impl;

import pers.wh.designmode.simplefactory.Chart;

public class LineChart implements Chart {

    public LineChart(){
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
