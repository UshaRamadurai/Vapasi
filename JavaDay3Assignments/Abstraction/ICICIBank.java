package JavaDay3Assignments.Abstraction;

import java.util.ArrayList;

public class ICICIBank extends ReserveBank{
    @Override
    public ArrayList<Integer> denominations() {
        list.add(100);
        list.add(200);
        list.add(500);
        list.add(2000);
        return list;
    }

}
