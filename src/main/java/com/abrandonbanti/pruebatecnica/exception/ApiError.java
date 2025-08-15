package com.abrandonbanti.pruebatecnica.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
	private int status;
    private String message;
    private String path;
    private Date timestamp;
}
