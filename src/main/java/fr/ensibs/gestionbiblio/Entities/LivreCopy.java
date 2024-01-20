package fr.ensibs.gestionbiblio.Entities;

import fr.ensibs.gestionbiblio.Entities.Enums.StatutPret;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivreCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String publicId;

    @Enumerated(EnumType.ORDINAL)
    private StatutPret statut;

    @ManyToOne
    @JoinColumn(name = "id_livre")
    private Livre livre;

    @ManyToOne
    @JoinColumn(name = "id_historiquePret")
    private HistoriquePret historiquePret;


}
