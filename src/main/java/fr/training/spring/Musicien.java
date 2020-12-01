package fr.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Douglas")
public class Musicien implements Performeur {

	private String morceau;

	@Autowired
	private Instrument instrument;

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
