package Vue;
import InterfacePersonne.IPersonne;
import models.Personne.Admine;
import models.Personne.Client;

public class Main2 {
  public static void main(String[] args) {
    Admine admine1 = new Admine();
    IPersonne admine = new Admine();
    IPersonne client = new Client();
    admine.ajouter("Maguette", "Seck", 20);
    client.connexion("Seck", "pass", "admin");
    System.out.println(admine1.showMat());
  }  
}
