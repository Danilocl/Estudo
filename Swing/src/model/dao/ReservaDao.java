package model.dao;

import model.Reservas;

public class ReservaDao extends DaoGeneric<Reservas> {

	private static ReservaDao instancia;

	private ReservaDao() {
		super();
	}

	public static ReservaDao getInstancia() {

		if (instancia == null) {
			instancia = new ReservaDao();
			return instancia;
		} else {
			return instancia;
		}

	}
	
	

}
