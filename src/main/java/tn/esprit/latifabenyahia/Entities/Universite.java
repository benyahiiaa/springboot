package tn.esprit.latifabenyahia.Entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;

    private String adresse;

    // Association OneToOne avec Foyer
    @OneToOne
    @ToString.Exclude
    private tn.esprit.latifabenyahia.Entities.Foyer foyer;
}



