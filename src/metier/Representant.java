package metier;

import java.util.*;

public class Representant {

    private int idRepresentant;
    private String nom;
    private String prenom;
    private double caRepresentant;
    private List<Client> Clients;

    public int getIdRepresentant() {
        return idRepresentant;
    }

    public void setIdRepresentant(int idRepresentant) {
        this.idRepresentant = idRepresentant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getCaRepresentant() {
        return caRepresentant;
    }

    public void setCaRepresentant(double caRepresentant) {
        this.caRepresentant = caRepresentant;
    }

    public List<Client> getClients(){
        return this.Clients;
    }
    public void setClients(List<Client> Clients) {
        this.Clients = Clients;
    }


    public Representant(int idRepresentant, String prenom, String nom, List<Client> lesClients) {
        this.idRepresentant = idRepresentant;
        this.nom = nom;
        this.prenom = prenom;
        this.caRepresentant = caRepresentant;

    }

    /**
     * Recherche un Client sur son id dans la 
     * liste des clients. 
     * Retourne le Client si trouvé, sinon retourne null
     * @param idClient
     * @return Client
     */
    public Client getClientById(int idClient) {
        for (Client client : Clients){
            if(client.getIdClient() == idClient){
                return client;
            }
        }
        return null ;/* A compléter */
    }

  

}
