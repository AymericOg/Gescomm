package metier;

import dao.BdD;
import java.util.*;

public class Commande {

    private int idCommande;
    private Date dateCommande;
    private List<Ligne> lesLignes;

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public List<Ligne> getLesLignes() {
        return lesLignes;
    }

    public void setLesLignes(List<Ligne> lesLignes) {
        this.lesLignes = lesLignes;
    }
    
    public Commande (int idCommande, Date dateCommande){
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.lesLignes = new ArrayList<>();
    }
    
    /**
     * Ajoute une ligne à une commande.
     * Si la liste des lignes n'est pas instanciée,
     * l'instancier
     * Si l'article n'est pas dans la liste des
     * lignes, créer la ligne et l'ajouter à la liste
     * @param unArticle
     * @param qteCde 
     */
    public void ajouterLigne(Article unArticle, int qteCde) {
        if (getLesLignes() == null) {
            setLesLignes(new ArrayList<Ligne>());
        }
        Ligne uneLigne = new Ligne(unArticle, qteCde);
        this.lesLignes.add(uneLigne);
    }

    /**
     * Supprime la ligne passée en paramètre
     * @param ligneASupprimer Ligne à supprimer
     */
    public void supprimerLigne(Ligne ligneASupprimer) {
        if (getLesLignes() != null) {
            lesLignes.remove(ligneASupprimer);
        }
    }
    
    /**
     * Recherche la ligne contenant l'article ayant
     * l'id passé en paramètre. 
     * Utiliser la méthode equals() pour comparer deux objets.
     * @param idArticle identifiant de l'article à chercher
     * @param bdd objet Base de Données contenant la liste des articles
     */    
//    public Ligne chercherLigne(int idArticle, BdD bdd) {
//        /* A compléter */
//        return /* A compléter */
//    }

    /**
     * Calcule le montant total HT de la commande 
     * à partir du prix des articles présents dans
     * les lignes de commande
     * @return Montant total HT de la commande
     */
//    public double valoriserCommande() {
//        /* A compléter */
//        return /* A compléter */
//    }
}
