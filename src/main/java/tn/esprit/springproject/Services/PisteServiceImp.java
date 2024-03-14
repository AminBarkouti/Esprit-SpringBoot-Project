package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Piste;
import tn.esprit.springproject.Repository.IPisteRepository;

import java.util.List;

@Service
public class PisteServiceImp implements IPisteService{
    @Autowired
    IPisteRepository pisteRepo;
    @Override
    public List retrieveAllPistes() {
        return (List) pisteRepo.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepo.findById(numPiste).get();
    }
}
