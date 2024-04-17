package tn.esprit.springproject.Controllers;

import tn.esprit.springproject.Entities.Piste;
import tn.esprit.springproject.Services.IPisteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Piste")
public class PisteController {
    @Autowired
    IPisteService pisteService;

    @GetMapping("/listPistes")
    public List<Piste> getPistes() {
        return pisteService.retrieveAllPistes();
    }

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @GetMapping("/getById/{id}")
    public Piste getById(@PathVariable("id") Long id) {
        return pisteService.retrievePiste(id);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }
}
