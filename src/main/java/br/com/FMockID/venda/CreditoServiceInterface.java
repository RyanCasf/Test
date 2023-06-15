package br.com.FMockID.venda;

import java.math.BigDecimal;

interface CreditoServiceInterface {
	
	/*
	 * @param String cpf identificador do cliente
	 * @return BigDecimal positivo para qualquer valor v�lido encontrado e null aos demais
	 */
	BigDecimal getLimiteCredito(String cpf);
}