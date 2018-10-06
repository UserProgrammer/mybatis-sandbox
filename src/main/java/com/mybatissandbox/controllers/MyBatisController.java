package com.mybatissandbox.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.List;
import com.mybatissandbox.handlers.MyBatisHandler;

@RestController
@RequestMapping("mybatissandbox")
public class MyBatisController {
  private static final Logger logger = LogManager.getLogger(MyBatisController.class);
  MyBatisHandler myBatisHandler;

  @GetMapping
  public List<Integer> getUsers() {
    return myBatisHandler.executeMethodInMyBatis();
  }

  public void setMyBatisHandler(MyBatisHandler myBatisHandler) {
    this.myBatisHandler = myBatisHandler;
  }
}
