package br.com.sam.command;

import br.com.sam.coreapi.*;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.UUID;

@Aggregate
public class FoodCart {

    FoodCart(){}

    private static final Logger logger = LoggerFactory.getLogger(FoodCart.class);

    @AggregateIdentifier
    private UUID foodCartId;
    private Map<UUID, Integer> selectedProducts;
    private boolean confirmed;


    @CommandHandler
    public FoodCart(CreateFoodCartCommand  command) {
        AggregateLifecycle.apply(new FoodCartCreatedEvent(command.getFoodCartId()));
    }

    @CommandHandler
    public void handle(SelectProductCommand command) {
        AggregateLifecycle.apply(new ProductSelectedEvent(foodCartId, command.getProductId(), command.getQuantity()));
    }

    @CommandHandler
    public void handle(DeselectProductCommand command) {
        AggregateLifecycle
                .apply(
                  new ProductDeselectedEvent(
                    foodCartId,
                    command.getProductId(),
                    command.getQuantity()
                  )
                );
    }

}
