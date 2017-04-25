package com.sistema.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.sistema.thymeleaf.processor.OrderElementTagProcessor;
import com.sistema.thymeleaf.processor.PaginationElementTagProcessor;


public class SistemaDialect extends AbstractProcessorDialect {

	public SistemaDialect() {
		super("Sistema Ordem de Serviço", "sistema", StandardDialect.PROCESSOR_PRECEDENCE);
	}
	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		return processadores;
	}
}
