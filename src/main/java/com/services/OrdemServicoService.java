package com.services;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.OrdemServico;
import com.repositorio.OrdemServicoRepository;

@Service
public class OrdemServicoService {
	@Autowired
	OrdemServicoRepository oSRepository;
	
	public List<OrdemServico> listarOS(){
		List<OrdemServico> ordens= new ArrayList<OrdemServico>();
		
		ordens= oSRepository.findAll();
		
		return ordens;
	}
	
	public OrdemServico buscarOS(Long id) {
		OrdemServico ord= new OrdemServico();
		
		ord= oSRepository.findById(id).get();
		
		return ord;
	}
	
	public OrdemServico criarOS(OrdemServico ordemServico){	
		OrdemServico oS= new OrdemServico();
		
		//System.out.println(ordemServico.getNomeCliente());
		
		ordemServico.setDataCriacao(ZonedDateTime.now());
		
		//System.out.println(ordemServico.getDataCriacao());
		
		oS= oSRepository.save(ordemServico);		
		
		return oS;
	}
	
	public OrdemServico editarOS(OrdemServico ordemServico) {
		OrdemServico oSRetorno= new OrdemServico();
		
		//oSRepository.
		return oSRetorno;
	}
}
