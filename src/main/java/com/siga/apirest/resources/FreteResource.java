package com.siga.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siga.apirest.models.FreteEntitiy;
import com.siga.apirest.repository.FreteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Frete")
@CrossOrigin(origins="*")
public class FreteResource {

	@Autowired
	FreteRepository produtoRepository;
	
	@GetMapping("/Frete")
	@ApiOperation(value="Retorna a lista de todos os produtos")
	public List<FreteEntitiy> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/Frete/{id}")
	@ApiOperation(value="Retorna um Frete por ID")
	public FreteEntitiy listaProdutoUnico(@PathVariable(value="id") long id) {
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/Frete")
	@ApiOperation(value="Salva um Frete")
	public FreteEntitiy salvaProduto(@RequestBody FreteEntitiy produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/Frete")
	@ApiOperation(value="Exclui um Frete")
	public void deletaProduto(@RequestBody FreteEntitiy produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	@ApiOperation(value="Atualiza um Frete")
	public FreteEntitiy atualizaProduto(@RequestBody FreteEntitiy produto) {
		return produtoRepository.save(produto);
	}
}
