package tn.esprit.latifabenyahia.Entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private Long cin;

    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    // Association ManyToMany avec Reservation
    @ManyToMany(mappedBy = "etudiants")
    @ToString.Exclude
    private Set<Reservation> reservations;
}

