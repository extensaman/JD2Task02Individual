package by.academy.it.task02individual.task72.entity;

public class Entity {
    public void methodWithoutAnnotation() {
        System.out.println("Method without annotation invoked");
    }

    @AcademyInfo(year = "1992")
    public void method() {
        System.out.println("Method with @AcademyInfo invoked");
    }
}
