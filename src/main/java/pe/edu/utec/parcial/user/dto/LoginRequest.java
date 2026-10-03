package pe.edu.utec.parcial.user.dto;

public record LoginRequest (@NotBlank @Email String Email,
                            @NotBlanck String password){
}
