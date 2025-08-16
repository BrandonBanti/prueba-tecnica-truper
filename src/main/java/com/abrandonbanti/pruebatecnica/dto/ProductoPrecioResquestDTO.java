package com.abrandonbanti.pruebatecnica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase DTO para representar la información enviada para actualizar un Producto.
 * Esta clase se utiliza para transferir datos entre diferentes capas de la aplicación.
 * @author Brandon Banti
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoPrecioResquestDTO {

	private String codigo;
	private Double precio;

}
