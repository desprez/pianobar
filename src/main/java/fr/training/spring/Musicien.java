package fr.training.spring;

public class Musicien implements Performeur {

	private String morceau;

	private Instrument instrument;

	/**
	 * @param morceau the morceau to set
	 */
	public void setMorceau(final String morceau) {
		this.morceau = morceau;
	}

	/**
	 * @param instrument the instrument to set
	 */
	public void setInstrument(final Instrument instrument) {
		this.instrument = instrument;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see fr.training.spring.Perfomeur#perfome()
	 */
	@Override
	public void perfome() {
		System.out.println("Le musicien joue " + morceau);
		instrument.jouer();
	}
}
