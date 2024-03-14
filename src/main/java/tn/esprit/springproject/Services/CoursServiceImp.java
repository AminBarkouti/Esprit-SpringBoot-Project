package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entities.Cours;
import tn.esprit.springproject.Repository.ICoursRepository;

import java.util.List;

@Service
public class CoursServiceImp implements ICoursService{
    @Autowired
    ICoursRepository coursRepo;
    @Override
    public List retrieveAllCourses() {
        return (List) coursRepo.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepo.findById(numCours).get();
    }
}
