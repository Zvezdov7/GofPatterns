package ru.zvezdov.GofPatterns.nonGoF.dynamicProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Dmitry Zvezdov
 *         04.11.2017.
 */
class MyOwnMethodInvocationHandler implements InvocationHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyOwnMethodInvocationHandler.class);

    private Object object;

    public MyOwnMethodInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.info(method.getName());
        return method.invoke(object, args);
    }
}
