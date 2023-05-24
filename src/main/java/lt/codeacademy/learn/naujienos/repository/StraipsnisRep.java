package lt.codeacademy.learn.naujienos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.codeacademy.learn.naujienos.entities.Straipsnis;

@Repository
public interface StraipsnisRep extends JpaRepository<Straipsnis, Long>{

}
