package me.reszkojr.services;

import me.reszkojr.entities.Order;
import me.reszkojr.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(long id) {
        return repository.findById(id).get();
    }
}
