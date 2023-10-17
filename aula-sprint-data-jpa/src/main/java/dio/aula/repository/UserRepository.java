package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    //Usado para pegar alguns metodos que ja estão feito pelo framework e usa-los na minha app
}
