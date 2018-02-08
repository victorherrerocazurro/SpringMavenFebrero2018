package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio implements IServicio {

	//@Autowired
	private IPersistencia persistencia;
	
	/*@Autowired
	public void setPersistencia(IPersistencia persistencia) {
		this.persistencia = persistencia;
	}*/
	
	@Autowired
	private Servicio(IPersistencia persistencia) {
		super();
		this.persistencia = persistencia;
	}



	/* (non-Javadoc)
	 * @see com.ejemplo.IServicio#ejecutarRequisito()
	 */
	public void ejecutarRequisito() {
		// Dentro de todas las tareas que ha de realizar alguna de ellas
		//será con el entorno depersistencia
		persistencia.actualizar();
		
	}

}
