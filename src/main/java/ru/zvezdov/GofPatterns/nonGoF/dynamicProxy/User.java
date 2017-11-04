package ru.zvezdov.GofPatterns.nonGoF.dynamicProxy;

/**
 * @author Dmitry Zvezdov
 *         04.11.2017.
 */
interface User {
    Long getId();
    String getName();
    String rename(String newName);
}
