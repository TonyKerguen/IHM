import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;


public class ControleurCouleur implements EventHandler<ActionEvent>{
    private AppliDessin appli;
    private Color c;
    
    public ControleurCouleur(AppliDessin appli, Color c){
        this.appli = appli;
        this.c = c;
    }
    
    public void handle(ActionEvent e){
        this.appli.changeCouleurLeDernierCercle(c);
    }
}
