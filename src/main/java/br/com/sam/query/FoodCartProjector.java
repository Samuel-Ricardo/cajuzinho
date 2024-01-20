package br.com.sam.query;

import br.com.sam.coreapi.FoodCartCreatedEvent;
import br.com.sam.coreapi.ProductSelectedEvent;
import br.com.sam.repository.FoodCartViewRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class FoodCartProjector {

    private final FoodCartViewRepository repository;

    public FoodCartProjector(FoodCartViewRepository repository) {
        this.repository = repository;
    }

    @EventHandler
    public void on(FoodCartCreatedEvent event) {
        var view = new FoodCartView(event.getFoodCartId(), Collections.emptyMap());
        repository.save(view);
    }
}
