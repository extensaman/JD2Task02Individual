package by.academy.it.task02individual.task71;

import by.academy.it.task02individual.task71.entity.Entity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create a class with a printHelloWorld() method. Call a method using
 * reflection from the main program.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String METHOD_NAME = "printHelloWorld";

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class aClass = Entity.class;
        Method method = aClass.getDeclaredMethod(METHOD_NAME);
        method.invoke(null);
    }
}
