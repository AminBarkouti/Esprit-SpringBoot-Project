package tn.esprit.springproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Abonnement;
import tn.esprit.springproject.Entities.TypeAbonnement;

import java.util.List;

@Repository
public interface IAbonnementRepository extends CrudRepository<Abonnement, Long> {
    public List<Abonnement> findByTypeAbon(TypeAbonnement x);
    public List<Abonnement> findByTypeAbonAndPrixAbn(TypeAbonnement x, float y);

}
