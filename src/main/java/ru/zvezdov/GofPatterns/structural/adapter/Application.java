package ru.zvezdov.GofPatterns.structural.adapter;

/**
 * @author Dmitry Zvezdov
 *         05.11.2017.
 */
class Application {
    public static void main(String[] args) {
        SysstemA sysstemA = new SystemAImpl();

        SystemB systemB = new AdapterObj(sysstemA);
        systemB.doMethod1A1B();
    }
}
