package nosk.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionApplication.class, args);
    }

    @GetMapping(value = "/ping")
    public Customer ping(){
        return new Customer("Abc", "123");
    }
    @GetMapping(value = "/hello/{name}")
    public Hello sayHello(@PathVariable String name){
        return new Hello("Hi"+name);
    }
    @GetMapping(value = "/hi")
    public Hello sayHii(@RequestParam String name, @RequestParam String age){
        return new Hello("Hi"+name+","+age);
    }
}
record Customer(
        String name,
        String age
){}
record Hello(
        String message
){}

