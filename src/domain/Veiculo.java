/*******************************************************************************
 * Copyright 2013 Fabio D. C. Depin <fabiodepin@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 * Fabio D. C. Depin <fabiodepin@gmail.com> - initial implementation this Class
 ******************************************************************************/

package domain;

import java.util.Date;

public abstract class Veiculo {

	private int hora;
	private Pessoa proprietario;
	private String placa;
	private String modelo;
	private Tipo tipo;
	
	@SuppressWarnings("deprecation")
	public Veiculo(Pessoa proprietario, String placa, String modelo, Tipo tipo) {
		this.proprietario = proprietario;
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		
		Date date = new Date();
		this.hora = date.getHours();
	}
	
	public Tipo getTipo() {
		return tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public int getHora() {
		return hora;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public String getModelo() {
		return modelo;
	}
	
	public abstract double getCustoInicial();
	public abstract double getCustoAdicional();
}
