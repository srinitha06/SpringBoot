package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext( "resources.xml");
        Student s =(Student) context.getBean("st");
        s.intershipProgram();
        ApplicationContext teacher = new ClassPathXmlApplicationContext( "resources.xml");
        Teacher t =(Teacher) teacher.getBean("te");
        t.Notes();
        ApplicationContext assesment = new ClassPathXmlApplicationContext( "resources.xml");
        Assesment a=(Assesment) assesment.getBean("as");
        a.Score();
        System.out.println( "Hello World!" );

    }
}
