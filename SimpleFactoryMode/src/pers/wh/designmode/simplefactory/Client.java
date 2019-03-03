package pers.wh.designmode.simplefactory;

public class Client {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("histogram");
        chart.display();
    }

}
