package com.abrandonbanti.pruebatecnica.service;

import java.util.List;

import com.abrandonbanti.pruebatecnica.entity.Sucursal;


public interface SucursalService {
	public List<Sucursal> getAllSucursal();
	public Sucursal getSucursalById(Integer id);
	public Sucursal postProduct(Sucursal sucursal);

}
