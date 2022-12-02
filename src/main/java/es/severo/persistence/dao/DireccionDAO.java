package es.severo.persistence.dao;

import es.severo.persistence.dto.DireccionWrapper;
import es.severo.persistence.entity.Direccion;
import jakarta.persistence.Tuple;

import java.util.List;

public interface DireccionDAO extends GenericDAO<Direccion> {
	List<Direccion> findByStreetNumber(String number);
	List<String> findAllStreetNameByNumber(String number);
	List<Object[]> findAllStreetNameAndIdByNumberObject(String number);
	List<Tuple> findAllStreetNameAndIdByNumberTuple(String number);
	List<DireccionWrapper> findAllStreetNameAndIdByNumberWrapper(String number);
}
