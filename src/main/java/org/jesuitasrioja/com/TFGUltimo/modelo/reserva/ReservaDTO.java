package org.jesuitasrioja.com.TFGUltimo.modelo.reserva;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaDTO {
	private Integer id;
	private Date fechaEntrada;
	private Date fechaSalida;
}
