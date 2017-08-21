package decorator.demo.shopping.cart.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "baskets")
public class Basket extends Item {

    // if some discount is present than we add it here and calculate total
    double discount;

    public Basket(double discount) {
        this.discount = cost();
        //total = discount;
        description = "Basket consist of :  ";
    }

    @OneToMany(mappedBy = "basket")
    private List<PO> poList;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserDto user;

    private int status = 1;

    @Override
    public double cost() {
        return discount;
    }

    public Basket() {
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<PO> getPoList() {
        return poList;
    }

    public void setPoList(List<PO> poList) {
        this.poList = poList;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
