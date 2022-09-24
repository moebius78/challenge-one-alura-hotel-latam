package com.alura.hotel.controller;


import java.util.List;

import com.alura.hotel.dao.HuespedDAO;
import com.alura.hotel.factory.ConnectionFactory;
import com.alura.hotel.modelo.Huesped;

public class HuespedController {
	private HuespedDAO huespedDAO;
	
	public HuespedController() {
		var factory = new ConnectionFactory();
		this.huespedDAO = new HuespedDAO(factory.recuperaConexion());
	}
	
	
	 public int modificar(String nombre, String apellido, String fechaNacimiento, String nacionalidad, String telefono, Integer id) {
	        return huespedDAO.modificar(nombre, apellido, fechaNacimiento, nacionalidad, telefono, id);
	    }
	
	public void guardar(Huesped huesped) {
		this.huespedDAO.guardar(huesped);
	}
	
	public List<Huesped> listar() {
	    return huespedDAO.listar();
	}

	public int eliminar(Integer id) {
	    return huespedDAO.eliminar(id);
	}
	
	public List<Huesped> buscarHuesped(String lastname) {
	    return huespedDAO.buscarHuesped(lastname);
	}

}
