package Atividade9;
import java.util.Scanner;

public class Bank {
    public enum operacoes{
        Depositar, 
        Sacar,
        Conta,
        Abrir
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valor;
        double saldo = 0;
        int acc = 0;
        int criar = 0;
        int agenda = 0;
        int swit = 0;
        
        System.out.println("Insira a ação desejada:");
        System.out.println("1 - Depositar | 2 - Sacar | 3 - Registrar");
        while (agenda == 0){
            criar = s.nextInt();
            if(criar == 1){
                System.out.print("Quanto você deseja depositar? ");
                valor = s.nextDouble();
                saldo += valor;
                swit = 2;
            }
            if(criar == 2){
                System.out.print("Quanto você deseja sacar? ");
                valor = s.nextDouble();
                if(valor > saldo){
                    System.out.println("Dinheiro insuficiente!");
                }else{
                    saldo -= valor;
                    swit = 2;
                }
            }
            if(criar == 3){
                System.out.print("Digite sua conta: ");
                acc = s.nextInt();
                swit = 1;
            }
            if(criar == 4){
                System.out.println("Você saiu");
                break;
            }
            switch(swit){
               
                case 1:
                operacoes conta = operacoes.Conta;
                System.out.println("Sua conta é : " + acc);
                break;

                case 2:
                operacoes quantia = operacoes.Abrir;
                System.out.println("Saldo atual: " + saldo);
                break;
            }
            System.out.println("Insira a ação desejada:");
            System.out.println("1 - Depositar | 2 - Sacar | 3 - Registrar | 4 - Sair");
            
        }
    }
}

