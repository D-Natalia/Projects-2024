package Controller;

import Trasee.TraseeRetezat;
import Trasee.TraseuMontan;
import Utilizator.Utilizator;
import javafx.application.Platform;
import javafx.fxml.FXML;

import java.util.List;
import java.util.Optional;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

public class TraseeRetezatController {

    @FXML
    private ImageView imageVfRetezat;
    @FXML
    private ImageView imageVfMare;
    @FXML
    private ImageView imageVfPeleaga;
    @FXML
    private TextField numarVarfField;
    @FXML
    private Label detailsLabel;
    @FXML
    private VBox traseeVBox;
    @FXML
    private VBox recenzieVBox;
    @FXML
    private VBox contentVBox;

    @FXML
    private Utilizator utilizator;
    private TraseeRetezat traseeRetezat=new TraseeRetezat();

    public TraseeRetezatController() {
        this.traseeRetezat = new TraseeRetezat();
    }
    public void setUtilizator(Utilizator utilizator){
        this.utilizator=utilizator;
    }
    @FXML
    public void initialize() {
        imageVfRetezat.setImage(new Image("varful-retezat.jpg"));
        imageVfMare.setImage(new Image("varful-mare.jpg"));
        imageVfPeleaga.setImage(new Image("varful-peleaga.jpg"));
    }

    @FXML
    public void afiseazaTraseele() {
        String numarVarf = numarVarfField.getText();
        List<TraseuMontan> traseeDisponibile = null;

        switch (numarVarf) {
            case "1":
                traseeDisponibile = traseeRetezat.getTraseeVfRetezat();
                break;
            case "2":
                traseeDisponibile = traseeRetezat.getTraseeVfMare();
                break;
            case "3":
                traseeDisponibile = traseeRetezat.getTraseeVfPeleaga();
                break;
            default:
                detailsLabel.setText("Numar invalid");
                return;
        }
        contentVBox.getChildren().clear();
        traseeVBox.getChildren().clear();
        if (traseeDisponibile != null && !traseeDisponibile.isEmpty()) {
            int index = 1;
            for (TraseuMontan traseu : traseeDisponibile) {
                Label detaliiLabel = new Label(index + ". " + traseu.toString());
                traseeVBox.getChildren().add(detaliiLabel);
                index++;
            }
            contentVBox.getChildren().add(traseeVBox);
        } else {
            detailsLabel.setText("Nu sunt trasee disponibile pentru acest vârf.");
        }
    }

@FXML
    public void iesiDinAplicatie(){
    Platform.exit();
}
    @FXML
    public void afiseazaFormularRecenzie() {

        Label numeLabel = new Label("Scrie numele:");
        TextField numeField = new TextField();

        Label traseuLabel = new Label("Scrie traseul pentru care lași recenzie:");
        TextField traseuField = new TextField();

        Label recenzieLabel = new Label("Scrie recenzia:");
        TextField recenzieField = new TextField();

        Button publicaRecenzieButton = new Button("Publică recenzia");

        Text confirmareText = new Text();

        publicaRecenzieButton.setOnAction(e -> {
            confirmareText.setText("Recenzie postată!");
        });

        recenzieVBox.getChildren().clear();
        recenzieVBox.getChildren().addAll(numeLabel, numeField, traseuLabel, traseuField, recenzieLabel, recenzieField, publicaRecenzieButton, confirmareText);
        contentVBox.getChildren().add(recenzieVBox);
}
}














