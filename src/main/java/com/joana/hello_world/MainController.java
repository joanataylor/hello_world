package com.joana.hello_world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {

  @RequestMapping("/")
  public String index(@RequestParam(value="name", required=false) String searchQuery, @RequestParam(value="last_name", required=false) String searchQuery1) {
    if(searchQuery == null) {
    return "Hello Human";
  } else {
    return "Hello " + searchQuery + "  " + searchQuery1;
  }
}
}
