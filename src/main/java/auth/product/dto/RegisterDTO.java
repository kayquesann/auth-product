package auth.product.dto;

import auth.product.model.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
