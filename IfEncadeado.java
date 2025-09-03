import javax.swing.JOptionPane;

public class IfEncadeado{
        public static void main (String[] args){
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Aluno"));

            if (nota > 7){
                
                System.out.println ("Aprovado");
            }else if(nota>= 5 && nota < 7){
                System.out.println("Recuperação");
            }else{
                System.aut.println("Rprovado");
            }

    }
}'  '