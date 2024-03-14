package tn.esprit.springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Piste;
@Repository
public interface IPisteRepository extends CrudRepository<Piste, Long> {
}
