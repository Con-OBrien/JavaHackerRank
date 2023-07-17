package knowledge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//1. SpringBootApplication - is used to mark main class of Spring Boot application.
// This combines @Configuration, @EnableAutoConfiguration and @ComponentScan.
@SpringBootApplication
public class SpringBootAnnotations {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAnnotations.class);
    }
}

//2. RestController - is used to define a class as REST controller.
// It auto converts returned objects to JSON/XML responses.
@RestController
class MyController {

    //3. RequestMapping - is used to map HTTP requests to controller methods.
    //Specifies URL path and HTTP method for which method should be invoked.
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hey!";
    }

    @RequestMapping(value= "/greet/{name}", method = RequestMethod.GET)
    //4. PathVariable - is used to extract values from URL path and use them as method parameters.
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(value = "/greet", method= RequestMethod.GET)
    //5. RequestParam - is used to extract values rom the request URL and use them as method parameters.
    public String greetParam(@RequestParam("name") String name) {
        return "Hello, " + name + "!";
    }
}

@Service
class MyService {
    //service logic here
}

@RestController
class MyControllerWithService {
    private final MyService myService;

    //7. Autowired - is used for automatic dependency injection.
    // It allows Spring to automatically wire the required beans into the class.
    @Autowired
    public MyControllerWithService(MyService myService) {
        this.myService = myService;
    }
}

//8. Component - Used to mark a class as a Spring component, allowing Spring to auto-detect & register as a bean
@Component
class MyComponent {
    //Component logic
}

//9. Configuration - is used to indicate that a class provides Spring configuration.
// Beans defined within such classes can be registered with the Spring container.
@Configuration
//10. ComponentScan - is used to specify the base packages where Spring should scan for components like '@Component' or '@Service'
@ComponentScan(basePackages = "com.example.myapp")
class MyConfig {
    //11. Bean - is used to declare a method which produces a bean to be managed by the Spring container.
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
//11. RestControllerAdvice - is used to define a class that handles exception handling for multiple controllers.
@RestControllerAdvice
class GlobalExceptionHandler {
    // Exception handling logic goes here
}

class Controller {
    @GetMapping
    //12. ResponseBody - is used to indicate that the return value of a method should be serialized and included in the response body.
    @ResponseBody
    public Map<String, String> getJson() {
        Map<String, String> data = new HashMap<>();
        data.put("message", "Hello, JSON");
        return data;
    }
    //13. Value - is used to inject values from properties files/environment variables into fields within a Spring component.
    @Value("${app.message}")
    private String message;
    private final MyConfig myConfig;

    //14. Qualifier - is used to disambiguate dependency injection when multiple beans of the same type are present.
    // Specifies a particular bean to be injected by matching the bean's name.
    public Controller(@Qualifier("myRepositoryImpl") MyConfig myConfig) {
        this.myConfig = myConfig;
    }
}
