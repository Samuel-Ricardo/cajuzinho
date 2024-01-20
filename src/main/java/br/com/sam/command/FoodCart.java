package br.com.sam.command;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.UUID;

@Aggregate
public class FoodCart {

    private static final Logger logger = LoggerFactory.getLogger(FoodCart.class);

    @AggregateIdentifier
    private UUID foodCartId;
    private Map<UUID, Integer> selectedProducts;
    private boolean confirmed;

    

}
