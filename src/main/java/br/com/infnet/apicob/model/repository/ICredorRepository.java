package br.com.infnet.apicob.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.apicob.model.negocio.Credor;

@Repository
public interface ICredorRepository extends CrudRepository<Credor, Integer> {

	List<Credor> findAll(Sort by);
	
	@Query("from Credor where ativo=true")
	List<Credor> obterAtivos();
}
