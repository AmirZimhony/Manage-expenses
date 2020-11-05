import java.util.*;
public class Main {
    public static void main(String args[]) {
        Expense[] ThreeMostExpensive=new Expense[3];
        ArrayList<Expense> September=new ArrayList<Expense>();
        System.out.println(moneySpentInMonth(September, "September",ThreeMostExpensive)) ;


    }
//Function for printing how much money I spent in a given month
    public static String moneySpentInMonth(ArrayList<Expense> Month, String nameOfMonth, Expense[] expenses){
        String ans="";
        int counter=0;
        for (Expense exp: Month)
            counter=counter+exp.getAmount();
        ans+= "In the  month of "+nameOfMonth+" "+counter+" shekels were spent.";
        for (int i=0;i<3;i++)
            ans+="\n"+ " "+expenses[i].toString();
        return ans;

    }
//Function for adding an expense to an expense array of a certain month. Maintains the 3 most expensive list
    public static void addExpense(Expense e, ArrayList<Expense> Exp, Expense[] expenses){
        Heapify(expenses);
        Exp.add(e);
        if (expenses[0]==null) {
            expenses[0] = e;
        }
        else if (expenses[1]==null) {
            expenses[1] = e;
        }
        else if (expenses[2]==null) {
            expenses[2] = e;
        }
        else if (e.compareTo(expenses[0])>0){
            expenses[0]=e;
        }



    }
//helper function for keeping track of the 3 most expensive charges of a month. Makes use of a Min-max heap
    private static void Heapify(Expense[] expenses) {
        if((expenses[0]!=null)&&(expenses[1]!=null)&&(expenses[2]!=null))
        if (expenses[0].compareTo(expenses[1]) > 0) {
            Expense e = expenses[0];
            expenses[0] = expenses[1];
            expenses[1] = e;
        } else if (expenses[0].compareTo(expenses[2]) > 0) {
            Expense e = expenses[0];
            expenses[0] = expenses[2];
            expenses[2] = e;
        }
    }
}
