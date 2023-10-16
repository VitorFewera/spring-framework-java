package dio.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

//Com essa anotação configuro a classe para ser uma configuration
@Configuration
//Aqui eu faço que essa classe herde caracteristicas de rementente, que esta em application.properties
@ConfigurationProperties(prefix = "remetente")
public class Rementente {
    //Aqui eu passo a classe remetente

    private String nome;
    private String email;
    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
