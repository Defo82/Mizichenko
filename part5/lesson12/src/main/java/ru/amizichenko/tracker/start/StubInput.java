package ru.amizichenko.tracker.start;

public class StubInput implements Input {
	private String[] answers;
	private int position = 0;
	
	public StubInput(String[] answers) {
			this.answers = answers;
	}
	
	public String ask(String question) {
		System.out.print(question);
		System.out.println(answers[position]);
		return answers[position++];
	}

	public int ask(String question, int[] range) {
		//throw new UnsupportedOperationException("Unsupported operation");
		return -1;
	}
}