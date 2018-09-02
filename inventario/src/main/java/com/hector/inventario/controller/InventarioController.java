/**
 * 
 */
package com.hector.inventario.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hecto
 *
 */
@Controller

public class InventarioController {
	
	private static final Logger logger = Logger.getLogger(InventarioController.class);
	
	
	@RequestMapping(value = "/getClientes", method = RequestMethod.GET)
	@ResponseBody
	public String getClientes() {
		logger.debug("Entró a /getClientes");
		List<String> response = new ArrayList<>();
		response.add("cliente1");
		response.add("cliente2");
		response.add("cliente3");
		response.add("cliente4");
		response.add("cliente5");
		response.add("cliente6");
		response.add("cliente7");
		response.add("cliente8");
		response.add("cliente9");
		response.add("cliente10");
		ObjectMapper mapper = new ObjectMapper();
		String respuesta = null;
		try {
			respuesta = mapper.writeValueAsString(response);
		} catch (IOException e) {
			logger.error(e);
		}
		return respuesta;		
		
	}

}
