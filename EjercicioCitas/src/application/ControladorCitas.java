package application;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import modelo.Cita;
import modelo.Enfermera;
import modelo.Medicamento;
import modelo.Medico;
import modelo.Paciente;
import modelo.Padecimiento;

public class ControladorCitas implements Initializable{
	@FXML private ComboBox<Paciente> cboPacientes;
	@FXML private ComboBox<Medico> cboMedicos;
	@FXML private ComboBox<Enfermera> cboEnfermeras;
	@FXML private ListView<Medicamento> lstMedicamentos;
	@FXML private ListView<Cita> lstCitas;
	@FXML DatePicker dtpckrFechaCita;
	
	private ObservableList<Paciente> pacientes;
	private ObservableList<Medico> medicos;
	private ObservableList<Medicamento> medicamentos;
	private ObservableList<Enfermera> enfermeras;
	private ObservableList<Cita> citas;
	
	
	public ControladorCitas(){
		//Ningun componentes de la GUI ha sido instanciado
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Todos los componentes de la GUI ya fueron instanciados
		
		//Eventos
		lstCitas.getSelectionModel()
				.selectedItemProperty()
				.addListener(new ChangeListener<Cita>() {

					@Override
					public void changed(
							ObservableValue<? extends Cita> observable,
							Cita oldValue, Cita newValue) {
						// Ejecutar lo que se desea cuando el usuario selecciona un elemento
						System.out.println("Se selecciono un elemento");
						
					}
				});
		//Inicializar ObservableLists
		pacientes = FXCollections.observableArrayList();
		medicos = FXCollections.observableArrayList();
		medicamentos = FXCollections.observableArrayList();
		enfermeras = FXCollections.observableArrayList();
		citas = FXCollections.observableArrayList();
		
		//Enlazar ObservableList con ComboBoxes
		cboPacientes.setItems(pacientes);
		cboMedicos.setItems(medicos);
		cboEnfermeras.setItems(enfermeras);
		lstMedicamentos.setItems(medicamentos);
		lstCitas.setItems(citas);
		//Seleccionar varios valores
		lstMedicamentos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		//Llenar informacion
		ArrayList<Padecimiento> padecimientos = new ArrayList<Padecimiento>();
		padecimientos.add(new Padecimiento("Diabetes","Diabetes",new Date(11,11,2015)));
		
		Paciente p1 = new Paciente(
				"Juan",
				"Perez",
				55,
				"M",
				padecimientos
		);
		pacientes.add(p1);
		
		//Llenar informacion de medicos
		Medico m1 = new Medico("Pedro","Martinez",
				66,"M",555,"Cirujano plastico");
		medicos.add(m1);
		
		//Llenar medicamentos
		Medicamento me1 = new Medicamento("Paracetamol", "Tableta",new Date(11,11,2015));
		Medicamento me2 = new Medicamento("Aspirina", "Tableta",new Date(11,11,2015));
		Medicamento me3 = new Medicamento("Panadol", "Tableta",new Date(11,11,2015));
		Medicamento me4 = new Medicamento("Sudagrip", "Tableta",new Date(11,11,2015));
		medicamentos.add(me1);
		medicamentos.add(me2);
		medicamentos.add(me3);
		medicamentos.add(me4);
		
		//Llenar informacion de enfermeras
		Enfermera e = new Enfermera("Mario", "Juarez",55,"M",12345,"Zika, Chikungunya, Dengue");
		enfermeras.add(e);
	}
	
	//Este metodo se llama desde el boton guardar
	//modificando la propiedad OnAction en el Scene Builder
	@FXML
	public void guardarRegistro(){
		citas.add(
			new Cita(
					cboPacientes.getSelectionModel().getSelectedItem(),
					cboMedicos.getSelectionModel().getSelectedItem(),
					cboEnfermeras.getSelectionModel().getSelectedItem(),
					lstMedicamentos.getSelectionModel().getSelectedItems(),
					Date.valueOf(dtpckrFechaCita.getValue())
			)
		);
	}
	
	@FXML
	public void limpiar(){
		cboPacientes.getSelectionModel().select(null);
		cboMedicos.getSelectionModel().select(null);
		cboEnfermeras.getSelectionModel().select(null);
		lstMedicamentos.getSelectionModel().clearSelection();;
		dtpckrFechaCita.setValue(null);
		
	}
	
}
