package org.certificatic.spring.core.practica4.test.movies;

import org.certificatic.spring.core.practica4.movies.MovieListener;
import org.certificatic.spring.core.practica4.movies.model.Movie;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoviesSpringTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void beforeClass() {
		applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica4/movies-application-context.xml");
	}

	@Test
	public void moviesSpringTest() {

		log.info("moviesSpringTest -------------------");

		MovieListener movieListener = applicationContext
				.getBean(MovieListener.class);

		Assert.assertNotNull(movieListener);

		String pelicula = "Diamantes de Sangre";

		Movie movie = movieListener.buscarPlicula(pelicula);

		Assert.assertEquals(pelicula, movie.getTitulo());

		log.info("{}", movie);

	}
}
