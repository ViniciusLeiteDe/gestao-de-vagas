package br.com.viniciusleite.gestao_vagas.modules.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // cria automaticaento um construtor com todos os atributos como parametros
public class ErrorMessageDTO {
    private String message;
    private String field;
}
