package br.edu.ifms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.entities.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

}