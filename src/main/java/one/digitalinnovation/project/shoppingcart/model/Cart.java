package one.digitalinnovation.project.shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("cart")
@Getter
@Setter
public class Cart {
    @Id
    private Long id;
    private List<Item> items;
}
