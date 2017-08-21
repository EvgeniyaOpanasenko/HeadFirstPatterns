package decorator.demo.shopping.cart;

import decorator.demo.shopping.cart.model.Basket;
import decorator.demo.shopping.cart.model.PO;
import decorator.demo.shopping.cart.model.UserDto;
import decorator.demo.shopping.cart.repository.BasketRepository;
import decorator.demo.shopping.cart.repository.PORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private PORepository poRepository;

    private UserDto loggedInUser;

    @Override
    public void removePO(PO po) {

        poRepository.delete(po);
    }

    //each user can have more than one active baskets
    @Override
    public List<PO> getAllPObyUser() {
       return null;
    }

    //TODO get currently logged in user and find not saved basket
    // this basket is going to be changed

    @Override
    public List<Basket> getAllBaskets() {
        return basketRepository.findAll();
    }
}
