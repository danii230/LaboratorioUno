    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriounoprogra;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;

/**
 *
 * @author daniela
 */
public class FXMLDocumentController implements Initializable {

    Operaciones op ;
    @FXML private Label labelAgregar;
    @FXML private Label labelValorFijo;
    @FXML private TextField tfAgregar;
    @FXML private TextField tfMuestraResult;
    @FXML private ComboBox cbSeleccionarFruta;
    @FXML private Button btAgregar;
    @FXML private Button btRealizarOperacion;  
    
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        op = new Operaciones();
        for (int i = 0; i < op.getFilaColumna().size(); i++) {
            cbSeleccionarFruta.getItems().add(op.getFilaColumna().get(i));
        }

    }    
    
 
     @FXML
    public void accionRealizarOperacion(ActionEvent event) {
     
     String frutaSeleccionada = (String) cbSeleccionarFruta.getSelectionModel().getSelectedItem();
     String valorFijo = labelValorFijo.getText();
     String resultado = (op.sumar(valorFijo,frutaSeleccionada));
     tfMuestraResult.setText(resultado);
     labelValorFijo.setText(resultado);
     
    }
}
