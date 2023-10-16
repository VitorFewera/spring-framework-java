package dio.springboot.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
	@Value("${name:NoReply-DIO}")//pegando informações do application.properties
				//Essa informação :NoReply-DIO, se refere de uma informação default, para quando não
				// encontrar a variavel no application.properties

	private String nome;
	@Value("${email}")
	private String email;
	@Value("${telefones}")
	private List<Long> telefones =
			new ArrayList<>(Arrays.asList(new Long[]{17997590116l}));

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + nome
				+ "\nE-mail:" + email
				+ "\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}
}
