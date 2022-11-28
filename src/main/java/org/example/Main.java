package org.example;
import java.util.Scanner;
import javax.management.monitor.GaugeMonitor;
public class Main {
    public static void main(String[] args)
    {
        Account1 a=new Account1("A123","Anilkumar",100);
                Account1 a1=new Account1("A234","Kumar");

                System.out.println("id:"+a.getId());
                System.out.println("name:"+a.getname());
                System.out.println("balance:"+a.getbalance());

                System.out.println("id2:"+a1.getId());
                System.out.println("name2:"+a1.getname());
                //credit
                a.credit(2000000);
                //debit
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter Dr Amt : ");
                int Dr_amt = scan.nextInt();
                a.debit(Dr_amt);
                //tranfer
                a.transferto();
                a1.toString();
                System.out.println(a);
                System.out.println(a1);

            }
        }
