package JavaDay3Assignments.Abstraction;

import java.util.ArrayList;

public class SBI extends ReserveBank{
    @Override
    public ArrayList<Integer> denominations() {
        list.add(5000);
        list.add(6000);
        list.add(7000);
        list.add(8000);
        list.add(10000);
        return list;
    }

}
