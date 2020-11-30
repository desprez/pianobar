package fr.training.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PianoBarAvecInjection {

	public static void main(final String[] args) {

		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		final Performeur musicien = (Performeur) context.getBean("Douglas");
		musicien.perfome();
	}

}
