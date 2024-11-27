package Controller;

import com.example.p2.MainApplication;
import Utilizator.Utilizator;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class UtilizatorController {

    @FXML
    private TextField numeField;

    @FXML
    private Button incepatorButton;

    @FXML
    private Button intermediarButton;

    @FXML
    private Button avansatButton;

    @FXML
    private Button createButton;

    @FXML
    private Label detailsLabel;

    private Utilizator utilizator;
private String nivelDeExperienta;
    @FXML
    public void initialize() {
        incepatorButton.setOnAction(event -> selectNivel("Începător"));
        intermediarButton.setOnAction(event -> selectNivel("Intermediar"));
        avansatButton.setOnAction(event -> selectNivel("Avansat"));
        createButton.setOnAction(event->UtilizatorButton());
       createButton.setOnAction(event ->{
           String nume = numeField.getText();
           if (nume != null && !nume.isEmpty() && nivelDeExperienta != null) {
               utilizator = new Utilizator(nume, nivelDeExperienta);
               detailsLabel.setText( utilizator.afiseazaDetalii());
               try{
                   ((MainApplication)MainApplication.getInstance()).deschideTraseu();
               }catch (IOException e){
                   e.printStackTrace();
               }
           } else {
               detailsLabel.setText("Completează toate câmpurile.");
           }
       });
    }
    private void selectNivel(String nivelSelectat) {
        nivelDeExperienta = nivelSelectat;
    }


        public void UtilizatorButton() {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Varfuri.fxml"));
                TraseeRetezatController traseeRetezatController = loader.getController();
                Stage stage = new Stage();
                stage.setTitle("Selectează un vârf");
                stage.setScene(new Scene(loader.load()));
                stage.show();
            }catch (IOException e){

                e.printStackTrace();
            }
        }

    }




