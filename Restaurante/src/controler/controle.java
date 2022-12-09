package controler;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;



public class controle implements Initializable{
	
	
	
	@FXML
	private ListView<String> lvMesaDisp;
	
	String[] MesaDis = {"Mesa 02 Disponivel", "Mesa06 Disponivel", "Mesa07 Disponivel", "Mesa08 Disponivel", "Mesa10 Disponivel"};
	
	String currentMesaDis;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		lvMesaDisp.getItems().addAll(MesaDis);
	}
	
	

	
	
	
	@FXML
	protected void btCadastrosAction(ActionEvent e) {
		
		menu.trocarTela("cad", "detalhes");
	}
	
	@FXML
	protected void btCardapioAction(ActionEvent e) {
		
		menu.trocarTela("card", "detalhes");
	}
	
	@FXML
	protected void btMesaAction(ActionEvent e) {
		
		menu.trocarTela("mesa", "detalhes");
	}
	
	@FXML
	protected void btCozAction(ActionEvent e) {
		
		menu.trocarTela("coz", "detalhes");
	}
	
	@FXML
	protected void btPagAction(ActionEvent e) {
		
		menu.trocarTela("pag", "detalhes");
	}

	
	
	
}
