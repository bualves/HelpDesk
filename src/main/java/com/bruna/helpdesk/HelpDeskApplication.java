package com.bruna.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bruna.helpdesk.domain.Chamado;
import com.bruna.helpdesk.domain.Cliente;
import com.bruna.helpdesk.domain.Tecnico;
import com.bruna.helpdesk.domain.enums.Perfil;
import com.bruna.helpdesk.domain.enums.Prioridade;
import com.bruna.helpdesk.domain.enums.Status;
import com.bruna.helpdesk.repositories.ChamadoRepository;
import com.bruna.helpdesk.repositories.ClienteRepository;
import com.bruna.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpDeskApplication implements CommandLineRunner{
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null,"Bruna", "46112992876", "bu.alves.azevedo@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "João", "12345678996", "joao.azevedo@gmail.com", "1234");		
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
