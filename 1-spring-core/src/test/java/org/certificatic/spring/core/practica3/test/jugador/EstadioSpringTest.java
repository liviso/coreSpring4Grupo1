package org.certificatic.spring.core.practica3.test.jugador;

import org.certificatic.spring.core.practica3.jugador.JugadorFutbol;
import org.certificatic.spring.core.practica3.jugador.api.IJugador;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EstadioSpringTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void beforeClass() {
		applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica3/jugador-application-context.xml");
	}

	@Test
	@Ignore
	public void estadioSpringTest1() {

		log.info("estadioSpringTest1 -------------------");

		JugadorFutbol jugador = (JugadorFutbol) applicationContext
				.getBean("jugadorBean");

		Assert.assertNotNull(jugador);

		Assert.assertNotNull(jugador.getPartido());
		Assert.assertNotNull(jugador.getTorneo());
		Assert.assertNotNull(jugador.getTorneo().getEvento());

		jugador.saludar();

		log.info("{}", jugador.getPartido());
		log.info("{}", jugador.getTorneo());
		log.info("{}", jugador.getTorneo().getEvento());
	}

	@Test
	public void estadioSpringTest2() {
		log.info("estadioSpringTest2 -------------------");

		IJugador jugador = (IJugador) applicationContext.getBean("jugadorBean");
		Assert.assertNotNull(jugador);
		jugador.saludar();
	}

}
