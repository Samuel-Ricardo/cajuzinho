package br.com.sam.query

import java.util.UUID
import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id

@Entity
class FoodCartView (
    @Id val foodCartId: UUID,
    @ElementCollection(fetch = FetchType.EAGER)
    val products: MutableMap<UUID, Int>
){
    constructor(): this(UUID.randomUUID(), HashMap<UUID, Int>()){}

    fun addProducts(productId: UUID, amount: Int) =
        products.compute(productId) {_, quantity -> (quantity ?: 0) + amount}

}