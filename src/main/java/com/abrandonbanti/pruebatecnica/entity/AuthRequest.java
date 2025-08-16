package com.abrandonbanti.pruebatecnica.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa una solicitud de autentificacion
 * @author Brandon Banti
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {
	private String username;
    private String password;
}
