package org.certificatic.spring.core.practica19.javaconfig.bean;

import org.certificatic.spring.core.practica19.javaconfig.bean.api.IQuadraticEquationService;
import org.certificatic.spring.core.practica19.javaconfig.bean.api.QuadraticEquationResult;

public class QuadraticEquation {

	public enum QuadraticEquationValue {
		Ax2, Bx, C
	}

	private double a;
	private double b;
	private double c;

	private IQuadraticEquationService quadraticService;

	public void setValue(double value, QuadraticEquationValue type) {
		switch (type) {
		case Ax2:
			this.a = value;
			break;
		case Bx:
			this.b = value;
			break;
		case C:
			this.c = value;
			break;

		default:
			break;
		}
	}

	public QuadraticEquationResult solve() {
		return this.quadraticService.solve(this.a, this.b, this.c);
	}

}
