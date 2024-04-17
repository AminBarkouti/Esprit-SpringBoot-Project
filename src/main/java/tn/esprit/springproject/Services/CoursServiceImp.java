package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Cours;
import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Repository.ICoursRepository;
import tn.esprit.springproject.Repository.IInscriptionRepository;
import tn.esprit.springproject.Repository.IPisteRepository;

import java.util.List;

@Service
public class CoursServiceImp implements ICoursService{
    @Autowired
    ICoursRepository coursRepo;
    @Autowired
    IPisteRepository pistrepo ;
    @Autowired
    IInscriptionRepository inscriptionRepo;

    @Override
    public List retrieveAllCourses() {
        return (List) coursRepo.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepo.findById(numCours).get();
    }

    @Override
    public Inscription assignInscriptionToCours(Long numRegistration, Long numCourse) {

        Cours cours =coursRepo.findById(numCourse).get();
        Inscription i =inscriptionRepo.findById(numRegistration).get();
        i.setCours(cours);
        return inscriptionRepo.save(i);
    }

    @Override
    public Inscription disafectCourReservation(Long numCourse, Long numRegistration) {
        Inscription inscription = inscriptionRepo.findById(numRegistration).get();
        Cours cours = coursRepo.findById(numCourse).get();
        inscription.setCours(null);
        return inscriptionRepo.save(inscription);
    }
}

















