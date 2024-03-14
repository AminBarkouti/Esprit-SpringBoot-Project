package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Abonnement;
import java.util.List;

public interface IAbonnementService {
    public Abonnement addAbonnement(Abonnement a);
    List retrieveAllAbonnement();
    Abonnement updateAbonnement (Abonnement b);
    Abonnement retrieveCours (Long numAbon);
}
