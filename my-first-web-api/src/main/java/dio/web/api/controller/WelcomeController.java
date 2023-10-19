package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Esse transforma a class em um restController, usada para fazer os components web
@RestController
public class WelcomeController {
    @GetMapping //Aqui e mapei o metodo welcome(), para que ele aparece-se na web
    public String welcome(){
        return "Welcome to My Spring Boot WebAPI";
    }
}
