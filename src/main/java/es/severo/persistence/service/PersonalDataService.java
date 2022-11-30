package es.severo.persistence.service;

import es.severo.persistence.dao.GenericDAO;
import es.severo.persistence.dao.GenericDAOImpl;
import es.severo.persistence.entity.Direccion;
import es.severo.persistence.entity.Persona;

import java.util.List;

public class PersonalDataService {
	private final GenericDAO<Persona> genericDAO;

	public PersonalDataService() {
		this.genericDAO = new GenericDAOImpl<>(Persona.class);
	}

	public void createPersona(Persona p, List<Direccion> dirs) {
		if (dirs != null) {
			for (Direccion dir : dirs) {
				p.getDirecciones().add(dir);
			}
		}
		genericDAO.create(p);
	}
}
