package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Cours;
import tn.esprit.springproject.Entities.Moniteur;
import tn.esprit.springproject.Repository.ICoursRepository;
import tn.esprit.springproject.Repository.IMoniteurRepository;

import java.util.List;

@Service
public class MoniteurServiceImp implements IMoniteurService{
    @Autowired
    IMoniteurRepository moniteurRepo;
    @Autowired
    ICoursRepository coursRepo;

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
        Moniteur m = moniteurRepo.findById(moniteur.getNumMoniteur()).get();
        m.setCours(moniteur.getCours());
        m.setNomM(moniteur.getNomM());
        m.setDateRecu(moniteur.getDateRecu());
        m.setPrenomM(moniteur.getPrenomM());
        moniteurRepo.save(m);
        return m;
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).get();
    }

    @Override
    public Moniteur findByNom(String nom) {
        return moniteurRepo.findByNomM(nom);
    }

    @Override
    public String deleteMoniteur(Long id) {
        moniteurRepo.deleteById(id);
            return "moniteur supprimé";
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cours c = coursRepo.findById(numCourse).get();
        moniteur.getCours().add(c);
        return moniteurRepo.save(moniteur);
    }
}
