import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurMultiplier implements EventHandler<ActionEvent>{
    private AppliSomme appli;
    
    public ControleurMultiplier(AppliSomme appli){
        this.appli = appli;
    }
    
    public void handle(ActionEvent e){
        this.appli.multiplier();
    }
}
