import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurSoustraire implements EventHandler<ActionEvent>{
    private AppliSomme appli;
    
    public ControleurSoustraire(AppliSomme appli){
        this.appli = appli;
    }
    
    public void handle(ActionEvent e){
        this.appli.soustraire();
    }
}
