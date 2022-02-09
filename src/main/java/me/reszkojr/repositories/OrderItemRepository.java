package me.reszkojr.repositories;

import me.reszkojr.entities.OrderItem;
import me.reszkojr.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
