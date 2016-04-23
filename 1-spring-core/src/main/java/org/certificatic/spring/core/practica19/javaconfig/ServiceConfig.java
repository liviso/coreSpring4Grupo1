package org.certificatic.spring.core.practica19.javaconfig;

import org.certificatic.spring.core.practica19.javaconfig.bean.DummyRepository;
import org.certificatic.spring.core.practica19.javaconfig.bean.DummyService;

public class ServiceConfig {

	public DummyService dummyService(DummyRepository dummyRespository) {
		return new DummyService(dummyRespository);
	}

	public DummyService dummyService2(DummyRepository dummyRespository) {
		return new DummyService(dummyRespository);
	}
}
