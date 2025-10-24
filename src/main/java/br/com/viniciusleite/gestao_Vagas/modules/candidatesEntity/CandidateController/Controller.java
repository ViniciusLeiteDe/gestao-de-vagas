package br.com.viniciusleite.gestao_Vagas.modules.candidatesEntity.CandidateController;

import br.com.viniciusleite.gestao_Vagas.modules.candidatesEntity.userCase.CreateCandidateUserCase;
import br.com.viniciusleite.gestao_Vagas.modules.candidatesEntity.Candidato;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidatos") // é usado para maperar requisições http na classes ou methodos
public class Controller {

    @Autowired
    private CreateCandidateUserCase candidateUserCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody Candidato candidate){
        try {
           var result =  this.candidateUserCase.execute(candidate);
           return ResponseEntity.ok().body(result);
        }catch (Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    // @valid = valida o dado enviado pelo cliente "interface user" de acordo com parametros estabelecidos
    // na entidade.
    //  @PostMapping = indica que o metodo abaixo espera um requisição
    // RestController = indica para o spring que esta classe e uma controll
    // RequestMapping = é usado para maperar requisições http na classes ou methodos
    // @RequestBody = faz a captura do dado no corpo da requisiçao
}
