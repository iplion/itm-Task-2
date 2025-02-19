import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(helloBean1.equals(helloBean2));
        System.out.println(cat1.equals(cat2));

        System.out.println(helloBean1.getMessage());
    }
}