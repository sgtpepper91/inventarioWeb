/**
 * 
 */
package com.hector.inventario.service;

import com.hector.inventario.dto.ClientesList;
import com.hector.inventario.general.ExcepcionAplicacion;

/**
 * @author hecto
 *
 */
public interface ClienteService {
	/**
	 * Devuelve la lista de clientes
	 * @return List<ClienteDTO>
	 * @throws ExcepcionAplicacion 
	 */
	ClientesList getClientes();
}
