package com.sistema.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.model.Cliente;
import com.sistema.repository.Clientes;
import com.sistema.service.exception.CpfCnpfClienteJaCadastradoException;

@Service
public class CadastroClienteService {

	@Autowired
	private Clientes clientes;
	
	public void salvar(Cliente cliente) {
		Optional<Cliente> clienteExistente = clientes.findByCpfOuCnpj(cliente.getCpfOuCnpj());
		
		if(clienteExistente.isPresent()) {
			throw new CpfCnpfClienteJaCadastradoException("CPF/CNPJ já cadastrado");
		}
		
		clientes.save(cliente);
	}
}
