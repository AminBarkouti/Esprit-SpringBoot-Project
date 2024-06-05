package tn.esprit.springproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Entities.Piste;
import tn.esprit.springproject.Entities.Skieur;
import tn.esprit.springproject.Services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/Skieur")
public class SkieurController {
    @Autowired
    ISkieurService skieurService;

    @PostMapping("/addInscription/{idSkieur}")
    public Inscription addInscription(@PathVariable("idSkieur") Long id, @RequestBody Inscription inscription){
        return skieurService.addRegistrationAndAssignToSkieur(inscription,id);
    }

    @PutMapping("/addPiste/{numPiste}/{numSkieur}")
    public Skieur assignSkieurToPiste(@PathVariable("numPiste") Long numPiste, @PathVariable("numSkieur") Long numSkieur)
    {
        return skieurService.assignSkieurToPiste(numSkieur,numPiste);
    }

    @PutMapping("/addPiste/{numSkieur}/{numPiste}")
    public Piste disafectSkieur(@PathVariable("numSkieur") Long numSkieur, @PathVariable("numPiste") Long numPiste)
    {
        return skieurService.disafectSkieur(numSkieur,numPiste);
    }
    @GetMapping("/get/{nomS}")
    public List<Inscription> getInscriptionByNomSkIEUR(@PathVariable("nomS") String nom){
        return skieurService.getInscriptionByNomSkIEUR(nom);
    }
}
