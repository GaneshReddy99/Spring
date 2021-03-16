package com.ltts.DemoSpring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
         Student s=(Student) context.getBean("Stu1");
         System.out.println(s);
    }
}
