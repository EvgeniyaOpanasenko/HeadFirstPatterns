package decorator.demo.shopping.cart.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    @OneToMany(mappedBy = "user")
    List<Basket> basketList;

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Basket> getBasketList() {
        return basketList;
    }

    public void setBasketList(List<Basket> basketList) {
        this.basketList = basketList;
    }
}
