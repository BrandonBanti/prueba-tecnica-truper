package com.abrandonbanti.pruebatecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrandonbanti.pruebatecnica.entity.Producto;

/**
 * Esta clase representa un repositorio genérico para operaciones CRUD de un Producto
 *
 * @param <Producto> Entidad que gestiona.
 * @author Brandon Banti
 * @version 1.0
 */

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	List<Producto> findByCodigo(String nombre);
}
