package org.certificatic.spring.core.practica15.autowired.properties.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Reporter {

	@Autowired
	@Qualifier("reporterName")
	private @Setter(AccessLevel.NONE) String name;

	@Autowired
	private @Setter(AccessLevel.NONE) Integer age;

	@Autowired(required = false)
	@Qualifier("reporterDNI")
	private @Setter(AccessLevel.NONE) String dni;

	@Autowired
	private @Setter(AccessLevel.NONE) Booklet notebook;

	@Autowired
	private @Setter(AccessLevel.NONE) Pencil pen;

}
