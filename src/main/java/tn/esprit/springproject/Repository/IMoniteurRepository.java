package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entities.Moniteur;
@Repository
public interface IMoniteurRepository extends CrudRepository<Moniteur, Long> {
    @Query("select m from Moniteur m where m.nomM = ?1")
    Moniteur findByNomM(String m);

    @Query("select m from Moniteur m where m.nomM = ?1 and m.prenomM = ?2")
    Moniteur findByNomMAndPrenomM(String nom, String prenom);
}
