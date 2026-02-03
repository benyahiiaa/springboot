package tn.esprit.latifabenyahia.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private Typechambre typeC;

    // Association ManyToOne avec Bloc
    @ManyToOne
    @ToString.Exclude
    private Bloc bloc;

    // Association ManyToMany avec Reservation
    @ManyToMany(mappedBy = "chambres")
    @ToString.Exclude
    private Set<Reservation> reservations;
}
