package modelo;

import java.sql.Date;
import java.util.ArrayList;

import javafx.collections.ObservableList;

public class Cita {
	private Paciente paciente;
	private Medico medico;
	private Enfermera enfermera;
	private ObservableList<Medicamento> medicamentos;
	private Date fechaCita;
	public Cita(Paciente paciente, Medico medico, Enfermera enfermera,
			ObservableList<Medicamento> medicamentos, Date fechaCita) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.enfermera = enfermera;
		this.medicamentos = medicamentos;
		this.fechaCita = fechaCita;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Enfermera getEnfermera() {
		return enfermera;
	}
	public void setEnfermera(Enfermera enfermera) {
		this.enfermera = enfermera;
	}
	public ObservableList<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(ObservableList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	public Date getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}
	@Override
	public String toString() {
		return "Cita [paciente=" + paciente + ", medico=" + medico
				+ ", enfermera=" + enfermera + ", medicamentos=" + medicamentos
				+ ", fechaCita=" + fechaCita + "]";
	}
}
