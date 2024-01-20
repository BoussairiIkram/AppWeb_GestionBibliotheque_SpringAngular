package fr.ensibs.gestionbiblio.Entities;

import fr.ensibs.gestionbiblio.Entities.Enums.StatutPret;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoriquePret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String publicId;
    @Temporal(TemporalType.DATE)
    private Date datePret;
    @Temporal(TemporalType.DATE)
    private Date dateRetourPrevue;
    private Date dateRetourReel;

    @OneToMany(mappedBy = "historiquePret", fetch = FetchType.LAZY)
    private ArrayList<LivreCopy>  livreCopies;

    @ManyToOne
    @JoinColumn(name = "id_emprunteur")
    private Emprunteur emprunteur;
}
