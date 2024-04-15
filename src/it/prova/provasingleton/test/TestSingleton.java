package it.prova.provasingleton.test;

import it.prova.provasingleton.model.SingletonEsempio;

public class TestSingleton {

	public static void main(String[] args) {

		SingletonEsempio.getInstance().helloWorld();

		System.out.println(SingletonEsempio.getInstance().equals(SingletonEsempio.getInstance()));
	}

}
