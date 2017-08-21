package decorator.demo.shopping.cart.repository;

import decorator.demo.shopping.cart.model.PO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PORepository extends JpaRepository<PO, Long> {
}
