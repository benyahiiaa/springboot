package tn.esprit.latifabenyahia.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    // Association OneToOne avec Universite
    @OneToOne(mappedBy = "foyer")
    @ToString.Exclude
    private Universite universite;

    // Association OneToMany avec Bloc
    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Bloc> blocs;
}
