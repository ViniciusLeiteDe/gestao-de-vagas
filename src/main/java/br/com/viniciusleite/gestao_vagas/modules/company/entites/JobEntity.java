package br.com.viniciusleite.gestao_vagas.modules.company.entites;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    private String benefits;
    private  String nivel;

    @ManyToOne  // informa o tipo de relacionameno entre as entidades no banco de dados
    @JoinColumn(name = "company_id") // garante que o nome dacoluna na tabela sera este passado por parametro
    private CompanyEntity companyEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
