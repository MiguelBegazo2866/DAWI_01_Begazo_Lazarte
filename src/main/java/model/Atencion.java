package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_atencion")
@Data
public class Atencion {
	@Id
	private int num_atencion;
	private Date fecha;
	private String nom_paciente;
	private int cod_tipo_atencion;
	
	
	@ManyToOne
	@JoinColumn(name="cod_tipo_atencion", insertable= false, updatable= false)
	private Tipo objTipo;
}
