package com.abrandonbanti.pruebatecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrandonbanti.pruebatecnica.entity.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{

}
