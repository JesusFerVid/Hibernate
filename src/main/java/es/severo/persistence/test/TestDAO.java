package es.severo.persistence.test;

import es.severo.persistence.dao.PersonaDAO;
import es.severo.persistence.dao.PersonaDAOImpl;
import es.severo.persistence.entity.Persona;

public class TestDAO {
	public static void main(String[] args) {
		PersonaDAO genericDAO = new PersonaDAOImpl();
		genericDAO.create(new Persona("Rubén"));
	}
}
