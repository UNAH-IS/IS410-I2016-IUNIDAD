package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import clases.Agente;
import clases.Aval;
import clases.Pago;
import clases.Prestamo;
import clases.Prestatario;
import clases.Sucursal;

public class ControladorVistaPagosPrestamo implements Initializable{
	private ObservableList<Prestamo> prestamos;
	private ObservableList<Pago> pagos;
	
	
	@FXML private ComboBox<Prestamo> cboPrestamos;
	@FXML private TextField txtFechaPago;
	@FXML private TextField txtMonto;
	@FXML private TextField txtMoneda;
	@FXML private TextField txtNumeroCuota;
	//@FXML private ListView<> lstPagos;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		llenarInformacion();
		pagos = FXCollections.observableArrayList();
			/*Para agregar el evento del listview (Cuando el usuario selecciona un registro) descomente el codigo
			 * que se muestra a continuacion y sustituya los datos correspondientes para nombreListView y TipoDato

			    nombreListView.getSelectionModel().
				selectedItemProperty().
				addListener(new ChangeListener<TipoDato>() {
					@Override
					public void changed(
							ObservableValue<? extends TipoDato> arg0,
							TipoDato valorAnterior, 
							TipoDato valorSeleccionado) {
						
					}
				}); */
	}
	
	public void llenarInformacion(){
		prestamos = FXCollections.observableArrayList();
		cboPrestamos.setItems(prestamos);
		Prestamo p1 = new Prestamo(
				"P0001",
				new Prestatario("Juan","Perez","5456456",
						"M","22/22/2222","22/22/2222"
						),
				new Aval("Matusalen","Rodriguez",
						"21321321","M",
						"22/22/2222",444,213),
				new Aval("Matusalen","Rodriguez",
								"21321321","M",
								"22/22/2222",444,213),
				new Agente("Pedro","Lainez","54354354",
						"M","22/22/2222",45646,15132),
				new Sucursal("Sucursal 1","Col Kennedy", "424654")
		);
		prestamos.add(p1);
	}
	
	@FXML
	public void guardarRegistro(){
		pagos.add(
			new Pago(
				cboPrestamos.getSelectionModel().getSelectedItem(),
				txtFechaPago.getText(),
				txtMonto.getText(),
				txtNumeroCuota.getText(),
				txtMoneda.getText()
			)
		);
	}
	
	@FXML
	public void actualizarRegistro(){
		
	}
	
	@FXML
	public void eliminarRegistro(){
		
	}
}
