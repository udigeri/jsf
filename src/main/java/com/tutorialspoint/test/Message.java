package com.tutorialspoint.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {
   private String msg = "Hello World!";
	
   public String getMessage() {
      return msg;
   }
   public void setMessage(String message) {
      this.msg = message;
   }
}