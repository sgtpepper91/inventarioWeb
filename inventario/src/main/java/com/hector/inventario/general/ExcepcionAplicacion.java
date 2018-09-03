/**
 * 
 */
package com.hector.inventario.general;

/**
 * @author hecto
 *
 */
public class ExcepcionAplicacion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7020547137873952145L;

	public ExcepcionAplicacion() {
	}

	public ExcepcionAplicacion(String message) {
		super(message);
	}

	public ExcepcionAplicacion(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionAplicacion(Throwable cause) {
		super(cause);
	}

	public ExcepcionAplicacion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
