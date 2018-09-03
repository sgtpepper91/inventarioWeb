/**
 * 
 */
package com.hector.inventario.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.hector.inventario.dao.ClienteDAO;
import com.hector.inventario.dto.ClienteDTO;
import com.hector.inventario.general.BaseDAO;
import com.hector.inventario.general.ExcepcionAplicacion;

/**
 * @author hecto
 *
 */
@Repository
public class ClienteDAOImpl extends BaseDAO implements ClienteDAO {

	/* (non-Javadoc)
	 * @see com.hector.inventario.dao.ClienteDAO#getClientes()
	 */
	@Override
	public List<ClienteDTO> getClientes() throws ExcepcionAplicacion {
		try {
			StringBuilder sql = new StringBuilder();
			Map<String, Object> params = new HashMap<>();
			sql.append("SELECT NUMCLIENTE AS numCliente, NOMBRECLIENTE AS nombreCliente, ACUMULADOCLIENTE AS acumuladoCliente")
			.append(" FROM CLIENTES ORDER BY nombreCliente");
			this.logQuery(sql, params);
			return template.query(sql.toString(), params, new BeanPropertyRowMapper<ClienteDTO>(ClienteDTO.class));
		} catch(Exception e) {
			logger.error(e.getMessage(), e);
			throw new ExcepcionAplicacion(e.getMessage());
		}
		
	}

}
