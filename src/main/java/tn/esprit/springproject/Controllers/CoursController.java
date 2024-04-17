package tn.esprit.springproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Services.ICoursService;

@RestController
@RequestMapping("/Inscription")
public class CoursController {

    @Autowired
    ICoursService coursService;

    @PutMapping("/edit/{ins}/{cours}")
    public Inscription assignInscriptionToCours (@PathVariable("ins")Long numRegistration, @PathVariable("cours")Long numCours){
        return coursService.assignInscriptionToCours(numRegistration,numCours);
    }

    @PutMapping("/disafecte/{insc}/{cour}")
    public Inscription disafect(@PathVariable("insc") Long id, @PathVariable("cour") Long numCours){
        return coursService.disafectCourReservation(id, numCours);
    }

}
