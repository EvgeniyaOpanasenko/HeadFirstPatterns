package decorator.demo.shopping.cart.repository;

import decorator.demo.shopping.cart.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long>{
}
