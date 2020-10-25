package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.OrdemServico;
import com.services.OrdemServicoService;

@RestController
public class OrdemServicoController {
	
	//OrdemServicoService oSService= new OrdemServicoService();
	@Autowired
	OrdemServicoService oSService;
	
	@GetMapping("/listar-os")
	public List<OrdemServico> listarOS(){
		List<OrdemServico> ordens= new ArrayList<OrdemServico>();
		
		ordens= oSService.listarOS();
		
		return ordens;
	}
	
	@GetMapping("/buscar-os/{id}")
	public OrdemServico buscarOS(@PathVariable Long id) {
		return oSService.buscarOS(id);		
	}
	
	@PostMapping("/criar-os")
	public OrdemServico criarOS(@RequestBody OrdemServico ordemServico) {		
		OrdemServico oSRetorno= new OrdemServico();
		
		//System.out.println(ordemServico.getNomeCliente());
		
		oSRetorno= oSService.criarOS(ordemServico);
		
		return oSRetorno;
	}
	
	@PutMapping("/editar-os")
	public OrdemServico editarOS(@RequestBody OrdemServico ordemServico) {
		OrdemServico oSRetorno= new OrdemServico();
		
		oSRetorno= oSService.criarOS(ordemServico);
		
		return oSRetorno;
	}

}
