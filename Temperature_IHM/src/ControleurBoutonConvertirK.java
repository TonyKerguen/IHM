import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class ControleurBoutonConvertirK implements EventHandler<ActionEvent>{ 

    private Temperature temperature;
    private AppliConverter appli;
    
    public ControleurBoutonConvertirK(Temperature temperature, AppliConverter appli){
        this.temperature = temperature;
        this.appli = appli;
    }

    @Override
    public void handle(ActionEvent event) {
        double value;
        try{
            value = this.appli.getValueKelvin();
            this.temperature.setvaleurKelvin(value);
            this.appli.majTF();                
        }
        catch (NumberFormatException exp) {
            this.appli.effaceTF();
        }
    }
          
}
