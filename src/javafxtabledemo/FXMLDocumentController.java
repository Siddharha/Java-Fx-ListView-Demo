/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtabledemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author siddhartha
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ListView<String> lvItems;
    @FXML
    private TextField tfItemInput;
 ObservableList<String> data;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      data =  FXCollections.observableArrayList();
      lvItems.setItems(data);
      
    }   
    
    @FXML
    private void btnAdd(Event e){
        
        if(!tfItemInput.getText().isEmpty()){
             data.add(tfItemInput.getText());
             tfItemInput.setText("");
        }else{
            showAlertMessage();
        }
      
    }

    private void showAlertMessage() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("Can't Add Empty!");
        alert.show();
        }

    
}
