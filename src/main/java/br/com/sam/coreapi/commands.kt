package br.com.sam.coreapi

import org.axonframework.commandhandling.RoutingKey
import java.util.UUID


data class CreateFoodCartCommand (
    @RoutingKey val foodCartId: UUID
)