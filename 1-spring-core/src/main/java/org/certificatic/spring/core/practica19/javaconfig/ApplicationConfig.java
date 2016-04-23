package org.certificatic.spring.core.practica19.javaconfig;

import org.certificatic.spring.core.practica19.javaconfig.bean.api.IQuadraticEquationService;
import org.certificatic.spring.core.practica19.javaconfig.bean.api.impl.QuadraticEquationServiceImpl;

public class ApplicationConfig {

	public IQuadraticEquationService quadraticService() {
		return new QuadraticEquationServiceImpl();
	}

	public IQuadraticEquationService quadraticService2() {
		return new QuadraticEquationServiceImpl();
	}

	public IQuadraticEquationService quadraticService3() {
		return new QuadraticEquationServiceImpl();
	}

}
