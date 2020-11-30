package fr.training.spring;

public class Musicien {

	private final String morceau;

	private final Saxophone instrument;

	public Musicien(final String morceau) {
		this.morceau = morceau;
		instrument = new Saxophone();
	}

	public void joue() {
		System.out.println("Le musicien joue " + morceau);
		instrument.jouer();
	}
}
