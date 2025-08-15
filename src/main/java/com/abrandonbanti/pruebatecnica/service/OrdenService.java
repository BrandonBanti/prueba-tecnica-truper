package com.abrandonbanti.pruebatecnica.service;

import java.util.List;

import com.abrandonbanti.pruebatecnica.entity.Orden;



public interface OrdenService {
	public List<Orden> getAllOrden();
	public Orden getOrdenById(Integer id);
	public Orden postOrden(Orden orden);
}
