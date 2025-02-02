package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

@AllArgsConstructor
public class CartRequest {
    @JsonProperty("product_id")
    int productId;

    @JsonProperty("quantity")
    int quantity;
}
