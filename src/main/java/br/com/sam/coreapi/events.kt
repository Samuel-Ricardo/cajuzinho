package br.com.sam.coreapi

import org.axonframework.commandhandling.RoutingKey
import java.util.UUID

class FoodCartCreatedEvent(
        val foodCartId: UUID
)

data class ProductSelectedEvent (
        val foodCartId: UUID,
        val productId: UUID,
        val quantity: Int,
)