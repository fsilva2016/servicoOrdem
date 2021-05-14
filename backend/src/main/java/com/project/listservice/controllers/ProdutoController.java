package com.project.listservice.controllers;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.project.listservice.dto.ProdutoDto;
import com.project.listservice.model.Produto;
import com.project.listservice.services.ProdutoService;

@Controller 
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	
	private String caminhoFoto = "C:\\Users\\Desenvolvimento\\Documents\\ls_fotos\\";
	
	@Autowired
	private ProdutoService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> findAll(){
		
		List<Produto> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "{/id}",method = RequestMethod.GET)
	public ResponseEntity<Produto> findByAll(@PathVariable Long id){
		
		Produto obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = {"multipart/form-data"})
	public ResponseEntity<ProdutoDto> insert(@ModelAttribute Produto obj, @RequestParam("file") MultipartFile file){
		
		
		try {
			if(!file.isEmpty()) {
				byte[] bytes = file.getBytes();
				Path caminho = Paths.get(caminhoFoto + String.valueOf(obj.getNome()) + file.getOriginalFilename());
				Files.write(caminho, bytes);
				
				obj.setFoto(caminhoFoto + String.valueOf(obj.getNome()) + file.getOriginalFilename());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		obj = service.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new ProdutoDto(obj));
		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Produto> update(@PathVariable Long id,@RequestBody Produto obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
	

}
