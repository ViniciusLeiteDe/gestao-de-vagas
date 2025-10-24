package br.com.viniciusleite.gestao_vagas.modules.company.entites;

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

@Entity(name = "company")
@Data
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Pattern(regexp = "\\S+", message = "O campo[username] não deve conter espacos") // validação
    private  String username;

    @Email(message = "O campo [e_mail] deve conter um email valido") // validação email
    private String email;

    @Length(min = 6,max = 10 , message = "Sua senha deve conter entre 6 e 10 caractere")
    private String password;
    private String website;
    private String name;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
