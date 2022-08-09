package br.ufc.mandacaru5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.mandacaru5.model.Property;

public interface FeedbackRepository extends JpaRepository<Property, Integer> {

	List<Property> findByProductId(int id);
}
