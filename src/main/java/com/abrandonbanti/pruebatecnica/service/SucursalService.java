package com.abrandonbanti.pruebatecnica.service;

import java.util.List;

import com.abrandonbanti.pruebatecnica.entity.Sucursal;

/**
 * Servicio para gestionar Sucursal.
 * @author Brandon Banti
 * @version 1.0
 */

public interface SucursalService {
	public List<Sucursal> getAllSucursal();
	public Sucursal getSucursalById(Integer id);
	public Sucursal postProduct(Sucursal sucursal);

}
