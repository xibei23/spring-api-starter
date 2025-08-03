package com.codewithmosh.store.payment;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class CheckOutRequest {
    @NotNull(message = "Card ID is required")
    private UUID cartId;
}
