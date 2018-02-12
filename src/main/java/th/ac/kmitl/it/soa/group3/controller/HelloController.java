package th.ac.kmitl.it.soa.group3.controller;

import th.ac.kmitl.it.soa.group3.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {

    private AtomicInteger counter = new AtomicInteger();

    @GetMapping("/hello")
    public Greeting hello(@RequestParam(name = "msg", defaultValue = "Hello, World") String msg) {
        return new Greeting(counter.incrementAndGet(), msg);
    }

}
