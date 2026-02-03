package tn.esprit.latifabenyahia.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;

    private Long capaciteBloc;

    // Association ManyToOne avec Foyer
    @ManyToOne
    @ToString.Exclude
    private Foyer foyer;

    // Association OneToMany avec Chambre
    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Chambre> chambres;
}

