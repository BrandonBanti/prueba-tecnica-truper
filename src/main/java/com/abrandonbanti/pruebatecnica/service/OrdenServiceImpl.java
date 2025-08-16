package com.abrandonbanti.pruebatecnica.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.abrandonbanti.pruebatecnica.dto.OrdenRequestDTO;
import com.abrandonbanti.pruebatecnica.entity.Orden;
import com.abrandonbanti.pruebatecnica.entity.Producto;
import com.abrandonbanti.pruebatecnica.entity.Sucursal;
import com.abrandonbanti.pruebatecnica.repository.OrdenRepository;

/**
 * Implementación del servicio de orden.
 * @author Brandon Banti
 * @version 1.0
 */

@Service
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
	@Transactional
	public Orden postOrden(OrdenRequestDTO ordenRequestDTO) {
		//Validar Sucursal
		Sucursal sucursal = sucursalService.getSucursalById(ordenRequestDTO.getIdSucursal());
		
		//Validar productos
		if(ordenRequestDTO.getListaProductos().isEmpty()) {
			throw new IllegalArgumentException("No hay productos");
		}
		
		//Crear Orden
		Orden orden = new Orden();
		orden.setFecha(new Date());
		orden.setTotal(ordenRequestDTO.getTotal());
		orden.setSucursal(sucursal);
		
		
		
		//Guardar Productos
		List<Producto> listaProductos = new ArrayList<>();
		for(Producto producto : ordenRequestDTO.getListaProductos()) {
			producto.setOrden(orden);
			listaProductos.add(productoService.postProduct(producto));
		}
		
		orden.setProductos(listaProductos);		
		
		return ordenRepository.save(orden);
	}

}
