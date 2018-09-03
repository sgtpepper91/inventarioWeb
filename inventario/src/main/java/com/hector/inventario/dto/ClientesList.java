/**
 * 
 */
package com.hector.inventario.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.hector.inventario.general.BaseDTO;

/**
 * @author hecto
 *
 */

@JsonInclude(Include.NON_DEFAULT)
public class ClientesList extends BaseDTO{
	/**
	 * 
	 */
	@JsonInclude(Include.NON_DEFAULT)
	private List<ClienteDTO> clientes;

	/**
	 * @return the clientes
	 */
	public List<ClienteDTO> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes the clientes to set
	 */
	public void setClientes(List<ClienteDTO> clientes) {
		this.clientes = clientes;
	}  
}
