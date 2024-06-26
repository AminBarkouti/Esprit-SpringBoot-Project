package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    Moniteur findByNom(String nom);

    String deleteMoniteur (Long id);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
