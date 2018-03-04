package com.iqmsoft.app.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HelloWorldController {

  @RequestMapping(Array("/scala"))
  def showHello = "hello"

}

