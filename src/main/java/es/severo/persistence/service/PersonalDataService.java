package es.severo.persistence.service;

import es.severo.persistence.dao.DireccionDAO;
import es.severo.persistence.dao.DireccionDAOImpl;
import es.severo.persistence.dao.GenericDAO;
import es.severo.persistence.dao.GenericDAOImpl;
import es.severo.persistence.entity.Direccion;
import es.severo.persistence.entity.Persona;
import jakarta.persistence.Tuple;

import java.util.List;
import java.util.Optional;

public class PersonalDataService {
	private final GenericDAO<Persona> genericDAO;
	private final DireccionDAO direccionDAO;

	public PersonalDataService() {
		this.genericDAO = new GenericDAOImpl<>(Persona.class);
		this.direccionDAO = new DireccionDAOImpl();
	}

	public void createPersona(Persona p, List<Direccion> dirs) {
		if (dirs != null) {
			for (Direccion dir : dirs) {
				p.getDirecciones().add(dir);
			}
		}
		genericDAO.create(p);
	}

	public Optional<Persona> buscarPersona(Long id) {
		return genericDAO.findById(id);
	}

	public List<Direccion> getDireccionesByNumber(String number) throws Exception {
		List<Direccion> direcciones = null;
		if (!number.isEmpty()) {
			direcciones = direccionDAO.findByStreetNumber(number);
			if (direcciones == null || direcciones.isEmpty()){
				throw new Exception("No hay direcciones con ese número");
			}
		} else {
			throw new Exception("No se ha introducido un número");
		}
		return direcciones;
	}

	public List<Tuple> getDireccionesByNumberTuple(String number) throws Exception {
		List<Tuple> direcciones;
		if (!number.isEmpty()) {
			direcciones = direccionDAO.findAllStreetNameAndIdByNumberTuple(number);
			if (direcciones == null || direcciones.isEmpty()){
				throw new Exception("No hay direcciones con ese número");
			}
		} else {
			throw new Exception("No se ha introducido un número");
		}
		return direcciones;
	}
}
