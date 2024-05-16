import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class AppliCalc extends Application{
    
    private Label resultat;
    private TextField tf1;
    private TextField tf2;

    private HBox hboxT() {
        HBox pane =new HBox(5);
        pane.getChildren().addAll(tf1, tf2);
        pane.setAlignment(Pos.CENTER);
        return pane;
    }

    private HBox hboxB() {
        HBox pane =new HBox(5);
        Button boutonA =new Button("+");
        Button boutonS =new Button("-");
        Button boutonM =new Button("*");
        Button boutonD =new Button("/");
        pane.getChildren().addAll(boutonA, boutonS, boutonM, boutonD);
        pane.setAlignment(Pos.CENTER); 
        boutonA.setOnAction(new ControleurAdditionner(this));
        boutonS.setOnAction(new ControleurSoustraire(this));
        boutonM.setOnAction(new ControleurMultiplier(this));
        boutonD.setOnAction(new ControleurDiviser(this));
        return pane;
    }

    private VBox root() {
        VBox vbox = new VBox(30);
        vbox.getChildren().addAll(hboxT(), hboxB(), resultat);
        vbox.setAlignment(Pos.CENTER); 
        vbox.setPrefWidth(400);
        vbox.setPrefHeight(150);
        return vbox;
    }

    @Override
    public void start(Stage stage){              
        Scene scene =new Scene(root());
        stage.setTitle("Calculette");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() {
        this.tf1 = new TextField();
        this.tf2 = new TextField();
        this.resultat = new Label("Resultat : ");        
    }

    public void additionne(){
        Double un = Double.parseDouble(this.tf1.getText());
        Double deux = Double.parseDouble(this.tf2.getText());
        Double res = un + deux;
        this.resultat.setText("Resultat : "+res);
    }

    public void soustraire(){
        Double un = Double.parseDouble(this.tf1.getText());
        Double deux = Double.parseDouble(this.tf2.getText());
        Double res = un - deux;
        this.resultat.setText("Resultat : "+res);
    }

    public void multiplier(){
        Double un = Double.parseDouble(this.tf1.getText());
        Double deux = Double.parseDouble(this.tf2.getText());
        Double res = un * deux;
        this.resultat.setText("Resultat : "+res);
    }

    public void diviser(){
        Double un = Double.parseDouble(this.tf1.getText());
        Double deux = Double.parseDouble(this.tf2.getText());
        Double res = un / deux;
        this.resultat.setText("Resultat : "+res);
    }
}
