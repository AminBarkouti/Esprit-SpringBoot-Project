package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Moniteur;
import tn.esprit.springproject.Repository.IMoniteurRepository;

import java.util.List;

@Service
public class MoniteurServiceImp implements IMoniteurService{
    @Autowired
    IMoniteurRepository moniteurRepo;
    @Override
    public List retrieveAllMoniteurs() {
        return (List) moniteurRepo.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).get();
    }

    @Override
    public Moniteur findByNom(String nom) {
        return moniteurRepo.findByNomM(nom);
    }
}
