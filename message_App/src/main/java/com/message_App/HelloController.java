package com.message_App;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello from BridgeLabs";
    }
    @GetMapping("/hello/querry")
    public String greet(@RequestParam String name ){
        return "Hello " +name + " from BridgeLabs";
    }

   

}
