package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Entities.Piste;
import tn.esprit.springproject.Entities.Skieur;

public interface ISkieurService {
    Inscription addRegistrationAndAssignToSkieur(Inscription inscription, Long numSkieur);
    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);
    Piste disafectSkieur(Long numSkieur, Long numPiste);
}
