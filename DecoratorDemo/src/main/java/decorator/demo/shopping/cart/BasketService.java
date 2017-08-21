package decorator.demo.shopping.cart;

import decorator.demo.shopping.cart.model.Basket;
import decorator.demo.shopping.cart.model.PO;

import java.util.List;

public interface BasketService {
    void removePO(PO po);
    List<PO> getAllPObyUser();
    List<Basket> getAllBaskets();

}
