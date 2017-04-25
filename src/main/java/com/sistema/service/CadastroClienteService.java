package com.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.model.Cliente;
import com.sistema.repository.Clientes;

@Service
public class CadastroClienteService {

	@Autowired
	private Clientes clientes;
	
	public void salvar(Cliente cliente) {
		clientes.save(cliente);
	}
}
