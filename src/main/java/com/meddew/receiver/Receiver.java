package com.meddew.receiver;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

import com.meddew.message.Email;

@Component
public class Receiver {
	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	public void receiveMessage(Email email) {
	    System.out.println("Received <" + email + ">");
	}
}
