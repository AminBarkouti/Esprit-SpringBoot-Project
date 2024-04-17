package tn.esprit.springproject.Entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbn;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

    @OneToOne
    private Skieur skieur ;
}