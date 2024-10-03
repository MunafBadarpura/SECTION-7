package org.example;

/*
application context
xml config
how objects create
scope -> singleton(default), prototype
setter injection -> setter injection call first setter so we have compulsory setter method
ref attributes
constructor injection
Autowiring -> byName, byType, Primary bean, explicit mention(highest priority)
lazy init -> it will only create a object when we need
inner bean
*
* */



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Alien obj = (Alien) context.getBean("alien");
        // Alien obj = (Alien) context.getBean("alien", Alien.class);

        //System.out.pr intln(obj.getAge());
        //obj.getS().read();
        obj.code();
        System.out.println(obj.getAge());


//        Desktop des = context.getBean(Desktop.class);

    }
}
