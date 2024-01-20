package fr.ensibs.gestionbiblio.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Bibliothécaire")
public class Bibliothécaire extends Personne{
    private String post;
    @Temporal(TemporalType.DATE)
    private Date dateEmbauche;
}
