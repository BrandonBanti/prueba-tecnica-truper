package com.abrandonbanti.pruebatecnica.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa un Error en el API.
 * @author Brandon Banti
 * @version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
	private int status;
    private String message;
    private String path;
    private Date timestamp;
}
