import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurDiviser implements EventHandler<ActionEvent>{
    private AppliSomme appli;
    
    public ControleurDiviser(AppliSomme appli){
        this.appli = appli;
    }
    
    public void handle(ActionEvent e){
        this.appli.diviser();
    }
}
