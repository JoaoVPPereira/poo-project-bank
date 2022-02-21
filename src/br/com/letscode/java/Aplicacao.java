package br.com.letscode.java;

public class Aplicacao {

    public static void main(String[] args) {

        Cliente Maria = new ClientePF("Maria", "Rua 1, 1548", "(19) 99456-9852", "maria@gmail.com", "49714570034", 28);
        Cliente Pedro = new ClientePF("Pedro", "Rua 2, 3229", "(16) 99931-6760", "pedro@gmail.com", "28310482060", 37);
        Cliente Loja = new ClientePJ("Loja de Veículos", "Rua 3, 2842", "(11) 3722-2678", "loja@gmail.com", "78373918000173", "288235890732");
        Cliente Fabrica = new ClientePJ("Fabrica de Calçados", "Rua 4, 1511", "(11) 3704-8617", "fabrica@gmail.com", "62774783000118", "564151245643");

        Conta conta1 = new ContaCorrente("041", "2154887-8", 0, Maria);
        Conta conta2 = new ContaInvestimento("035", "3112649-1", 0, Loja);
        Conta conta3 = new ContaPoupanca("001", "3486521-8", 0, Pedro);
        Conta conta4 = new ContaCorrente("062", "1452797-5", 0, Fabrica);
        Conta conta5 = new ContaInvestimento("041", "1564863-4", 0, Maria);

        conta1.depositar(800);
        System.out.println(conta1);
        conta1.sacarPF(200);
        System.out.println(conta1);

        conta2.investirPJ(15000);
        System.out.println(conta2);
        conta2.sacarPJ(5000);
        System.out.println(conta2);

        conta3.depositar(4000);
        System.out.println(conta3);
        conta3.sacarPF(1000);
        System.out.println(conta3);
        conta3.sacarPF(5000);
        System.out.println(conta3);

        conta4.depositar(50000);
        System.out.println(conta4);
        conta4.sacarPJ(6000);
        System.out.println(conta4);

        conta5.investirPF(1600);
        System.out.println(conta5);
        conta5.sacarPF(400);
        System.out.println(conta5);

        conta4.transferir(conta1, 1200);
        System.out.println(conta4);
        System.out.println(conta1);

        conta1.consultarSaldo();
        conta2.consultarSaldo();
        conta3.consultarSaldo();
        conta4.consultarSaldo();

    }

}
