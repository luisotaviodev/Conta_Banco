
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        CadastrarCliente();
    }

    public static void CadastrarCliente(){
      String [] aDadosCadastro = {"o Numero da Conta: ", "a Agencia: ", "o Nome do Cliente: ", "o Saldo: "};
      Scanner scanner = new Scanner(System.in);
      int iNumero = 0;
      String cAgencia = "";
      String cCliente = "";
      double nSaldo = 0.0;

      for (int i = 0; i < aDadosCadastro.length; i++) {
        System.out.println("Digite " + aDadosCadastro[i]);
        if (i == 0){
          iNumero = scanner.nextInt();          
          scanner.nextLine();
        }else if (i == 1) {
          cAgencia = scanner.nextLine();          
        }else if (i == 2) {
          cCliente = scanner.nextLine();          
        }else if (i == 3) {
          nSaldo = scanner.nextDouble();          
        }
      }  
     System.out.printf("Dados Cadastrados com Sucesso...\nNumero: %s\nAgencia: %s\nCliente: %s\nSaldo: %.2f"
                      ,iNumero, cAgencia, cCliente, nSaldo);
     scanner.close();                      
    }
}
