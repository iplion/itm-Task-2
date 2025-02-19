import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");

        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getNewCat() {
        Cat cat = new Cat();
        Random rand = new Random();
        int catAge = rand.nextInt(10);
        cat.setName("Cat " + catAge);
        cat.setAge(catAge);

        return cat;
    }
}