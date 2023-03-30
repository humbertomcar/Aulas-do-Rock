package Atividade9;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Bank person = new Bank();
        int acessarMenu = 0;
        
        System.out.print("Insira o numero da sua conta: ");
            person.acc = s.nextInt();
        System.out.print("Insira a quantidade: ");
            person.amount = s.nextDouble();

        while(acessarMenu != 5){
            System.out.println("O que você deseja realizar? ");
            System.out.println("1 - depositar | 2 - sacar | 3 - mostrar quantidade"
            + " 4- mostrar numero da conta | 5 - sair ");
            acessarMenu = s.nextInt();
            
            if(acessarMenu == 1){
                person.dinheiroDepositado = s.nextDouble();
                System.out.println(person.depositar(person.amount, person.dinheiroDepositado, 
                person.newAmount));
            }
            if(acessarMenu == 2){
                person.dinheiroSacado = s.nextDouble();
                if(person.dinheiroSacado > person.amount){
                    System.out.println("O valor sacado excede a sua quantidade");
                    break;
                }
                System.out.println(person.sacar(person.amount, person.dinheiroSacado, 
                person.newAmount));
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
