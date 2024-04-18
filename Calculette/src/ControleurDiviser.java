import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurDiviser implements EventHandler<ActionEvent>{
    private AppliCalc appli;
    
    public ControleurDiviser(AppliCalc appli){
        this.appli = appli;
    }
    
    public void handle(ActionEvent e){
        this.appli.diviser();
    }
}
