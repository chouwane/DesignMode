package pers.wh.designmode.factorymethodmode;

import pers.wh.designmode.factorymethodmode.impl.DatabaseLoggerFactory;

public class Client {

    public static void main(String[] args) {

        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();

    }

}
