package latihan_gui;

public class GameManager {
    
    ActionHandler actionHandler = new ActionHandler();
    UI ui = new UI(this);
    
    public static void main(String[] args) {
        
        new GameManager();
    }
    
    public GameManager(){
        
    }
    
}
