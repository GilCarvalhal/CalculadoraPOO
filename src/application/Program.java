package application;

import javax.swing.JOptionPane;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		String resultado = JOptionPane.showInputDialog("Digite um número:");
		double resultadoFormatado = Double.parseDouble(resultado);

		Calculadora calc = new Calculadora(resultadoFormatado);

		String op = JOptionPane
				.showInputDialog("(-) Subtrair , (+) Somar , (*) Multiplicar , (/) Dividir , (X) Para sair")
				.toUpperCase();

		while (op.equals("*") || op.equals("-") || op.equals("+") || op.equals("/")) {
			calc.setOp(op);
			String entrada = JOptionPane.showInputDialog("Digite um valor:");
			double entradaFormatada = Double.parseDouble(entrada);
			calc.setEntrada(entradaFormatada);
			calc.operacao();
			op = JOptionPane.showInputDialog("Resultado: " + calc.getResultado() + "\n "
					+ "(-) Subtrair , (+) Somar , (*) Multiplicar , (/) Dividir , (X) Para sair").toUpperCase();
		}
		if (op.equals("X")) {
			JOptionPane.showMessageDialog(null, "Programa finalizado.");
		} else {
			JOptionPane.showMessageDialog(null, "Comando inválido.");
		}
	}

}
