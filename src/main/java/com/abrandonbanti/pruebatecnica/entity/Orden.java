package com.abrandonbanti.pruebatecnica.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa una Orden en el sistema.
 * @author Brandon Banti
 * @version 1.0
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private Date fecha;
	
	@Column(nullable = false)
	private Double total;
	
	@ManyToOne
	@JoinColumn(name = "idSucursal", nullable = false)
	private Sucursal sucursal;
	
	@OneToMany(mappedBy = "orden")
    @JsonManagedReference
	private List<Producto> productos;
	

}
