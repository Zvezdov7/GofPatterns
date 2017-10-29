package ru.zvezdov.GofPatterns.behavioral.strategy;

/**
 * @author Dmitry Zvezdov
 *         29.10.2017.
 */
class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int op1, int op2) {
        return  op1 + op2;
    }
}
