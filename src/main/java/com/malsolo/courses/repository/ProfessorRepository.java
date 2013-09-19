package com.malsolo.courses.repository;
import com.malsolo.courses.domain.Professor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Professor.class)
public interface ProfessorRepository {
}
