import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;

public class AppliConnexion extends Application{
    
    private Label p;
    private Label lid;
    private Label lmdp;
    private TextField id;
    private PasswordField mdp;
    private Button b;

    @Override
    public void init() {
        this.p = new Label("Entrez votre identifiant et votre mot de passe");
        this.lid = new Label("Identifiant");
        this.lmdp = new Label("Mot de passe");
        this.id = new TextField();
        this.mdp = new PasswordField();
        this.b = new Button("Connexion");
    }
    
    private GridPane root() {
        GridPane pane =new GridPane();
        pane.add(p, 0, 0);
        pane.add(lid, 0, 1);
        pane.add(lmdp, 0, 2);
        pane.add(id, 1, 1);
        pane.add(mdp, 1, 2);
        pane.add(b, 1, 3);
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setPadding(new Insets(10));
        return pane;
    }

    @Override
    public void start(Stage stage){              
        Scene scene =new Scene(root());
        stage.setTitle("Allo 45");
        stage.setScene(scene);
        stage.show();
    }
}
