/**
 * 
 */
package com.hector.inventario.general;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * @author hecto
 *
 */
public abstract class BaseDAO extends BaseGeneral {

	@Autowired	
	protected NamedParameterJdbcTemplate template;
	
	protected void logQuery(StringBuilder sql, Map<String, Object> params) {
		logger.info("Ejecutando query: " + sql);
		logger.info("params: " + params);
	}
}
