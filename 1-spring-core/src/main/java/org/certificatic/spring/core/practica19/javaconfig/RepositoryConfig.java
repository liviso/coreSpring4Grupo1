package org.certificatic.spring.core.practica19.javaconfig;

import org.certificatic.spring.core.practica19.javaconfig.bean.DummyRepository;

public class RepositoryConfig {

	public DummyRepository dummyRepository(String connectionString) {
		return new DummyRepository(connectionString);
	}

	public DummyRepository dummyRepository2(String connectionString) {
		return new DummyRepository(connectionString);
	}
}
