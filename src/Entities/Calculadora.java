package Entities;

public class Calculadora {
	private Double resultado = 0.0;
	private Double entrada = 0.0;
	private String op = "";

	public Calculadora(Double resultado) {
		this.resultado = resultado;
	}

	public void soma() {
		resultado = resultado + entrada;
	}

	public void sub() {
		resultado = resultado - entrada;
	}

	public void div() {
		resultado = resultado / entrada;
	}

	public void mult() {
		resultado = resultado * entrada;
	}

	public void operacao() {
		if (op.equals("*")) {
			mult();
		} else if (op.equals("/")) {
			div();
		} else if (op.equals("+")) {
			soma();
		} else if (op.equals("-")) {
			sub();
		}
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getEntrada() {
		return entrada;
	}

	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

}
