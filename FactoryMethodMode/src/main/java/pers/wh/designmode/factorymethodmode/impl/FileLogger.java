package pers.wh.designmode.factorymethodmode.impl;

import pers.wh.designmode.factorymethodmode.Logger;

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("FileLogger writeLog");
    }
}
