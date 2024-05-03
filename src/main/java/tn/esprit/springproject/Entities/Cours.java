package tn.esprit.springproject.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    private float prix;
    private int creneau;

    @Enumerated(EnumType.STRING)
    private Support support;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @OneToMany(mappedBy = "cours")
    @JsonIgnore
    private List<Inscription> inscriptionsList;

    @ManyToOne
    private Moniteur moniteur;
}