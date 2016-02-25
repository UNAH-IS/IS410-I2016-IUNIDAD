package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
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
	@FXML private TextField txtNumeroCuota;
	@FXML private ListView<Pago> lstPagos;
	@FXML private RadioButton rbtLempiras;
	@FXML private RadioButton rbtDolares;
	
	@FXML private Button btnGuardar;
	@FXML private Button btnActualizar;
	@FXML private Button btnEliminar;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gestionEventos();		
		llenarInformacion();
		pagos = FXCollections.observableArrayList();
		//lstPagos.setItems(pagos);
			/*Para agregar el evento del listview (Cuando el usuario selecciona un registro) descomente el codigo
			 * que se muestra a continuacion y sustituya los datos correspondientes para nombreListView y TipoDato*/

	     
	}
	
	public void gestionEventos(){
		lstPagos.getSelectionModel().
		selectedItemProperty().
		addListener(new ChangeListener<Pago>() {
			@Override
			public void changed(
					ObservableValue<? extends Pago> arg0,
					Pago valorAnterior, 
					Pago valorSeleccionado) {
				if(valorSeleccionado!=null){
					//cboPrestamos.getSelectionModel().select(valorSeleccionado.getPrestamos());
					txtFechaPago.setText(valorSeleccionado.getFecha_pago());
					
					//txtMoneda.setText(valorSeleccionado.getMoneda());
					
					if (valorSeleccionado.getMoneda().equals("Lempiras"))
						rbtLempiras.setSelected(true);
					else 
						rbtDolares.setSelected(true);
					
					txtMonto.setText(valorSeleccionado.getMonto());
					txtNumeroCuota.setText(valorSeleccionado.getNumero_cuota());
					btnGuardar.setDisable(true);
					btnEliminar.setDisable(false);
					btnActualizar.setDisable(false);
				}
			}
		});
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
				new Sucursal("Sucursal 1","Col Kennedy", "424654"),
				FXCollections.observableArrayList()
		);
		prestamos.add(p1);
	}
	
	@FXML
	public void guardarRegistro(){
		/*String moneda = "";
		if (rbtLempiras.isSelected())
			moneda = "Lempiras";
		else 
			moneda = "Dolares";
		*/
		//variable = condicion?RespuestaVerdadera:RespuestaFalsa;
		//moneda = rbtLempiras.isSelected()?"Lempiras":"Dolares";
		
		pagos.add(
			new Pago(
				cboPrestamos.getSelectionModel().getSelectedItem(),
				txtFechaPago.getText(),
				txtMonto.getText(),
				rbtLempiras.isSelected()?"Lempiras":"Dolares",
				txtNumeroCuota.getText()
			)
		);
	}
	
	@FXML
	public void actualizarRegistro(){
		pagos.set(
				lstPagos.getSelectionModel().getSelectedIndex(),
				new Pago(
					cboPrestamos.getSelectionModel().getSelectedItem(),
					txtFechaPago.getText(),
					txtMonto.getText(),
					txtNumeroCuota.getText(),
					rbtLempiras.isSelected()?"Lempiras":"Dolares"
				)
			);
	}
	
	@FXML
	public void eliminarRegistro(){
		pagos.remove(lstPagos.getSelectionModel().getSelectedIndex());
		Alert mensaje = new Alert(AlertType.INFORMATION);
		mensaje.setContentText("Se elimino el registro");
		mensaje.setHeaderText("Accion completada");
		mensaje.setTitle("Registro eliminado");
		mensaje.show();
		nuevoRegistro();
	}
	
	@FXML
	public void nuevoRegistro(){
		cboPrestamos.getSelectionModel().clearSelection();
		txtFechaPago.setText(null);
		rbtLempiras.setSelected(false);
		rbtDolares.setSelected(false);
		txtMonto.setText(null);
		txtNumeroCuota.setText(null);
		lstPagos.getSelectionModel().clearSelection();
		
		btnGuardar.setDisable(false);
		btnEliminar.setDisable(true);
		btnActualizar.setDisable(true);
	}
}
