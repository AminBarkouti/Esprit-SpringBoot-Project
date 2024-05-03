package tn.esprit.springproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entities.Moniteur;
import tn.esprit.springproject.Services.IMoniteurService;

import java.util.List;

@RestController
@RequestMapping("/Moniteur")
public class MoniteurController {
    @Autowired
    IMoniteurService moniteurService;

    @GetMapping("/listMoniteur")
    public List<Moniteur> getMoniteur (){
        return moniteurService.retrieveAllMoniteurs();
    }

    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m){
        return moniteurService.addMoniteur(m);
    }

    @GetMapping("/findByNom/{nom}")
    public Moniteur findByNom(@PathVariable("nom") String nom){
        return moniteurService.findByNom(nom);
    }

    @GetMapping("/getById/{id}")
    public Moniteur findById(@PathVariable("id") Long id){
        return moniteurService.retrieveMoniteur(id);
    }

    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m){
        return moniteurService.updateMoniteur(m);
    }

    @DeleteMapping("/supp/{id}")
    public String supprimerMoniteur(@PathVariable("id") Long id){
        return moniteurService.deleteMoniteur(id);
    }

    @PostMapping("/add/{cours}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable("cours") Long numCourse) {
        return moniteurService.addInstructorAndAssignToCourse(moniteur,numCourse);
    }
}
