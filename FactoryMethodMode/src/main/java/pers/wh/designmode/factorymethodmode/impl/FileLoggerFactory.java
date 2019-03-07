package pers.wh.designmode.factorymethodmode.impl;

import pers.wh.designmode.factorymethodmode.Logger;
import pers.wh.designmode.factorymethodmode.LoggerFactory;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        System.out.println("[FileLoggerFactory] create FileLogger");
        return new FileLogger();
    }
}
