package org.certificatic.spring.core.practica18.jsr330.bean.employees;

import javax.inject.Named;
import javax.inject.Singleton;

import org.certificatic.spring.core.practica18.jsr330.bean.Employee;

@Named("generalDirectorEmployee")
@Singleton
public class EmployeeGeneralDirector extends Employee {

	public EmployeeGeneralDirector() {
		this.name = "Jorge Garc�a";
		this.dni = "55-66-99-88";
	}
}
