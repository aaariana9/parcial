package pe.edu.utec.parcial.user.dto;

import org.hibernate.annotations.processing.Pattern;

public record RegisterRequest (
        @NotBlank @Email String Email,
        @NotBlank @Pattern(regexp = ".*[A-Z].*", message = "Debe tener una mayuscula")) {
}
