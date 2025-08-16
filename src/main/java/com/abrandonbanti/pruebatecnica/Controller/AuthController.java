package com.abrandonbanti.pruebatecnica.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import com.abrandonbanti.pruebatecnica.entity.AuthRequest;
import com.abrandonbanti.pruebatecnica.entity.AuthResponse;
import com.abrandonbanti.pruebatecnica.util.JwtUtil;

/**
 * Esta clase representa un controlador para gestionar Seguridad.
 * @version 1.0
 */

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping("/login")
    public ResponseEntity<?> createToken(@RequestBody AuthRequest request) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Credenciales incorrectas", e);
        }

        final String jwt = jwtUtil.generateToken(request.getUsername());
        return ResponseEntity.ok(new AuthResponse(jwt));
    }
}