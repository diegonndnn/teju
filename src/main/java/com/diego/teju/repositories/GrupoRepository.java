package com.diego.teju.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.teju.domain.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Integer> {

}
