package org.certificatic.practica1.interfaces.operations.api.impl;

import org.certificatic.practica1.interfaces.operations.api.ICalculator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Calculator implements ICalculator {

	private @Getter(AccessLevel.PROTECTED) @Setter(AccessLevel.PROTECTED) double accumulator;

	@Override
	public void set(double number) {
		this.accumulator = number;
	}

	@Override
	public double result() {
		return accumulator;
	}

}
