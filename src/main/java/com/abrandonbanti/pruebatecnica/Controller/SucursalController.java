package com.abrandonbanti.pruebatecnica.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abrandonbanti.pruebatecnica.entity.Sucursal;
import com.abrandonbanti.pruebatecnica.service.SucursalService;



@RestController
@RequestMapping("/v1/sucursal")
public class SucursalController {
	
	private SucursalService sucursalService;
	
	public SucursalController(SucursalService sucursalService) {
		this.sucursalService = sucursalService;
	}
	
	@GetMapping
	public ResponseEntity<List<Sucursal>> getAll() {
		return ResponseEntity.ok(sucursalService.getAllSucursal());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Sucursal> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(sucursalService.getSucursalById(id));
	}
	
	@PostMapping
	public ResponseEntity<Sucursal> postProduct(@RequestBody Sucursal sucursal) {
		return ResponseEntity.ok(sucursalService.postProduct(sucursal));
	}
	
}
