import java.util.Scanner;

public class ContaTerminal {
    static int numero;
    static String agencia;
    static String nomeCliente;
    static Double saldo;
    static Scanner lerTerminal = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Bem-vindo ao Terminal de Atendimento!");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1: Cadastro");
            System.out.println("0: Sair");
            
            int opcao = lerTerminal.nextInt();
            lerTerminal.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Obrigado por usar o Terminal de Atendimento. Até logo!");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }

    public static void cadastrar() {
        System.out.println("Digite seu nome:");
        nomeCliente = lerTerminal.nextLine();

        System.out.println("Digite sua agência:");
        agencia = lerTerminal.nextLine();

        System.out.println("Digite o numero da conta:");
        numero = lerTerminal.nextInt();

        System.out.println("Digite o valor a ser depositado:");
        saldo = lerTerminal.nextDouble();
        lerTerminal.nextLine(); 

        System.out.println("Olá" + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo " + saldo + " já está disponível para saque.");
    }
}
