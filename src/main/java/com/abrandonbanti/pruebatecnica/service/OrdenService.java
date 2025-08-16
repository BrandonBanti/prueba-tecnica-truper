package com.abrandonbanti.pruebatecnica.service;

import java.util.List;

import com.abrandonbanti.pruebatecnica.dto.OrdenRequestDTO;
import com.abrandonbanti.pruebatecnica.entity.Orden;

/**
 * Servicio para gestionar Ordenes.
 * @author Brandon Banti
 * @version 1.0
 */

public interface OrdenService {
	public List<Orden> getAllOrden();
	public Orden getOrdenById(Integer id);
	public Orden postOrden(OrdenRequestDTO ordenRequestDTO);
}
