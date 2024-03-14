package tn.esprit.springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Moniteur;
@Repository
public interface IMoniteurRepository extends CrudRepository<Moniteur, Long> {
    public Moniteur findByNomM(String m);
}
