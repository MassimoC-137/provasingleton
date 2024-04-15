package it.prova.provasingleton.model;

public class SingletonEsempio {

	private static SingletonEsempio istanza; 
	
	public static SingletonEsempio getInstance() {
		
		if (istanza == null) {
			
			istanza = new SingletonEsempio(); 
		}
		
		return istanza; 	
	}
	public void helloWorld() {
		
		System.out.println("Hello World");
	}
}
