package com.abrandonbanti.pruebatecnica.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.abrandonbanti.pruebatecnica.entity.Orden;

/**
 * Esta clase representa un repositorio genérico para operaciones CRUD de una Orden
 *
 * @param <Orden> Entidad que gestiona.
 * @author Brandon Banti
 * @version 1.0
 */

public interface OrdenRepository extends JpaRepository<Orden, Integer>{
	
}
