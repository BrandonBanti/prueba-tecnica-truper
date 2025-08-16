package com.abrandonbanti.pruebatecnica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abrandonbanti.pruebatecnica.entity.Sucursal;
import com.abrandonbanti.pruebatecnica.repository.SucursalRepository;

/**
 * Implementación del servicio de sucursal.
 * @author Brandon Banti
 * @version 1.0
 */

@Service
public class SucursalServiceImpl implements SucursalService {

	private SucursalRepository sucursalRepository;
	
	public SucursalServiceImpl(SucursalRepository sucursalRepository) {
		this.sucursalRepository = sucursalRepository;
	}
	
	@Override
	public List<Sucursal> getAllSucursal() {
		return sucursalRepository.findAll();
	}

	@Override
	public Sucursal postProduct(Sucursal sucursal) {
		sucursalRepository.save(sucursal);
		return sucursal;
	}

	@Override
	public Sucursal getSucursalById(Integer id) {
		Optional<Sucursal> sucursalOptional = sucursalRepository.findById(id);
		if(sucursalOptional.isPresent()) {
			return sucursalOptional.get();
		}
		
		throw new IllegalArgumentException("No existe la sucursal");
	}

}
