package org.jesuitasrioja.com.TFGUltimo.modelo.reserva;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.jesuitasrioja.com.TFGUltimo.modelo.habitacion.Habitacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Reserva")
public class Reserva implements Serializable{
	
	@Id
	@Include
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private Date entrada;
	private Date salida;
	private String pais;	
	private String horario;
	private Boolean tranfer;
	private String telefono;
	private String email;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "habitacion")
	private Habitacion habitacion;

}
