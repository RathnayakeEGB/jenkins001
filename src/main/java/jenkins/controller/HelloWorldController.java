package jenkins.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloworld(){

        return "Hi Gihan Your Are a Truly Leader.............";
    }

    @GetMapping("/hello2")
    public String getHelloworld2(){

        return "Hi Gihan Your Are a Truly Leader.............2";
    }
    @GetMapping("/hello3")
    public String getHelloworld23(){

        return "Hi Gihan Your Are a Truly Leader.............23";
    }
}
