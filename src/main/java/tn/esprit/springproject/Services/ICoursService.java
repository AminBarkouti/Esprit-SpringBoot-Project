package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Cours;
import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Entities.Skieur;

import java.util.List;

public interface ICoursService {
    List retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    Inscription assignRegistrationToCourse(Long numRegistration, Long numCourse);
    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);
    Inscription disafectCourReservation(Long numCourse, Long numRegistration);
    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCourse);


}
