package fr.ensibs.gestionbiblio.Entities;

import fr.ensibs.gestionbiblio.Entities.Enums.Category;
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
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String publicId;
    private int isbn;
    private String titre;
    private String auteur;
    private int total_copie;
    private Category category;
    private Date createdAt;
    private Date updatedOn;
    private boolean softDelete;

    @OneToMany(mappedBy = "livre", fetch = FetchType.LAZY)
    private ArrayList<LivreCopy> livreCopies;
}
