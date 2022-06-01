package com.bruna.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
