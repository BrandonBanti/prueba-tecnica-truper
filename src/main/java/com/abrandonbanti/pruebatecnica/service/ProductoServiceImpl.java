package com.abrandonbanti.pruebatecnica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abrandonbanti.pruebatecnica.dto.ProductoPrecioResquestDTO;
import com.abrandonbanti.pruebatecnica.entity.Producto;
import com.abrandonbanti.pruebatecnica.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	private ProductoRepository productoRepository;
	
	public ProductoServiceImpl(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}


	@Override
	public List<Producto> getAllProduct() {
		return productoRepository.findAll();
	}

	@Override
	public Producto getProductById(Integer id) {
		Optional<Producto> productOptional = productoRepository.findById(id);
		if(productOptional.isPresent()) {
			return productOptional.get();
		}
		
		throw new IllegalArgumentException("No existe el producto");
	}

	@Override
	public Producto postProduct(Producto product) {
		productoRepository.save(product);
		return product;
	}

	@Override
	public Producto putProduct(Producto product) {
		productoRepository.save(product);
		return product;
	}

	@Override
	public Producto putProductPrice(ProductoPrecioResquestDTO productPrice) {
		List<Producto> productBD = productoRepository.findByCodigo(productPrice.getCodigo());
		if(!productBD.isEmpty())
		{
			Producto product = productBD.get(0);
			product.setPrecio(productPrice.getPrecio());
			productoRepository.save(product);
			return product;
		}
		
		throw new IllegalArgumentException("No existe el Producto");
	}

}
