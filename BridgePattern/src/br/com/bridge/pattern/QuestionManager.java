package br.com.bridge.pattern;

public class QuestionManager {
	
	// UTILIZOU A INTERFACE QUESTION E PODE SE USAR QUALQUER NOME "q"
	protected Question q;
	public String catalog;
	
	// CONSTRUTOR VAZIO
	public QuestionManager (String catalog) {
		this.catalog = catalog;
	}
	
	public void next() {
		q.nextQuestion();
	}

	public void previous() {
		q.previousQuestion();
	}

	public void newOne(String quest) {
		q.newQuestion(quest);
	}

	public void delete(String quest) {
		q.deleteQuestion(quest);
	}

	public void display() {
		q.displayQuestion();
	}

	public void displayAll() {
		System.out.println("\n <<<|||### Question Paper:" + catalog);
		q.displayAllQuestions();
	}
}

