package fr.training.spring;

public class Piano implements Instrument {

	@Override
	public void jouer() {
		System.out.println("PLING PLING PLING");
	}

}
