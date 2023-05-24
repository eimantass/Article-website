package lt.codeacademy.learn.naujienos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.codeacademy.learn.naujienos.entities.Straipsnis;
import lt.codeacademy.learn.naujienos.repository.StraipsnisRep;

@Service
public class StraipsnisService {
	@Autowired
	StraipsnisRep straipsnisRep;

	public Iterable<Straipsnis> findAll() {
		return straipsnisRep.findAll();
	}
	public Straipsnis findById(long id) {
	return straipsnisRep.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	}
	public void saveAll(List<Straipsnis> list) {
		straipsnisRep.saveAll(list);
	}
	public Straipsnis save(Straipsnis straipsnis) {
		System.out.println("From Service" + straipsnis);
		return straipsnisRep.save(straipsnis);
	}
	public void delete(Straipsnis straipsnis) {
		straipsnisRep.delete(straipsnis);
	}
	public void delete(long id) {
		straipsnisRep.deleteById(id);
	}
}
