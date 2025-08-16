package com.abrandonbanti.pruebatecnica.dto;

import java.util.List;

import com.abrandonbanti.pruebatecnica.entity.Producto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase DTO para representar la información enviada para generar una Orden.
 * Esta clase se utiliza para transferir datos entre diferentes capas de la aplicación.
 * @author Brandon Banti
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenRequestDTO {
	private Integer idSucursal;
	private Double total;
	private List<Producto> listaProductos;
	
}
