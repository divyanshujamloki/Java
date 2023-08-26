package project;

public class vehicle {
    private engine Engine;
    private Cd Player = new Cd() {
        
    };


    public  vehicle(){
        Engine = new cars();

    }

    public  vehicle(engine Engine) {
        this.Engine = Engine;

    }
    
    public void start() {
        Engine.start();
    }
    
    public void Startmusic() {
        Player.start();
    }

    public void Stopmusic() {
        Player.stop();
    }
    
    public void ChangeEng() {
        this.Engine = new Jet();
    }

      
}
