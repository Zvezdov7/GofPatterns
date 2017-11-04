package ru.zvezdov.GofPatterns.nonGoF.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Dmitry Zvezdov
 *         04.11.2017.
 */
class Application {
    public static void main(String[] args) {
        User user = new SystemUser(1l, "Mike");
        InvocationHandler handler = new MyOwnMethodInvocationHandler(user);
        User proxyUser = (User) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), handler);
        proxyUser.getId();
        proxyUser.rename("Willy");
        System.out.println(proxyUser.getName());
    }
}
