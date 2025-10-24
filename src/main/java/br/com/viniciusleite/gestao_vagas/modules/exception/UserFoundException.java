package br.com.viniciusleite.gestao_vagas.modules.exception;

public class UserFoundException extends RuntimeException {
    public UserFoundException(){
        super("Usuario já Existente");
    }
}
