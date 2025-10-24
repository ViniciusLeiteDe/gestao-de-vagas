package br.com.viniciusleite.gestao_vagas.modules.candidatesEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import java.time.LocalDateTime;
import java.util.UUID;
@Data // ao colocar @Data emuma classe o lombok gera automaticamente geters e seters ToString etc..
@Entity // fala para o spring criar tabela de banco ade dados apartir dessa classe
public class Candidato {

    @Id // indica para o bano de dados que o campo abaixo será uma chave primaria
    @GeneratedValue(strategy = GenerationType.UUID) // fala para o database gerar esse id automaticamente
    private UUID id;
    private String name;
    @Pattern(regexp = "\\S+", message = "O campo[username] não deve conter espacos") // validação
    private  String username;

    @Email(message = "O campo [e_mail] deve conter um email valido") // validação email
    private String email;

    @Length(min = 6,max = 10 , message = "Sua senha deve conter entre 6 e 10 caractere")
    private String password;
    private String description;
    private String curriculum;

    @CreationTimestamp // cria no banco de dados um atributo que marca a data em que a tabela foi atualizada
    LocalDateTime createdAt;
}
