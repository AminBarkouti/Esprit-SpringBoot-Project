package tn.esprit.springproject.Controllers;

import tn.esprit.springproject.Entities.Abonnement;
import tn.esprit.springproject.Services.IAbonnementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Abonnement")
public class AbonnementController {
    @Autowired
    IAbonnementService abonnementService;

    @GetMapping("/listAbonnements")
    public List<Abonnement> getAbonnements() {
        return abonnementService.retrieveAllAbonnement();
    }

    @PostMapping("/addAbonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement a) {
        return abonnementService.addAbonnement(a);
    }

    @GetMapping("/getById/{id}")
    public Abonnement getById(@PathVariable("id") Long id) {
        return abonnementService.retrieveCours(id);
    }

    @PutMapping("/updateAbonnement")
    public Abonnement updateAbonnement(@RequestBody Abonnement b) {
        return abonnementService.updateAbonnement(b);
    }
}
