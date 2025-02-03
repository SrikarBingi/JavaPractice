package com.annotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.annotationDemo");
        Address address = (Address) applicationContext.getBean("address");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getAddress().equals(address));
    } 
}
