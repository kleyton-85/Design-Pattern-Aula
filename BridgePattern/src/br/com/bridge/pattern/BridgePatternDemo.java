package br.com.bridge.pattern;

public class BridgePatternDemo {

	public static void main(String[] args) {
		QuestionFormat questions = new QuestionFormat (" Java Programming Language! ###|||>>>");
		questions.q = new JavaQuestions();
		questions.delete("  --> What is Class? ");
		questions.display();
		questions.newOne("  --> What is Inheritance? ");
		
		questions.newOne("  --> How many types of Inheritance are there in Java? ");
		questions.displayAll();

	}

}
