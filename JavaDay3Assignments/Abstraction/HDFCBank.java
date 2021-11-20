package JavaDay3Assignments.Abstraction;

import java.util.ArrayList;

public class HDFCBank extends ReserveBank{
    @Override
  public  ArrayList<Integer> denominations() {
        list.add(10);
        list.add(20);
        list.add(50);
        return list;
    }
}
