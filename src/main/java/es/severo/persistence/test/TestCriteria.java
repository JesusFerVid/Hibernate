package es.severo.persistence.test;

import es.severo.persistence.service.PersonalDataService;
import jakarta.persistence.Tuple;

import java.util.List;

public class TestCriteria {
	public static void main(String[] args) {
		PersonalDataService pds = new PersonalDataService();
		try {
			List<Tuple> direcciones = pds.getDireccionesByNumberTuple("6A");
			for (Tuple tupla : direcciones) {
				System.out.println((Long) tupla.get(0));
				System.out.println(tupla.get(1));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
