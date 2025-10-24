package br.com.viniciusleite.gestao_Vagas.modules.candidatesEntity.CandidateController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // É usasado para indentificar a classe como controller, e informar que estamos criando uma API REST
@RequestMapping("/primeiraController") // Definindo o recurso da rota.
public class PrimeiraController {
    @GetMapping("/primeiroMetodo") // Informa o tipo de operação que queremos fazer e que essa operação recebe Parametros.
    public String primriroMetodo(){ // metodo que ira executar a operação.

        return "O parametro é jvjv viniciusvjvjc: ";
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
        return "O parametro con metodoQueryParams é "+id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams){
        return "O parametro con metodoQueryParams2 é "+ allParams.entrySet();
    }


    @PostMapping("/metodoComBudyParams")
    public String metodoComBudyParams(@RequestBody usuarios indetificacao){
        return "metodoComBudyParams "+ indetificacao.id();
    }
    record usuarios(Integer id){}

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name ){
        return "metoddoComHeaders "+ name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map <String, String> headers ){
        return "metoddoComHeaders "+ headers.entrySet();
    }


    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity(){
        return ResponseEntity.status(400).body("Mensagem de erro");
    }


}
