package by.academy.it.task02individual.task70;

import by.academy.it.task02individual.task70.logic.ReflectionWorker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create a class Man with an arbitrary set of fields and methods (at least 3).
 * Create a method that will print information about the class using reflection.
 * Call a method using reflection from the main program.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String EXECUTE_METHOD_NAME = "execute";

    public static void main(String[] args) {
        ReflectionWorker worker = ReflectionWorker.getInstance();
        Class workerClass = worker.getClass();
        Method[] methods = workerClass.getDeclaredMethods();
        for (Method method : methods) {
            if (EXECUTE_METHOD_NAME.equals(method.getName())) {
                try {
                    method.invoke(worker);
                } catch (InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}
