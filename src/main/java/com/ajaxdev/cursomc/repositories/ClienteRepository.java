package com.ajaxdev.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajaxdev.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
