package com.tutorialspoint.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import java.util.logging.Logger;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
   @ManagedProperty(value = "#{message}")
   private Message messageBean;
   
   private String message;
   private int count;
   
   Logger logger = Logger.getLogger(getClass().getName());


   public int getCount() {
      return count;
   }

   public void setCount(int count) {
      this.count = count;
   }

   public HelloWorld() {
      logger.info("HelloWorld started!");
   }

   public String getMessage() {
      
      if(messageBean != null) {
         message = messageBean.getMessage();
      }       
      return message;
   }
   
   public void setMessageBean(Message message) {
      this.messageBean = message;
   }

   // public String getMessage() {
   //    this.setCount(getCount() + 1);
   //    return "Hello World! " + this.getCount();
   // }
}