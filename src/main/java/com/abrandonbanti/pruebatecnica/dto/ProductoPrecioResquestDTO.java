package com.abrandonbanti.pruebatecnica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoPrecioResquestDTO {

	private String codigo;
	private Double precio;

}
