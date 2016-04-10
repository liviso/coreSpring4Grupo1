package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest2 {

	private static ApplicationContext factory;

	@BeforeClass
	public static void beforeClass() {
		String ruta = "spring/practica2/beans.xml";
		factory = new ClassPathXmlApplicationContext(ruta);

		Assert.assertNotNull(factory);
	}

	@Test
	public void holaMundoSpringTest2() {
		log.info("holaMundoSpringTest2 -------------------------");

		HolaMundo hola = (HolaMundo) factory.getBean("holaMundoBean2");

		HolaMundo hola2 = (HolaMundo) factory.getBean("holaMundoBean2");

		HolaMundo hola3 = (HolaMundo) factory.getBean("holaMundoBean2");

		Assert.assertNotNull(hola);
		Assert.assertNotNull(hola2);
		Assert.assertNotNull(hola3);

		Assert.assertSame(hola, hola2);
		Assert.assertSame(hola2, hola3);
		Assert.assertSame(hola, hola3);

		log.info("{}", hola);

	}
}
