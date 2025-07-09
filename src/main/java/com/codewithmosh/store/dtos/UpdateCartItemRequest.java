package com.codewithmosh.store.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateCartItemRequest {
    @NotNull(message = "quantity must be provided")
    @Min(value = 1, message = "must > 0")
    @Max(value = 99, message = "must < 100")
    private Integer quantity;
}
