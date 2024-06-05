package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Entities.Piste;
import tn.esprit.springproject.Entities.Skieur;

import java.util.List;

public interface ISkieurService {
    Inscription addRegistrationAndAssignToSkieur(Inscription inscription, Long numSkieur);
    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);
    Piste disafectSkieur(Long numSkieur, Long numPiste);

    public List<Inscription> getInscriptionByNomSkIEUR (String nom);

}
