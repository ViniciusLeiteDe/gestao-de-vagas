package br.com.viniciusleite.gestao_Vagas.modules.candidatesEntity.userCase;

import br.com.viniciusleite.gestao_Vagas.modules.candidatesEntity.Candidato;
import br.com.viniciusleite.gestao_Vagas.modules.candidatesEntity.CandidatoRepository;
import br.com.viniciusleite.gestao_Vagas.modules.exception.UserFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUserCase {
    @Autowired
    private CandidatoRepository candidatoRepository;

    public Candidato execute(Candidato candidate){
        this.candidatoRepository
                .findByUsernameOrEmail(candidate.getUsername(),candidate.getEmail())
                .ifPresent((user )->{
                    throw new UserFoundException();
                });
        return this.candidatoRepository.save(candidate);
    }
}
