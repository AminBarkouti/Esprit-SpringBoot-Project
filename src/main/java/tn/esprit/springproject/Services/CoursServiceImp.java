package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.*;
import tn.esprit.springproject.Repository.ICoursRepository;
import tn.esprit.springproject.Repository.IInscriptionRepository;
import tn.esprit.springproject.Repository.IPisteRepository;
import tn.esprit.springproject.Repository.ISkieurRepository;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class CoursServiceImp implements ICoursService{
    @Autowired
    ICoursRepository coursRepo;
    @Autowired
    IPisteRepository pistrepo ;
    @Autowired
    IInscriptionRepository inscriptionRepo;
    @Autowired
    ISkieurRepository skieurRepo;

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
    public Inscription assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        Cours cours =coursRepo.findById(numCourse).get();
        Inscription i =inscriptionRepo.findById(numRegistration).get();
        i.setCours(cours);
        return inscriptionRepo.save(i);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        Skieur skieur = skieurRepo.findById(numSkieur).get();
        Cours cours = coursRepo.findById(numCours).get();
        if ((cours.getTypeCours() == TypeCours.COLLECTIF_ENFANT || cours.getTypeCours() == TypeCours.COLLECTIF_ADULTE)
                && cours.getInscriptionsList().size() >= 6) {
            throw new IllegalStateException("nombre maximum de skieurs atteint");
        }
        LocalDate dateActuelle = LocalDate.now();
        if(Period.between(skieur.getDateNaissance(), dateActuelle).getYears() <6){
            throw new IllegalStateException("L'âge du skieur n'est pas valide");
        }

        inscription.setSkieur(skieur);
        inscription.setCours(cours);
        //skieur.getInscriptions().add(inscription);
        //cours.getInscriptions().add(inscription);
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription disafectCourReservation(Long numCourse, Long numRegistration) {
        Inscription inscription = inscriptionRepo.findById(numRegistration).get();
        Cours cours = coursRepo.findById(numCourse).get();
        inscription.setCours(null);
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCourse) {
        Abonnement abonnement = skieur.getAbonnement();
        Inscription inscription = skieur.getInscriptionsList().get(1);
        Cours cours = coursRepo.findById(numCourse).get();
        inscription.setCours(cours);
        return skieurRepo.save(skieur);
    }
}

















