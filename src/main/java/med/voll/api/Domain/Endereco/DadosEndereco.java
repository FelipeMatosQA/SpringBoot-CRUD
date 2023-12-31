package med.voll.api.Domain.Endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(

        @NotBlank
        String logradouro,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,

        @NotBlank
        String bairro,

        @NotBlank
        String uf,

        @NotBlank
        String cidade,

        String complemento,

        String numero) {
}
