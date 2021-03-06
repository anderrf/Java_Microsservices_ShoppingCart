package one.digitalinnovation.project.shoppingcart.repository;

import one.digitalinnovation.project.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
