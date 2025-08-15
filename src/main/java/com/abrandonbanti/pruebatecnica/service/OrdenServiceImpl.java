package com.abrandonbanti.pruebatecnica.service;

import java.util.List;
import java.util.Optional;

import com.abrandonbanti.pruebatecnica.entity.Orden;
import com.abrandonbanti.pruebatecnica.entity.Sucursal;
import com.abrandonbanti.pruebatecnica.repository.OrdenRepository;
import com.abrandonbanti.pruebatecnica.repository.ProductoRepository;

public class OrdenServiceImpl implements OrdenService {
	
	private OrdenRepository ordenRepository;
	private ProductoService productoService;
	private SucursalService sucursalService;
	
	public OrdenServiceImpl(OrdenRepository ordenRepository,
			ProductoService productoService,
			SucursalService sucursalService) {
		this.ordenRepository = ordenRepository;
		this.productoService = productoService;
		this.sucursalService = sucursalService;
	}

	@Override
	public List<Orden> getAllOrden() {
		return ordenRepository.findAll();
	}

	@Override
	public Orden getOrdenById(Integer id) {
		Optional<Orden> ordenOptional = ordenRepository.findById(id);
		if(ordenOptional.isPresent()) {
			return ordenOptional.get();
		}
		
		throw new IllegalArgumentException("No existe la orden");
	}

	@Override
	public Orden postOrden(Orden orden) {
		//Validar Sucursal
		Sucursal sucursal = sucursalService.getSucursalById(orden.getSucursal().getId());
		
		//Validar productos
		if(orden.getProductos().isEmpty()) {
			throw new IllegalArgumentException("No hay productos");
		}
		
		//Crear Orden
		
		
		
		return null;
	}

}
