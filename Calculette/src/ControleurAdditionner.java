import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurAdditionner implements EventHandler<ActionEvent>{
    private AppliCalc appli;
    
    public ControleurAdditionner(AppliCalc appli){
        this.appli = appli;
    }
    
    public void handle(ActionEvent e){
        this.appli.additionne();
    }
}
