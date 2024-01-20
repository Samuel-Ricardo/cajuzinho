package br.com.sam.coreapi

import org.axonframework.commandhandling.RoutingKey
import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.util.UUID


data class CreateFoodCartCommand (
    @RoutingKey val foodCartId: UUID
)

data class SelectProductCommand (
    @TargetAggregateIdentifier
    val foodCartId: UUID,
    val productId: UUID,
    val quantity: Int,
)