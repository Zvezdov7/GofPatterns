package ru.zvezdov.GofPatterns.behavioral.strategy;

/**
 *
 * Класс, содержащий стратегию
 *
 * @author Dmitry Zvezdov
 *         29.10.2017.
 */
class Context {
    private Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    int executeStrategy(int op1, int op2) {
        return strategy.execute(op1, op2);
    }
}
