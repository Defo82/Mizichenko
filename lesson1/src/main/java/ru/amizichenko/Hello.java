package ru.amizichenko;
import java.io.PrintStream;

public class Hello {
	public static void main(String[] args)
            throws java.io.UnsupportedEncodingException {
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		System.out.println("Привет мир. ");
	}
}
