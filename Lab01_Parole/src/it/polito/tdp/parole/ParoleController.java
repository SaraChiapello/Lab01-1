//https://github.com/SaraChiapello/Lab01-1.git
	package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */




import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	Parole elenco ;
	String parolaInserita;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnReset;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancella"
    private Button btnCancella; // Value injected by FXMLLoader
   
    @FXML // fx:id="txtTime"
    private TextArea txtTime; // Value injected by FXMLLoader

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	try {
        	parolaInserita=txtParola.getText();
        	} catch(NumberFormatException e){
        		txtResult.setText("Inserisci un numero");
        		return;
        	}
		double start = System.nanoTime();
    	elenco.addParola(parolaInserita);
		double stop = System.nanoTime();
    	elenco.getElenco();
		txtResult.setText(elenco.toString());
		

		txtTime.clear();
		txtTime.setText("[INSERT]: " + (stop - start) / 1e9 + " seconds");
		txtParola.clear();
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO
		double start = System.nanoTime();
    	elenco.reset();
		double stop = System.nanoTime();

    	
		txtResult.setText(elenco.toString());
		txtTime.clear();
		txtTime.setText("[INSERT]: " + (stop - start) / 1e9 + " seconds");

    }
    

    @FXML
    void doCancella(ActionEvent event) {
    	try {
        	parolaInserita=txtParola.getText();
        	} catch(NumberFormatException e){
        		txtResult.setText("Inserisci un numero");
        		return;
        	}
		double start = System.nanoTime();
    	elenco.cancellaParola(parolaInserita);
		double stop = System.nanoTime();

    	
    	elenco.getElenco();
		txtResult.setText(elenco.toString());
		
		txtTime.clear();
		txtTime.setText("[INSERT]: " + (stop - start) / 1e9 + " seconds");
		txtParola.clear();
    }
    
    

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Parole.fxml'.";
        
        
        elenco = new Parole() ;
        
    }
}
