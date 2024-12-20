package metier;

import java.util.*;

public class Article {

    private int idArticle;
    private String designation;
    private double caArticle;
    private int qteStock;
    private double prix;
    private Famille uneFamille;
    private Tva uneTva;

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getCaArticle() {
        return caArticle;
    }

    public void setCaArticle(double caArticle) {
        this.caArticle = caArticle;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Famille getUneFamille() {
        return uneFamille;
    }

    public void setUneFamille(Famille uneFamille) {
        this.uneFamille = uneFamille;
    }
    public Tva getUneTva() {
        return uneTva;
    }
    public void setUneTva(Tva uneTva) {
        this.uneTva = uneTva;
    }
    
    public Article(int idArticle, String designation, int qteStock, double prix, Tva uneTva, Famille uneFamille) {
        this.idArticle = idArticle;
        this.designation = designation;
        this.caArticle = caArticle;
        this.qteStock = qteStock;
        this.prix = prix;
        this.uneFamille = uneFamille;
    }

}
