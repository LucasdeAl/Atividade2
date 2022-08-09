package br.ufc.mandacaru5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.mandacaru5.model.Property;
import br.ufc.mandacaru5.model.User;
import br.ufc.mandacaru5.repository.FeedbackRepository;
import br.ufc.mandacaru5.repository.ProductRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepository;
	
	@Autowired
	ProductRepository productRepository;

	public void update(int id, Property entity) {
		Property property = find(id);		
		property.setTitle(entity.getTitle());
		
		feedbackRepository.save(property);				
	}
	
	public void save(int product_id, Property entity) {
		User user = productRepository.findById(product_id).get();
		entity.setUser(user);
		feedbackRepository.save(entity);				
	}

	public void delete(int id) {
		Property property = find(id);
		feedbackRepository.delete(property);
	}

	public Property find(int id) {
		if (id < 1) {
			return null;
		}

		Optional<Property> property = feedbackRepository.findById(id);

		if (property.isPresent()) {
			return property.get();
		}

		return null;
	}

	public List<Property> findAll(int product_id) {
		return feedbackRepository.findByProductId(product_id);
	}
}
