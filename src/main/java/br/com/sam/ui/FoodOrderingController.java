package br.com.sam.ui;

import br.com.sam.coreapi.CreateFoodCartCommand;
import br.com.sam.coreapi.DeselectProductCommand;
import br.com.sam.coreapi.SelectProductCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RequestMapping("/foodCart")
@RestController
public class FoodOrderingController {

    private final CommandGateway commandGateway;
    private final QueryGateway queryGateway;

    public FoodOrderingController(CommandGateway commandGateway, QueryGateway queryGateway) {
        this.commandGateway = commandGateway;
        this.queryGateway = queryGateway;
    }


    @PostMapping("/create")
    public CompletableFuture<UUID> createFoodCart(){
        return commandGateway.send(new CreateFoodCartCommand(UUID.randomUUID()));
    }

    @PostMapping("/{foodCartId}/select/{productId}/quantity/{quantity}")
    public void selectProduct(
            @PathVariable("foodCartId") String foodCartId,
            @PathVariable("productId") String productId,
            @PathVariable("quantity") Integer quantity
    ) {
        commandGateway.send(new SelectProductCommand(
                UUID.fromString(foodCartId),
                UUID.fromString(productId),
                quantity
        ));
    }

    @PostMapping("/{foodCartId}/deselect/{productId}/quantity/{quantity}")
    public void deselectProduct(
            @PathVariable("foodCartId") String foodCartId,
            @PathVariable("productId") String productId,
            @PathVariable("quantity") Integer quantity
    ) {
        commandGateway.send(new DeselectProductCommand(
                UUID.fromString(foodCartId),
                UUID.fromString(productId),
                quantity
        ));
    }
}
