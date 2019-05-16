package hello;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {

        // get a logger instance named com.foo.Bar
        Logger barlogger = Logger.getLogger(HelloController.class);
        barlogger.warn("Warning from HelloController.");
        barlogger.debug("Debug from HelloController.");

        return "Greetings from Spring Boot HelloController!";
    }
    
}
