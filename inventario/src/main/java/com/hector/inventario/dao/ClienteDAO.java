/**
 * 
 */
package com.hector.inventario.dao;

import java.util.List;

import com.hector.inventario.dto.ClienteDTO;
import com.hector.inventario.general.ExcepcionAplicacion;

/**
 * @author hecto
 *
 */
public interface ClienteDAO {
	/**
	 * Devuelve la lista de clientes de la tabla Clientes
	 * @return {@link List}
	 * @throws ExcepcionAplicacion 
	 */
	List<ClienteDTO> getClientes() throws ExcepcionAplicacion;

}
