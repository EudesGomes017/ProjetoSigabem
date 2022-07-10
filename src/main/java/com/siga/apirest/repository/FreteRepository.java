package com.siga.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siga.apirest.models.FreteEntitiy;

public interface FreteRepository extends JpaRepository<FreteEntitiy, Long> {

	FreteEntitiy findById(long id);
}
