package tn.esprit.springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Skieur;
@Repository
public interface ISkieurRepository extends CrudRepository<Skieur, Long> {
}
