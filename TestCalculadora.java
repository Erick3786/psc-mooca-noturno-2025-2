import javax.swing.JOptionPane;

public class TestCalculadora extends Calculadora{ 



    public static void main (String[] args){

        Calculadora calc = new Calculadora();
         CalculadoraCientifica cc = new CalculadoraCientifica();
         
        int op = Integer.parseInt (JOptionPane.showInputDialog("1-Soma(2 numero)\n2-Subtração(3 numero)\n3-Multiplicação(4 numero)\n4-Divisão"));
        
        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o primeiro operando?"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o segundo operando?"));
       
        double resultado;

        if (op ==1){
            resultado = calc.soma(operando1, operando2);
            JOptionPane.showMessageDialog(null, "resultado da soma é "+resultado);
        }
        else if(op ==2){
             double operando3 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o Terceiro operando?")); 
             resultado = calc.soma(operando1, operando2, operando3);
             JOptionPane.showMessageDialog(null, "resultado da divisão é "+resultado);
        }
        else if(op ==3){
             resultado = calc.multiplicao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "resultado da Multiplicação é "+resultado);
        }
        else if(op ==4){
             resultado = calc.subtracao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "resultado da Subtração é "+resultado);
        }else{
            JOptionPane.showMessageDialog(null,"Opção invalida");
        }
    }
}