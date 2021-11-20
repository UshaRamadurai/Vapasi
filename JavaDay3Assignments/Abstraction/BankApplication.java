package JavaDay3Assignments.Abstraction;

import java.util.ArrayList;

public class BankApplication{

    public void printDenominations(ArrayList<Integer> list){

        if(list.size()>0) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
            else
            System.out.println("The list is empty");
    }

    public static void main(String[] args) {

        BankApplication app = new BankApplication();
        SBI sbi = new SBI();
        sbi.bankList("SBI");
        sbi.denominations();
        app.printDenominations(sbi.list);

        ICICIBank icici = new ICICIBank();
        icici.bankList("ICICI BANK");
        icici.denominations();
        app.printDenominations(icici.list);

        HDFCBank hdfc = new HDFCBank();
        hdfc.bankList("HDFC BANK");
        hdfc.denominations();
        app.printDenominations(hdfc.list);

    }

}
