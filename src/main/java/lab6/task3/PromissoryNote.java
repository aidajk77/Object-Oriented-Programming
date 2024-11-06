package lab6.task3;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String,Double> loans;
    public PromissoryNote() {
        loans = new HashMap<>();
    }
    public void setLoan(String toWhom, double value){
        this.loans.put(toWhom,value);
    }
    public double howMuchIsTheDebt(String whose){
        if(loans.containsKey(whose)){
            return loans.get(whose);
        }
        return 0;
    }
}
