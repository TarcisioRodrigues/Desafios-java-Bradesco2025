package Design.parterns.designpartenrs.service;
import org.springframework.cloud.openfeign.FeignClient;
import Design.parterns.designpartenrs.model.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ViaCepService {
    @FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
    public interface ViaCepService {

        @GetMapping("/{cep}/json/")
        Endereco consultarCep(@PathVariable("cep") String cep);
    }
}
