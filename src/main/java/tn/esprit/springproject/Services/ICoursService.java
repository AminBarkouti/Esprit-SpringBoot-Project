package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Cours;

import java.util.List;

public interface ICoursService {
    List retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);

}
