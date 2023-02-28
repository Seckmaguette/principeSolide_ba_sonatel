package models.Personne;

import InterfacePersonne.IPersonne;

public abstract class Personne implements IPersonne {
     String Prenom;
     String Nom;
     int Age;
     String Role;
     String Username;
     String Password;
    @Override
    public void ajouter(String prenom, String nom, int age) {
        System.out.println("vous avez ajouter"+prenom+" "+nom+" avec un age"+age);
        
    }
    @Override
    public void connexion(String userName, String passWord, String role) {
      if (passWord.equalsIgnoreCase("pass")){
System.out.println("vous etes connecter en tant que"+role);
      }else{
        System.out.println("vous n'ets pas connecte");
      }
        
    }
    @Override
    public void retirer(String prenom, String nom, String age) {
        System.out.println("vous avez retirer"+prenom+" "+nom+" avec un age"+age);
        
    }

}
