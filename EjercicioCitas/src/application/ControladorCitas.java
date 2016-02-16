package application;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import modelo.Medicamento;
import modelo.Medico;
import modelo.Paciente;
import modelo.Padecimiento;

public class ControladorCitas implements Initializable{
	@FXML private ComboBox<Paciente> cboPacientes;
	@FXML private ComboBox<Medico> cboMedicos;
	@FXML private ListView<Medicamento> lstMedicamentos;
	
	private ObservableList<Paciente> pacientes;
	private ObservableList<Medico> medicos;
	private ObservableList<Medicamento> medicamentos;
	
	
	public ControladorCitas(){
		//Ningun componentes de la GUI ha sido instanciado
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Todos los componentes de la GUI ya fueron instanciados
		//Inicializar ObservableLists
		pacientes = FXCollections.observableArrayList();
		medicos = FXCollections.observableArrayList();
		medicamentos = FXCollections.observableArrayList();
		
		//Enlazar ObservableList con ComboBoxes
		cboPacientes.setItems(pacientes);
		cboMedicos.setItems(medicos);
		lstMedicamentos.setItems(medicamentos);
		
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
		
		
		Medico m1 = new Medico("Pedro","Martinez",
				66,"M",555,"Cirujano plastico");
		medicos.add(m1);
		
		Medicamento me1 = new Medicamento("Paracetamol", "Tableta",new Date(11,11,2015));
		medicamentos.add(me1);
	}
	
	
	
	
}
