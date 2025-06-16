package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/* 
@Controller //tells Spring this class contains methods that should respond to web browser requests like(GET,POST, etc.) 
            //also declares this class as a spring MVC Controller
@ResponseBody //sends Hello, World! directly in the browser without looking for a file like hello.jsp or hello.html
*/
@RestController // this is a combination of @controller and @ResponseBody
public class HelloWorldController {
    @GetMapping("/hello-world")   //HTTP Request; we use this annotation to map HTTP GET request onto specific handler method
                                  //http://localhost:8080/hello-world  {So client should use this url to access this HTTP request}
    public String helloWorld(){
        return "Hello World!";
    }

}
