package dio.aula.model;


import jakarta.persistence.*;

@Entity //importo a classe com entidade
@Table(name = "tab_user")
public class User {
    @Id //decorator para mostrar qual sera a vartiavel id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//variavel para mostrar que essa informação sera automatica pelo banco
     @Column(name = "user_id")//mostra que o name, vai ser chamado como a informação que eu passo
    private Integer id;
    @Column(length = 50, nullable = false)//indica o tamanho do campo, e que o mesmo não pode ser nullo
    private String name;
    @Column(length = 20, nullable = false)
    private String userName;
    @Column(length = 100, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
