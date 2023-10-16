package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
	//usado quando o atributo estiver associado a um contexto
	@Autowired // -- Para nao dar o new, com essa anotação a informações vem do application.properties
	private Rementente rementente;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + rementente.getNome()
				+ "\nE-mail:" + rementente.getEmail() + "\nCom telefones para contato: "
				+ rementente.getTelefones());
		System.out.println("Seu cadastro foi aprovado");
	}
}
