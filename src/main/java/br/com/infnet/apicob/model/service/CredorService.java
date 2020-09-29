package br.com.infnet.apicob.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.apicob.model.negocio.Credor;
import br.com.infnet.apicob.model.repository.ICredorRepository;

@Service
public class CredorService {

	@Autowired
	private ICredorRepository credorRepository;
	
	public List<Credor> obterLista(){ 
		return credorRepository.findAll(Sort.by(Sort.Direction.ASC, "razaosocial"));
	}
	
	public Credor obterPorId(Integer id) {
		return credorRepository.findById(id).orElse(new Credor(0));
	}
	
	public List<Credor> obterAtivos(){ 
		return credorRepository.obterAtivos();
	}
	
	public void incluir(Credor credor) {
		credorRepository.save(credor);
	}
	
	public void excluir(Integer id) {
		credorRepository.deleteById(id);
	}
	
}
