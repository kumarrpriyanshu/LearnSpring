package SpringHandson.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        MemberShip m1= (MemberShip) context.getBean("membership");
        System.out.println(m1.toString());
        
    }
}
