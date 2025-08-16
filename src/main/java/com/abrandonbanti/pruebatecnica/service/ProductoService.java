package com.abrandonbanti.pruebatecnica.service;

import java.util.List;

import com.abrandonbanti.pruebatecnica.dto.ProductoPrecioResquestDTO;
import com.abrandonbanti.pruebatecnica.entity.Producto;

/**
 * Servicio para gestionar Producto.
 * @author Brandon Banti
 * @version 1.0
 */

public interface ProductoService {
	
	public List<Producto> getAllProduct();
	public Producto getProductById(Integer id);
	public Producto postProduct(Producto product);
	public Producto putProduct(Producto product);
	public Producto putProductPrice(ProductoPrecioResquestDTO productPrice);

}
