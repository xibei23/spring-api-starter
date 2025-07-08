package com.codewithmosh.store.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddItemToCartRequest {
    @NotBlank
    private Long productId;
}
