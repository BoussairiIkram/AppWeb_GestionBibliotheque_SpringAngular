package fr.ensibs.gestionbiblio.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Emprunteur")
public class Emprunteur extends Personne{
    private String profession;

    @OneToMany(mappedBy = "emprunteur", fetch = FetchType.LAZY)
    private ArrayList<HistoriquePret> historiquePrets;
}
