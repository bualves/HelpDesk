package com.bruna.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}
