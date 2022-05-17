package br.com.mediator.pattern;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ChatRoomImp implements ChatRoom {
	
	DateFormat dateFormat = new SimpleDateFormat ("E dd-MM-yyyy hh:mm a");
	Date date  = new Date();
	
	public void showMsg(String msg, Participant p) {
		System.out.println(p.getName() + " \n- Gets Message: " + msg);
		System.out.println("\t\t\t\t" + "["+ dateFormat.format(date).toString() + "]");
	}
	
}
