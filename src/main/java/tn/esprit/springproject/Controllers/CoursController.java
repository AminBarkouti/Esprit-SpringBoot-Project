package tn.esprit.springproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entities.Cours;
import tn.esprit.springproject.Entities.Inscription;
import tn.esprit.springproject.Entities.Skieur;
import tn.esprit.springproject.Services.ICoursService;

import java.util.List;

@RestController
@RequestMapping("/Inscription")
public class CoursController {

    @Autowired
    ICoursService coursService;

    @GetMapping("/listCourses")
    public List<Cours> getCourses() {
        return coursService.retrieveAllCourses();
    }

    @PostMapping("/addCourse")
    public Cours addCourse(@RequestBody Cours cours) {
        return coursService.addCours(cours);
    }

    @GetMapping("/getById/{id}")
    public Cours getById(@PathVariable("id") Long id) {
        return coursService.retrieveCours(id);
    }

    @PutMapping("/updateCourse")
    public Cours updateCourse(@RequestBody Cours cours) {
        return coursService.updateCours(cours);
    }

    @PutMapping("/edit/{ins}/{cours}")
    public Inscription assignInscriptionToCours (@PathVariable("ins")Long numRegistration, @PathVariable("cours")Long numCours){
        return coursService.assignRegistrationToCourse(numRegistration,numCours);
    }

    @PostMapping("/add/{cours}/{skieur}")
    public Inscription addRegistrationAndAssignToSkierAndCourse(@RequestBody Inscription inscription, @PathVariable("skieur") Long numSkieur, @PathVariable("cours") Long numCours){
        return coursService.addRegistrationAndAssignToSkierAndCourse(inscription,numSkieur,numCours);
    }

    @PostMapping("/add/{cours}")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur, @PathVariable("cours") Long numCours) {
        return coursService.addSkierAndAssignToCourse(skieur,numCours);
    }

    @PutMapping("/disafecte/{insc}/{cour}")
    public Inscription disafect(@PathVariable("insc") Long id, @PathVariable("cour") Long numCours){
        return coursService.disafectCourReservation(id, numCours);
    }

}
