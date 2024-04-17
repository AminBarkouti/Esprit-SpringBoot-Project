package tn.esprit.springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Inscription;
@Repository
public interface IInscriptionRepository extends CrudRepository<Inscription, Long> {
}
