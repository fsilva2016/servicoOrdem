package com.project.listservice.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.listservice.model.Produto;
import com.project.listservice.respositories.ProdutoRepository;
import com.project.listservice.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> findAll(){
		return repository.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> obj =  repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Falha na requisição"));
	}
	
	public Produto insert(Produto obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		
			repository.deleteById(id);
			
		}catch(EntityNotFoundException e) {
			throw new ObjectNotFoundException("Falha ao deletar");
		}
	}
	
	public Produto update(Long id, Produto obj) {
		try {
			Produto entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
			
		}catch(EntityNotFoundException e) {
			throw new ObjectNotFoundException("Falha na atualização");
		}
	}

	private void updateData(Produto entity, Produto obj) {
		entity.setNome(obj.getNome());
		entity.setCusto(obj.getCusto());
		entity.setValor_venda(obj.getValor_venda());
		entity.setMargem(obj.getMargem());
		entity.setLucro(obj.getLucro());
		entity.setGarantia(obj.getGarantia());
		entity.setMarca(obj.getMarca());
		entity.setCategoria(obj.getCategoria());
		entity.setEstoque(entity.getEstoque());
		entity.setFoto(obj.getFoto());
		entity.setSituacao(obj.getSituacao());
		
	}
}
