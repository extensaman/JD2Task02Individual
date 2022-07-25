package by.academy.it.task02individual.task70.logic;

import by.academy.it.task02individual.task70.entity.Man;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class ReflectionWorker {

    private static class SingletonHolder {
        private final static ReflectionWorker INSTANCE = new ReflectionWorker();
    }

    public static ReflectionWorker getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void execute() {
        Man man = new Man("Иванов", "Иван", "Иванович", LocalDate.of(1982, 12, 9));
        Class aClass = man.getClass();
        Class superClass = aClass.getSuperclass();
        Method[] methods = aClass.getDeclaredMethods();
        Field[] fields = aClass.getDeclaredFields();
        Class<?>[] interfaces = aClass.getInterfaces();
        Annotation[] annotations = aClass.getDeclaredAnnotations();

        System.out.println("SuperClass name is " + superClass.getSimpleName());

        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println("Field name is " +
                    field.getName() +
                    ", its type is " +
                    field.getType().getSimpleName());
        }

        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("Method name is " + method.getName());
        }

        System.out.println("Interfaces:");
        for (Class interf : interfaces) {
            System.out.println("Interface name is " + interf.getSimpleName());
        }

        System.out.println("Annotations:");
        for (Annotation annotation : annotations) {
            System.out.println("Annotation name is " + annotation.toString());
        }
    }

}
