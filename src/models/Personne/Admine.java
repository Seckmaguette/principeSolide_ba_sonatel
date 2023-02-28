package models.Personne;



public class Admine extends Personne {
    Long matricule = 221L ;

    public String showMat(){
        matricule++;
        return "Matricule"+matricule;
    }
}
