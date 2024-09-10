import javax.swing.JOptionPane;

public class Desafio1 {
    public static int Fibonacci(int num) {// Essa é a função básica que retorna o número de Fibonnaci dada a fórmula F(n) = F(n-1) + F(n-2)
                                            //Com números muito altos essa função pode gastar muito tempo e poder computacional

        switch (num) {
            case 0: // casos base
                return 0;
            case 1:
                return 1;
            default: // recursão para outros casos
                return Fibonacci(num - 1) + Fibonacci(num - 2);
        }
    }
    public static double AlternativeFibonacci(int num){//Essa é a fórmula da sequência de Fibonacci, que dado um valor ela retorna o núemero de Fibonacci daquela posição 
        double fibNum = 0;
       for (int i = 0; fibNum < num; i++) {//É feita um comparação de forma crescente com todos os números da sequência
            fibNum = (1/Math.sqrt(5))*((Math.pow(((1+Math.sqrt(5))/2),i))-(Math.pow(((1-Math.sqrt(5))/2),i)));
       }
       return (int)fibNum; //como o resultado da fórmula pode conter decimais extramente pequenos que atrapalhariama a comparação eu retorno o valor com inteiro
    }

    public static boolean isFibonacci(int num) {// Verifica se o número faz parte da sequência
        if (num == AlternativeFibonacci(num)) {// **** Mude para Fibonacci(num) se quiser utilizar a forma RECURSSIVA ****
            return true;
        }
        return false;
    }

    public static void main(String[] args) {//Testes com interface simples
        int option = 0;
        while (option == 0) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se faz parte da sequência de Fibonacci"));// Recebendo o input                                                                      
            if (isFibonacci(num)) {
                JOptionPane.showMessageDialog(null, "Faz parte");
            } else {
                JOptionPane.showMessageDialog(null, "Não faz parte");
            }
            option = JOptionPane.showConfirmDialog(null, "Deseja repetir?", null, 0);
        }
    }
}
