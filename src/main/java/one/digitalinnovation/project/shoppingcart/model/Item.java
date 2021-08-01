package one.digitalinnovation.project.shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@Getter
@Setter
public class Item {
    @Id
    private Long productId;
    private Integer amount;
}
