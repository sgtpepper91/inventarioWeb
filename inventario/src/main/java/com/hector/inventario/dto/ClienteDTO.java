package com.hector.inventario.dto;

import java.math.BigDecimal;

public class ClienteDTO{

	/**
	 * 
	 */
	private Integer numCliente;
    private String nombreCliente;
    private BigDecimal acumuladoCliente;
    
	/**
	 * @return the numCliente
	 */
	public Integer getNumCliente() {
		return numCliente;
	}
	/**
	 * @param numCliente the numCliente to set
	 */
	public void setNumCliente(Integer numCliente) {
		this.numCliente = numCliente;
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * @return the acumuladoCliente
	 */
	public BigDecimal getAcumuladoCliente() {
		return acumuladoCliente;
	}
	/**
	 * @param acumuladoCliente the acumuladoCliente to set
	 */
	public void setAcumuladoCliente(BigDecimal acumuladoCliente) {
		this.acumuladoCliente = acumuladoCliente;
	}
	

}
