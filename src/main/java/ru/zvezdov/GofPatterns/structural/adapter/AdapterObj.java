package ru.zvezdov.GofPatterns.structural.adapter;

/**
 * @author Dmitry Zvezdov
 *         05.11.2017.
 */
class AdapterObj implements SystemB {
    private final SysstemA systemA;

    AdapterObj(SysstemA sysstemA) {
        this.systemA = sysstemA;
    }

    @Override
    public void doMethod1A1B() {
        systemA.doMethodA();
    }
}
