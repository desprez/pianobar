package fr.training.spring;

public class Saxophone implements Instrument {

	/* (non-Javadoc)
	 * @see fr.training.spring.Instrument#jouer()
	 */
	@Override
	public void jouer() {
		System.out.println("TOOT TOOT TOOT");
	}

}
