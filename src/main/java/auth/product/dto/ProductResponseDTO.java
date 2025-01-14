package auth.product.dto;

import auth.product.model.Product;

public record ProductResponseDTO(Integer id, String name, double price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }
}
