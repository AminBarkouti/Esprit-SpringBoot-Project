package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Entities.Piste;
import tn.esprit.springproject.Entities.Skieur;
import tn.esprit.springproject.Repository.IInscriptionRepository;
import tn.esprit.springproject.Repository.IPisteRepository;
import tn.esprit.springproject.Repository.ISkieurRepository;

import java.util.List;

@Service
public class SkieurServiceImp implements ISkieurService{
    @Autowired
    ISkieurRepository skieurRepo;
    @Autowired
    IInscriptionRepository inscriptionRepo;
    @Autowired
    IPisteRepository pisteRepo;


    @Override
    public Inscription addRegistrationAndAssignToSkieur(Inscription inscription, Long numSkieur) {
        Skieur skieur = skieurRepo.findById(numSkieur).get();
        //skieur.getInscriptionList().add(inscription);
        inscription.setSkieur(skieur);
        return inscriptionRepo.save(inscription);
    }

    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Piste p =pisteRepo.findById(numPiste).get();
        Skieur skieur =skieurRepo.findById(numSkieur).get();

        skieur.setPisteList((List<Piste>) p);
        //p.setSkieurList((List<Skieur>) skieur);
        return skieurRepo.save(skieur);
    }

    @Override
    public Piste disafectSkieur(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepo.findById(numSkieur).get();
        Piste piste = pisteRepo.findById(numPiste).get();
        piste.getSkieurList().remove(skieur);
        return pisteRepo.save(piste);
    }
}
