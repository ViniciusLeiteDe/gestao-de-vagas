package br.com.viniciusleite.gestao_Vagas.modules.company.userCase;

import br.com.viniciusleite.gestao_Vagas.modules.company.entites.CompanyEntity;
import br.com.viniciusleite.gestao_Vagas.modules.company.repository.CreateCompanyRepository;
import br.com.viniciusleite.gestao_Vagas.modules.exception.UserFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CreateCopanyUserCase {
    @Autowired
    private CreateCompanyRepository companyRepository;


    public CompanyEntity  execute(CompanyEntity companyEntity){
        this.companyRepository.findBayUsernameOrEmail(companyEntity.getUsername(),companyEntity.getEmail())
                .ifPresent((user)-> {
                    throw new UserFoundException();
                } );
        return this.companyRepository.save(companyEntity);
    }
}
