package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_tipo")
@Data
public class Tipo {
	@Id
	private int cod_tipo_atencion;
	private String nom_tipo_atencion;
	private Double precio;

}
