import java.util.ArrayList;
import java.util.List;

class User{
    private int userId;
    private String name;
    private List<Order> orders;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    

}