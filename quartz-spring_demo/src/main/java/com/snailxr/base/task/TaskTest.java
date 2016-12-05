package com.snailxr.base.task;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

@Component
public class TaskTest {
	public final Logger log = Logger.getLogger(this.getClass());
 
	public void run() {
		for (int i = 0; i < 1; i++) {
			log.info(i+" run......................................" + (new Date()));
		}

	}

	public void run1() {
		for (int i = 0; i < 1; i++) {
			log.info(i+" run1......................................" + (new Date()));
		}
	}
	
	public static void main(String[] args) {
		String c=null;
	    Map<String, Charset> charsets = Charset.availableCharsets();
	    for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
	       System.out.println(entry.getKey());
	    }

	}
}
