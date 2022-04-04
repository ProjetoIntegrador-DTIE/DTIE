package br.com.generation.dtie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.dtie.model.UF;

@Repository
public interface UfRepository extends JpaRepository<UF, Long>{

	public List<UF> findAllByNomeContainingIgnoreCase(String nome);
	public List<UF> findAllBySiglaContainingIgnoreCase(String sigla);
	
}