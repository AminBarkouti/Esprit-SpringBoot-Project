package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Inscription;

import java.util.List;

@Repository
public interface IInscriptionRepository extends CrudRepository<Inscription, Long> {
    @Query("select i from Inscription i where i.skieur.nomS = ?1")
    List<Inscription> getInscriptionByNomSkieur(String nom);
}
