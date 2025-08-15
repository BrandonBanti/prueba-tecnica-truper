package com.abrandonbanti.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrandonbanti.pruebatecnica.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	List<Producto> findByCodigo(String nombre);
}
