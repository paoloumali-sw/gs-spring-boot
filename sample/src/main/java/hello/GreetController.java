package hello;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetController {
    
    @RequestMapping("/greet")
    public String index() {

        // get a logger instance named com.foo.Bar
        Logger barlogger = Logger.getLogger(GreetController.class);
        barlogger.warn("Warning from GreetController");
        barlogger.debug("Debug from GreetController.");

        return "Greetings from Spring Boot GreetController!";
    }
    
}
