package br.ufc.mandacaru5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.mandacaru5.model.User;
import br.ufc.mandacaru5.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public void save(int id, User entity) {
		if (id != 0) {
			entity.setId(id);
		}

		productRepository.save(entity);
	}

	public void delete(int id) {
		User user = find(id);
		productRepository.delete(user);
	}

	public User find(int id) {
		if (id < 1) {
			return null;
		}

		Optional<User> user = productRepository.findById(id);

		if (user.isPresent()) {
			return user.get();
		}

		return null;
	}

	public List<User> findAll() {
		return productRepository.findAll();
	}

	public User findByName(String str) {
		if (str.length() < 3) {
			return null;
		}

		return productRepository.findFirstByName(str);
	}

}