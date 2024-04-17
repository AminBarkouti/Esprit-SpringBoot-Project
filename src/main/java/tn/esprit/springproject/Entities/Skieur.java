package tn.esprit.springproject.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String Ville;

    @ManyToMany(mappedBy = "skieurList")
    List<Piste>pisteList;

    @OneToMany(mappedBy ="skieur")
    @JsonIgnore
    List<Inscription>inscriptionsList;
}