package estudosAPI.aula.rest.api.controller.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@Entity(name = "usuario")
public class UsuarioModel {

    @Id
    public Integer codigo;

    @Column(nullable = false, length = 50)
    public String name;

    @Column(nullable = false, length = 50)
    public String login;

    @Column(nullable = false, length = 10)
    public String senha;

}
