package com.abrandonbanti.pruebatecnica.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa una respuesta de autentificacion
 * @author Brandon Banti
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	private String token;
}
