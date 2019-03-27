package org.fkjava.weixin;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeixinApplication {
  
	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

}
