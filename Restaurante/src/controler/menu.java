package controler;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class menu extends Application {
	private static Stage stage;
	
	private static Scene menuScene;
	private static Scene cadScene;
	private static Scene cadFunScene;
	private static Scene cadCardScene;
	private static Scene cadClieScene;
	private static Scene cadForScene;
	private static Scene cardScene;
	private static Scene mesaScene;
	private static Scene cozScene;
	private static Scene pagScene;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		stage = primaryStage; 
		
		Parent fxmlMenu = FXMLLoader.load(getClass().getResource("../telas/menu.fxml"));
		menuScene = new Scene(fxmlMenu, 600, 400);
		
		Parent fxmlCad = FXMLLoader.load(getClass().getResource("../telas/cadastros.fxml"));
		cadScene = new Scene(fxmlCad, 600, 400);
		
		Parent fxmlCadFun = FXMLLoader.load(getClass().getResource("../telas/cadFuncionarios.fxml"));
		cadFunScene = new Scene(fxmlCadFun, 600, 400);
		
		Parent fxmlCadCard = FXMLLoader.load(getClass().getResource("../telas/cadCardapio.fxml"));
		cadCardScene = new Scene(fxmlCadCard, 600, 400);
		
		Parent fxmlCadClie = FXMLLoader.load(getClass().getResource("../telas/cadCliente.fxml"));
		cadClieScene = new Scene(fxmlCadClie, 600, 400);
		
		Parent fxmlCadFor = FXMLLoader.load(getClass().getResource("../telas/cadFornecedor.fxml"));
		cadForScene = new Scene(fxmlCadFor, 600, 400);
		
		Parent fxmlCard = FXMLLoader.load(getClass().getResource("../telas/cardapio.fxml"));
		cardScene = new Scene(fxmlCard, 600, 400);
		
		Parent fxmlMesa = FXMLLoader.load(getClass().getResource("../telas/controleMesa.fxml"));
		mesaScene = new Scene(fxmlMesa, 600, 400);
		
		Parent fxmlCoz = FXMLLoader.load(getClass().getResource("../telas/cozinha.fxml"));
		cozScene = new Scene(fxmlCoz, 600, 400);
		
		Parent fxmlPag = FXMLLoader.load(getClass().getResource("../telas/Pagamento.fxml"));
		pagScene = new Scene(fxmlPag, 600, 400);
		
		
		primaryStage.setTitle("Restaurante");
		primaryStage.setScene(menuScene);
		primaryStage.show();
	}
	
	public static void trocarTela(String scr, Object userData) {
		switch (scr) {
		case "menu":
			stage.setScene(menuScene);
			notifyAllListners("menu", userData);
			break;
		case "cad":
			stage.setScene(cadScene);
			notifyAllListners("cad", userData);
			break;
		case "cadFun":
			stage.setScene(cadFunScene);
			notifyAllListners("cadFun", userData);
			break;
		case "cadCard":
			stage.setScene(cadCardScene);
			notifyAllListners("cadCard", userData);
			break;
		case "cadClie":
			stage.setScene(cadClieScene);
			notifyAllListners("cadClie", userData);
			break;
		case "cadFor":
			stage.setScene(cadForScene);
			notifyAllListners("cadFor", userData);
			break;
		case "card":
			stage.setScene(cardScene);
			notifyAllListners("card", userData);
			break;
		case "mesa":
			stage.setScene(mesaScene);
			notifyAllListners("mesa", userData);
			break;
		case "coz":
			stage.setScene(cozScene);
			notifyAllListners("coz", userData);
			break;
		case "pag":
			stage.setScene(pagScene);
			notifyAllListners("pag", userData);
		}
	}
	
	public static void trocarTela(String scr) {
		trocarTela(scr, null);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	private static ArrayList<OnTrocarTela> Listeners = new ArrayList<>();
	
	public static interface OnTrocarTela {
		void OnTelaTrocar(String newSreen, Object userData);
	}
	
	public static void addOnTrocarTelaListeners(OnTrocarTela newListener) {
		Listeners.add(newListener);
	}
	
	public static void notifyAllListners(String newSreen, Object userData) {
		for (OnTrocarTela l : Listeners)
			l.OnTelaTrocar(newSreen, userData);
	}
}
