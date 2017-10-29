package ru.zvezdov.GofPatterns.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         29.10.2017.
 */
class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int res1 = context.executeStrategy(3, 4);
        logger.info("Res1: " + res1);

        context.setStrategy(new ConcreteStrategyMultiply());
        int res2 = context.executeStrategy(3, 4);
        logger.info("Res2: " + res2);
    }
}
