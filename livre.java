package com.biblio.common;

import jakarta.persistence.*;

@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String auteur;
    private boolean estDisponible = true;

    // Constructeurs
    public Livre() {}

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estDisponible = true;
    }

    // Getters / Setters
    public Long getId() { return id; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    public boolean isEstDisponible() { return estDisponible; }
    public void setEstDisponible(boolean estDisponible) { this.estDisponible = estDisponible; }
}
