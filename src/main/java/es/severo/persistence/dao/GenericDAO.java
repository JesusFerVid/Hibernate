package es.severo.persistence.dao;

import java.util.Optional;

public interface GenericDAO<T> {
	void create(T entity);
	void save(T entity);
	void delete(T entity);
	void deleteById(Long id);
	Optional<T> findById(Long id);
}
