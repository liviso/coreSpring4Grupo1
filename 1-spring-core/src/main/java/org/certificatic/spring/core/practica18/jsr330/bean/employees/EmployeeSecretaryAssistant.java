package org.certificatic.spring.core.practica18.jsr330.bean.employees;

import javax.inject.Named;
import javax.inject.Singleton;

import org.certificatic.spring.core.practica18.jsr330.bean.Employee;

@Named("secretaryAssistantEmployee")
@Singleton
public class EmployeeSecretaryAssistant extends Employee {

	public EmployeeSecretaryAssistant() {
		this.name = "Alejandra Moras";
		this.dni = "AA-BB-CC-DD";
	}
}
