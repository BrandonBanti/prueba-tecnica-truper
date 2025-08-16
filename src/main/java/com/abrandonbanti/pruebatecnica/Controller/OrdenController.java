package com.abrandonbanti.pruebatecnica.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abrandonbanti.pruebatecnica.dto.OrdenRequestDTO;
import com.abrandonbanti.pruebatecnica.entity.Orden;
import com.abrandonbanti.pruebatecnica.service.OrdenService;

/**
 * Esta clase representa un controlador para gestionar Ordenes.
 * @author Brandon Banti
 * @version 1.0
 */

@RestController
@RequestMapping("/v1/orden")
public class OrdenController {
	
	private OrdenService ordenService;
	
	public OrdenController(OrdenService ordenService) {
		this.ordenService = ordenService;
	}
	
	@GetMapping
	public ResponseEntity<List<Orden>> getAll() {
		return ResponseEntity.ok(ordenService.getAllOrden());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Orden> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(ordenService.getOrdenById(id));
	}
	
	@PostMapping
	public ResponseEntity<Orden> postProduct(@RequestBody OrdenRequestDTO ordenRequestDTO) {
		return ResponseEntity.ok(ordenService.postOrden(ordenRequestDTO));
	}
}
