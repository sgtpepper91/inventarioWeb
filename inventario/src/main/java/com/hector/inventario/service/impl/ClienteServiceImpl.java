/**
 * 
 */
package com.hector.inventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hector.inventario.dao.ClienteDAO;
import com.hector.inventario.dto.ClientesList;
import com.hector.inventario.general.BaseGeneral;
import com.hector.inventario.general.ExcepcionAplicacion;
import com.hector.inventario.service.ClienteService;

/**
 * @author hecto
 *
 */
@Service
public class ClienteServiceImpl extends BaseGeneral implements ClienteService {
	@Autowired
	private ClienteDAO clienteDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hector.inventario.service.ClienteService#getClientes()
	 */
	@Override
	public ClientesList getClientes() {
		ClientesList clientesList = new ClientesList();
		try {
			clientesList.setClientes(clienteDAO.getClientes());
		} catch (ExcepcionAplicacion e) {
			clientesList.setErrorMessage(e.getMessage());
		}
		return clientesList;

	}

}
