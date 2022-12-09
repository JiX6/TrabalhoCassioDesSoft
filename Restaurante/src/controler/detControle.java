package controler;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;



public class detControle{
	
	
	
	
	
	
	@FXML
	protected void btVoltarCadastro(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	
	@FXML
	protected void btCadFun(ActionEvent e) {
		
		menu.trocarTela("cadFun");
	}
	
	@FXML
	protected void btOKFun(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	
	@FXML
	protected void btCanFun(ActionEvent e) {
		
		menu.trocarTela("cad");
	}
	
	@FXML
	protected void btCadCard(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	
	@FXML
	protected void btCanCard(ActionEvent e) {
		
		menu.trocarTela("cad");
	}
	
	@FXML
	protected void btCardapio(ActionEvent e) {
		
		menu.trocarTela("cadCard");
	}
	
	@FXML
	protected void btOkClie(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	
	@FXML
	protected void btCanClie(ActionEvent e) {
		
		menu.trocarTela("cad");
	}
	@FXML
	protected void btCliente(ActionEvent e) {
		
		menu.trocarTela("cadClie");
	}
	@FXML
	protected void btOKFor(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	@FXML
	protected void btCanFor(ActionEvent e) {
		
		menu.trocarTela("cad");
	}
	@FXML
	protected void btnFornecedor(ActionEvent e) {
		
		menu.trocarTela("cadFor");
	}
	
	@FXML
	protected void btVoltCard(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	@FXML
	protected void btVoltMesa(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	@FXML
	protected void btVoltCoz(ActionEvent e) {
		
		menu.trocarTela("menu");
	}
	
	@FXML
	protected void btVoltPag(ActionEvent e) {
		
		menu.trocarTela("menu");
	}

	
}
