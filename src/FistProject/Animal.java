package FistProject;
public abstract class Animal implements IAnimal{

    @Override
    public void crier(String hurler){
        System.out.println(hurler);
    }

    @Override
    public String getClassName(Object objectClass) {
        return  objectClass.getClass().getName();
    }
    
   
}
