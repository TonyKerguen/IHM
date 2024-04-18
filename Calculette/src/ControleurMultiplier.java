import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurMultiplier implements EventHandler<ActionEvent>{
    private AppliCalc appli;
    
    public ControleurMultiplier(AppliCalc appli){
        this.appli = appli;
    }
    
    public void handle(ActionEvent e){
        this.appli.multiplier();
    }
}
