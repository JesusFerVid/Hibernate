package es.severo.persistence.dao;

import es.severo.persistence.entity.Persona;

import java.util.List;

public class PersonaDAOImpl extends GenericDAOImpl<Persona> implements PersonaDAO {
	public PersonaDAOImpl() {
		super(Persona.class);
	}

	@Override
	public List<Persona> getDireccionesTotales() {
		return null;
	}
}
