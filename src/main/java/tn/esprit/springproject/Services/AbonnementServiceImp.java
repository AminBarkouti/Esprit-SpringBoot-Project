package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Abonnement;
import tn.esprit.springproject.Repository.IAbonnementRepository;

import java.util.List;

@Service
public class AbonnementServiceImp implements IAbonnementService{
    @Autowired
    IAbonnementRepository abonnementRepo;
    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return abonnementRepo.save(a);
    }

    @Override
    public List retrieveAllAbonnement() {
        return (List) abonnementRepo.findAll();
    }

    @Override
    public Abonnement updateAbonnement(Abonnement b) {
        return abonnementRepo.save(b);
    }

    @Override
    public Abonnement retrieveCours(Long numAbon) {
        return abonnementRepo.findById(numAbon).get();
    }
}
