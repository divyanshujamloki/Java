package project;




public class cars implements engine, brake, mirror {

    @Override
    public void brakes() {
        System.out.println("brake of noraml car");
    }

    @Override
    public void bulletProof() {
        System.out.println("bullet Noraml galss of noraml car");
    }

     @Override
     public void Ponty(){
        System.out.println(" ponty of noraml car");
    }


    @Override
    public void Normal() {
        System.out.println(" Noraml galss of noraml car");
    }

    @Override
    public void stop() {

        System.out.println("engine stop of noraml car");
    }
    
    @Override  
    public void acc() {

        System.out.println("engine  acc of noraml car");
    }

    @Override
    public void start(){
    
        System.out.println("engine start of noraml car");
}
   

    


}
