package br.com.mediator.pattern;

public class DemoMediatorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom chat = new ChatRoomImp();
		User1 u1 = new User1(chat);
		u1.setname("Kleyton");
		u1.sendMsg("Olá Kleyton. Como vai a aula? ");
		
		User2 u2 = new User2(chat);
		u2.setname("Aluno Expert!");
		u2.sendMsg("Maravilhosa. O que mais para Aprender? ");
		
	}

}
