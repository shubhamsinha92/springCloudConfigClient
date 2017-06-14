package com.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shubhamsinha on 6/13/17.
 */
@RefreshScope
@RestController
public class MessageController {

  @Value("${person.firstName}")
  private String message;

  @RequestMapping("/message")
  public String getMessage() {
    return this.message;
  }
}
