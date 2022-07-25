package by.academy.it.task02individual.task72;

import by.academy.it.task02individual.task72.entity.AcademyInfo;
import by.academy.it.task02individual.task72.entity.Entity;

import java.lang.reflect.Method;

/**
 * Create your own @AcademyInfo annotation with year field.
 * Create a method marked with this annotation with the given year and a method without it.
 * Using reflection, check the presence of this annotation for these methods from the main program.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {
    public static void main(String[] args) {
        Entity entity = new Entity();
        Class aClass = entity.getClass();

        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method name is " + method.getName());
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                AcademyInfo academyInfo = (AcademyInfo) method.getAnnotation(AcademyInfo.class);
                System.out.println("It consists of annotation " + academyInfo.toString() +
                        ", its value is " + academyInfo.year());
            }
        }
    }
}
