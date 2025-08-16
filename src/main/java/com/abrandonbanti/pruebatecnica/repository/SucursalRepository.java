package com.abrandonbanti.pruebatecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrandonbanti.pruebatecnica.entity.Sucursal;

/**
 * Esta clase representa un repositorio genérico para operaciones CRUD de un Sucursal
 *
 * @param <Sucursal> Entidad que gestiona.
 * @author Brandon Banti
 * @version 1.0
 */

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

}
