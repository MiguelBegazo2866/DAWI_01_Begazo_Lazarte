package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_atencion")
@Data
public class Atencion {
	private int num_atencion;
	private Date fecha;
	private String nom_paciente;
	private int cod_tipo_atencion;
	
	public Atencion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Atencion(int num_atencion, Date fecha, String nom_paciente, int cod_tipo_atencion) {
		super();
		this.num_atencion = num_atencion;
		this.fecha = fecha;
		this.nom_paciente = nom_paciente;
		this.cod_tipo_atencion = cod_tipo_atencion;
	}
	@Override
	public String toString() {
		return "Atencion [num_atencion=" + num_atencion + ", fecha=" + fecha + ", nom_paciente=" + nom_paciente
				+ ", cod_tipo_atencion=" + cod_tipo_atencion + "]";
	}
	public int getNum_atencion() {
		return num_atencion;
	}
	public void setNum_atencion(int num_atencion) {
		this.num_atencion = num_atencion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNom_paciente() {
		return nom_paciente;
	}
	public void setNom_paciente(String nom_paciente) {
		this.nom_paciente = nom_paciente;
	}
	public int getCod_tipo_atencion() {
		return cod_tipo_atencion;
	}
	public void setCod_tipo_atencion(int cod_tipo_atencion) {
		this.cod_tipo_atencion = cod_tipo_atencion;
	}
	
}
