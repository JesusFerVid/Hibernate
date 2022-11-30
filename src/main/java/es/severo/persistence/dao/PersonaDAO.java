package es.severo.persistence.dao;

import es.severo.persistence.entity.Persona;

import java.util.List;

public interface PersonaDAO extends GenericDAO<Persona> {
	List<Persona> getDireccionesTotales();
}
