import java.util.List;

/**
 * Created by Mitziu on 11/3/16.
 */
public class UpcomingOrder {
    private Integer timeToOrder;
    private List<Integer> IDs;

    public UpcomingOrder(Integer timeToOrder, List<Integer> IDs) {
        if (IDs.isEmpty()) {
            throw new IllegalStateException("Order has to include at least 1 item");
        }

        if (timeToOrder < 0) {
            throw new IllegalStateException("Time to Order has to be greater than or equal to zero");
        }

        this.timeToOrder = timeToOrder;
        this.IDs = IDs;
    }

    /**
     * Returns the time when that order will be activated
     * @return Time of activation
     */
    public Integer getTimeToOrder() {
        return timeToOrder;
    }

    /**
     * Returns the list of items in the order
     * @return List of times to order
     */
    public List<Integer> getItemLists() {
        return IDs;
    }
}
