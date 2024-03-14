package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entities.Piste;

import java.util.List;

public interface IPisteService {
    List retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}
