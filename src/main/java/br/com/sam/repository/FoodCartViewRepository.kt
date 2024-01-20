package br.com.sam.repository

import br.com.sam.query.FoodCartView
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface FoodCartViewRepository: JpaRepository<FoodCartView, UUID>