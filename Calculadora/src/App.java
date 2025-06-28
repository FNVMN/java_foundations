import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num1String = JOptionPane.showInputDialog("Digite o 1°: ");
        String num2String = JOptionPane.showInputDialog("Digite o 2°: ");
        Double num1 = Double.parseDouble(num1String);
        Double num2 = Double.parseDouble(num2String);

        Calculadora c1 = new Calculadora();
        c1.setNum1(num1);
        c1.setNum2(num2);

        c1.visualizar("+");
    }
}
