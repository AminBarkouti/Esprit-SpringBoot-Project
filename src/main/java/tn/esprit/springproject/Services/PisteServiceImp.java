package tn.esprit.springproject.Services;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Piste;
import tn.esprit.springproject.Repository.IPisteRepository;

import java.util.List;

@Service
@Slf4j
public class PisteServiceImp implements IPisteService{
    @Autowired
    IPisteRepository pisteRepo;

    @Override
    @Scheduled(fixedDelay = 10000)
    public List retrieveAllPistes() {
        for(Piste p: pisteRepo.findAll()){
            log.info("le nom de la piste est :"+p.getNomPiste());
        }
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
