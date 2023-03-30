package Atividade9;

public class Bank {
    protected int acc;
    protected double amount;
    protected double dinheiroSacado;
    protected double dinheiroDepositado;
    protected double newAmount;

    public Bank(){
    }
   
    public double getAcc() {
        return acc;
    }
    public void depositar(double amount, double newAmount, double dinheiroDepositado){
        newAmount = amount + dinheiroDepositado;
    }
    public void sacar(double amount, double dinheiroSacado, double newAmount){
        newAmount = amount - dinheiroSacado;

        if(amount <= 0){
            System.out.println("Você está liso!");
            }
            if(newAmount <= 0){
                System.out.println("Você está liso!");
        }
    }
    public double getAmount() {
        if(newAmount <= 0){
            throw new IllegalStateException("Você está liso!");
        }else{
        return newAmount;
        }
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}