package pers.wh.designmode.factorymethodmode.impl;

import pers.wh.designmode.factorymethodmode.Logger;
import pers.wh.designmode.factorymethodmode.LoggerFactory;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        System.out.println("[DatabaseLoggerFactory] create DatabaseLogger");
        return new DatabaseLogger();
    }
}
