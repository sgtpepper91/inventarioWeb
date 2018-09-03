/**
 * 
 */
package com.hector.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hector.inventario.dto.ClientesList;
import com.hector.inventario.general.BaseGeneral;
import com.hector.inventario.service.ClienteService;

/**
 * @author hecto
 *
 */
@Controller

public class InventarioController extends BaseGeneral{
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/getClientes", method = RequestMethod.GET)
	@ResponseBody
	public ClientesList getClientes() {
		logger.debug("Entró a /getClientes");
		return clienteService.getClientes();
	}
}
