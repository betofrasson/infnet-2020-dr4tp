package br.com.infnet.apicob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.apicob.model.negocio.Credor;
import br.com.infnet.apicob.model.service.CredorService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/credor")
public class CredorController {

	@Autowired 
	private CredorService credorService;

	@ApiOperation(value = "Retornar uma lista de credores")
	@GetMapping(value = "/lista")
	public List<Credor> obterLista(){ 
		return credorService.obterLista();
	}
	
	@ApiOperation(value = "Retornar uma lista de credores ativos")
	@GetMapping(value = "/ativos")
	public List<Credor> obterAtivos(){ 
		return credorService.obterAtivos();
	}
	
	@ApiOperation(value = "Retornar um credor pelo código")
	@GetMapping(value = "{id}")
	public Credor obterPorId(@PathVariable Integer id) {
		return credorService.obterPorId(id);
	}
	
	@ApiOperation(value = "Cadastrar um novo credor")
	@PostMapping(value = "incluir")
	public void incluir(@RequestBody Credor credor) {
		credorService.incluir(credor);
	}
	
	@ApiOperation(value = "Excluir um credor")
	@DeleteMapping(value = "{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		credorService.excluir(id);
	}

}
