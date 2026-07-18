package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;
public class ProgramBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
         BankAccount  banco;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String resposta = sc.nextLine();
        if (resposta.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
           banco = new BankAccount(number, holder, initialDeposit);
        }
        else {
           banco =  new BankAccount(number, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        banco.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue= sc.nextDouble();
        banco.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(banco);

        sc.close();
    }
}
