package br.com.viniciusleite.gestao_Vagas.modules.exception;

public class UserFoundException extends RuntimeException {
    public UserFoundException(){
        super("Usuario já Existente");
    }
}
