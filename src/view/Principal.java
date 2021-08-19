package view;
import controller.InverterString;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		InverterString in = new InverterString();
		
		String texto = JOptionPane.showInputDialog("Digite o texto: ");
		String inversor = in.inversor(texto, texto.length());
		System.out.print(inversor);
	}
}