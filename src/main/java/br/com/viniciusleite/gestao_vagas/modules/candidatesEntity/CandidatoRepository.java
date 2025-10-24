package br.com.viniciusleite.gestao_vagas.modules.candidatesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidatoRepository extends JpaRepository<Candidato, UUID>{

    Optional<Candidato> findByUsernameOrEmail(String username,String Email);
}
