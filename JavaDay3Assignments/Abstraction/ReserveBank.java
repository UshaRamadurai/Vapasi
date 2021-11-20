//Goal : Code to achieve abstraction by using abstract class and abstract methods
//ReserveBank -Abstract class and methods
//SBI, ICICIBank, HDFCBank classes extends ReserveBank and implements abstract methods
package JavaDay3Assignments.Abstraction;

import java.util.ArrayList;

public abstract class ReserveBank {
    public ArrayList<Integer> list = new ArrayList<>();
   public abstract ArrayList<Integer> denominations();

    public  void bankList(String bankName){

        System.out.println(bankName + " denominations");
    }
}
