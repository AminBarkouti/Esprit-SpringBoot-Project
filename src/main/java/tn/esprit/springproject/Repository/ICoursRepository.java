package tn.esprit.springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Cours;
@Repository
public interface ICoursRepository extends CrudRepository<Cours, Long> {
}
