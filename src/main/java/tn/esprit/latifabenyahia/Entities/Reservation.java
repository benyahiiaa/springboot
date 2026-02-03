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

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private Boolean estValide;

    // Association ManyToMany avec Etudiant
    @ManyToMany
    @JoinTable(
            name = "reservation_etudiant",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    @ToString.Exclude
    private Set<Etudient> etudiants;

    // Association ManyToMany avec Chambre
    @ManyToMany
    @JoinTable(
            name = "reservation_chambre",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "chambre_id")
    )
    @ToString.Exclude
    private Set<Chambre> chambres;
}

