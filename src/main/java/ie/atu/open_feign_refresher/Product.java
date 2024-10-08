package ie.atu.open_feign_refresher;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Positive(message = "id must be positive")
    private long id;
    @NotBlank(message = "name cannot be blank")
    private String name;
    @Positive(message = "price must be positive")
    private double price;
}
