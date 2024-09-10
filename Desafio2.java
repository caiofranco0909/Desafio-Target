import javax.swing.JOptionPane;

public class Desafio2 {
   public static int countA(String s){// Função transforma string em um array de caracteres e conta a quantidade de 'a'
        char[] frase = s.toCharArray();
        int count = 0;
        for (char i : frase) {
            if( i == 'a' || i == 'A' ){//Levando em conta que os inputs não terão acento
                count++;
            }
        }
        return count;
   }

    public static void main(String[] args) {//Testes com interface simples
        int option = 0;
        while (option == 0) {
            String frase = JOptionPane.showInputDialog("Digite uma palavra ou frase para identificar a quantidade de letras 'a' na frase");// Recebendo o input                                                                      
            JOptionPane.showMessageDialog(null, "Número de letras A: "+countA(frase));
            option = JOptionPane.showConfirmDialog(null, "Deseja repetir?", null, 0);
        }
    }
}
