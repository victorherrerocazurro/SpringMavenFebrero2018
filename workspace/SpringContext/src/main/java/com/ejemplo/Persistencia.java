package com.ejemplo;

import org.springframework.stereotype.Repository;

@Repository
public class Persistencia implements IPersistencia {

	/* (non-Javadoc)
	 * @see com.ejemplo.IPersistencia#actualizar()
	 */
	public void actualizar() {
		System.out.println("sorprendentemente hemos llegado a la persistencia");
		
	}

}
