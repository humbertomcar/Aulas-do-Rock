package Atividade9;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Bank person = new Bank();
        double deposito = person.dinheiroDepositado;
        double saque = person.dinheiroSacado;
        double quantia = person.amount;
        int conta = person.acc;
        int acessarMenu = 0;
        
        System.out.println("Insira o numero da sua conta: ");
            conta = s.nextInt();
        System.out.print("Insira a quantidade: ");
            quantia = s.nextDouble();

        while(acessarMenu != 5){
            System.out.println("O que você deseja realizar? ");
            System.out.println("1 - depositar | 2 - sacar | 3 - mostrar quantidade"
            + " 4- mostrar numero da conta");
            acessarMenu = s.nextInt();
            
            if(acessarMenu == 1){
                deposito = s.nextDouble();
                System.out.println(person.getAmount());
            }
            if(acessarMenu == 2){
                saque = s.nextDouble();
                System.out.println(person.getAmount());
            }
            if(acessarMenu == 3){
                System.out.println(person.getAmount());
            }
            if(acessarMenu == 4){
                System.out.println(person.getAcc());
            }
        }
        s.close();
    }
}
