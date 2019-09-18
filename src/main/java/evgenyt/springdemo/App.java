package evgenyt.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sample Hessian client
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Get context
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        // Get hessian bean
        Calculation calculation = (Calculation)context.getBean("calculationBean");
        // Call hessian servlet
        System.out.println(calculation.cube(5));      }
}
