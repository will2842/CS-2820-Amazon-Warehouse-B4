import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mitziu on 11/3/16.
 * B4
 */
public class UpcomingOrderTest {

    UpcomingOrder upcomingOrder;
    List<Integer> IDs;

    @Before
    public void setup() {
        IDs = new ArrayList<>();
    }

    @Test
    public void correctParameters() {
        IDs.add(10);
        upcomingOrder = new UpcomingOrder(0, IDs);

        Assert.assertTrue(upcomingOrder.getTimeToOrder() == 0);

        Assert.assertTrue(upcomingOrder.getItemLists().size() == 1);
        Assert.assertTrue(upcomingOrder.getItemLists().get(0) == 10);
    }

    @Test (expected = IllegalStateException.class)
    public void emptyListException() {
        upcomingOrder = new UpcomingOrder(0, IDs);

    }

    @Test (expected = IllegalStateException.class)
    public void negativeTimeException() {
        IDs.add(10);

        upcomingOrder = new UpcomingOrder(-1, IDs);
    }


}
