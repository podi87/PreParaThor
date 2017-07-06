package com.greenfox.preparathor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PreParaThorController {

  @RequestMapping(name = "/main")
  public String main(){
    return "mainpage";
  }
}
