package com.abrandonbanti.pruebatecnica.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abrandonbanti.pruebatecnica.dto.ProductoPrecioResquestDTO;
import com.abrandonbanti.pruebatecnica.entity.Producto;
import com.abrandonbanti.pruebatecnica.service.ProductoService;

@RestController
@RequestMapping("/v1/producto")
public class ProductController {
	
	private ProductoService productoService;
	
	public ProductController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping
	public ResponseEntity<List<Producto>> getAll() {
		return ResponseEntity.ok(productoService.getAllProduct());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(productoService.getProductById(id));
	}
	
	@PostMapping
	public ResponseEntity<Producto> postProduct(@RequestBody Producto product) {
		return ResponseEntity.ok(productoService.postProduct(product));
	}
	
	@PutMapping
	public ResponseEntity<Producto> putProduct(@RequestBody Producto product) {
		return ResponseEntity.ok(productoService.putProduct(product));
	}
	
	@PutMapping("/precio")
	public ResponseEntity<Producto> putProductPrice(@RequestBody ProductoPrecioResquestDTO productPrice) {
		return ResponseEntity.ok(productoService.putProductPrice(productPrice));
	}
}
