package com.message_App;


import org.springframework.web.bind.annotation.*;

import javax.xml.transform.sax.SAXResult;

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

    @GetMapping("/hello/param/{name}")
    public String greetparam(@PathVariable String name ){
        return "Hello " +name + " from BridgeLabs";
    }

    @PostMapping("/hello/user")
    public String hello(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " +user.getLastName() ;
    }

}
