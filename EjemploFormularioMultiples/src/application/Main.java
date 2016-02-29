package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private Stage formulario1;
	private Stage formulario2;
	private ControladorPrincipal controladorPrincipal;
	
	
	@Override
	public void start(Stage stagePrincipal) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("VistaPrincipal.fxml"));
			BorderPane root = (BorderPane)loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stagePrincipal.setScene(scene);
			//stagePrincipal.setFullScreen(true);
			//stagePrincipal.setOpacity(0.9);
			stagePrincipal.setTitle("Formulario principal");
			controladorPrincipal = loader.getController();
			controladorPrincipal.setMain(this);
			stagePrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarFormulario1(){
		if(formulario1==null){
			formulario1 = new Stage();
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("VistaFormulario1.fxml"));
				Scene scene = new Scene(root);
				formulario1.setScene(scene);
				formulario1.setTitle("Formulario 1");				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		formulario1.show();
	}
	
	public void mostrarFormulario2(){
		if(formulario2==null){
			formulario2 = new Stage();
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("VistaFormulario2.fxml"));
				Scene scene = new Scene(root);
				formulario2.setScene(scene);
				formulario2.setTitle("Formulario 2");				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		formulario2.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
