package com.abrandonbanti.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa un Producto en el sistema.
 * @author Brandon Banti
 * @version 1.0
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 20)
	private String codigo;
	
	@Column(nullable = false, length = 200)
	private String descripcion;
	
	@Column(nullable = false)
	private Double precio;
	
	@ManyToOne
    @JoinColumn(name = "idOrden")
    @JsonBackReference
	private Orden orden;
}
