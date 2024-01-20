package fr.ensibs.gestionbiblio.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 20)
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String publicId;
    private String nom;
    private String prenom;
    private String email;
    private String password; //Password doit etre crypté
    private String telephone;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String adresse;

    private Date createdAt;
    private Date updatedOn;

    private boolean softDelete;


}
