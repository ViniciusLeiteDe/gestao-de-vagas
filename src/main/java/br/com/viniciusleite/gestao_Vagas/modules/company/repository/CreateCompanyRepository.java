package br.com.viniciusleite.gestao_Vagas.modules.company.repository;

import br.com.viniciusleite.gestao_Vagas.modules.company.entites.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CreateCompanyRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional <CompanyEntity> findBayUsernameOrEmail(String username,String email);
}
