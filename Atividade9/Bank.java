package Atividade9;

public class Bank {
    protected int acc;
    protected double amount;
    protected double dinheiroSacado;
    protected double dinheiroDepositado;
    protected double newAmount;

    public Bank(){
    }
    public Bank(int acc, double amount, double dinheiroDepositado, double dinheiroSacado
    , double newAmount){
        this.acc = acc;
        this.amount = amount;
        this.dinheiroDepositado = dinheiroDepositado;
        this.dinheiroSacado = dinheiroSacado;
        this.newAmount = newAmount;
    }
    public double getAcc() {
        return acc;
    }
    public double depositar(double amount, double dinheiroDepositado, double newAmount){
        if(newAmount != 0) {
            newAmount = newAmount + dinheiroDepositado;
        }
        newAmount = amount + dinheiroDepositado;
        
        return newAmount;
    }
    public double sacar(double amount, double dinheiroSacado, double newAmount){
        if(newAmount != 0) {
            newAmount = newAmount - dinheiroSacado;
        }else{
            newAmount = amount - dinheiroSacado;
        }
        if(newAmount <= 0){
            throw new RuntimeException("Você está liso!");
        }
        return newAmount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getNewAmount(){
        return newAmount;
    }
}