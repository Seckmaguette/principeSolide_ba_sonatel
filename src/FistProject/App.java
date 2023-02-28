package FistProject;


public class App {
   
    public static void main(String[] args) throws Exception {
        Mouton agneau = new Mouton();

      
       IAnimal mouton = new Mouton(agneau);
   
       System.out.println(mouton);
       IAnimal lion = new Lion();
       IAnimal serpent = new Serpent();
       
    lion.crier("Le " +lion.getClassName(lion)+" Hummmhummm");
    mouton.crier("Le " +mouton.getClassName(mouton)+" Mbééééé");
    serpent.crier("Le " +serpent.getClassName(serpent)+" Siffle");
       //mouton.crier("Le " +mouton.getClass().getName()+" Mbééééé");
       //lion.crier("Le " +lion.getClass().getName()+" Hummmhummm");
    }
    
}
