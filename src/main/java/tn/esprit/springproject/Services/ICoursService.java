package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Cours;
import tn.esprit.springproject.Entities.Inscription;

import java.util.List;

public interface ICoursService {
    List retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    Inscription assignInscriptionToCours(Long numRegistration, Long numCourse);
    Inscription disafectCourReservation(Long numCourse, Long numRegistration);

}
