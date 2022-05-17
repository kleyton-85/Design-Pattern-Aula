package br.com.mediator.pattern;

public class User2 extends Participant {

	private String name;
	private ChatRoom chat;
	
	@Override
	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		chat.showMsg(msg, this);
	}

	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name= name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public User2(ChatRoom chat) {
		this.chat = chat;
	}


}
