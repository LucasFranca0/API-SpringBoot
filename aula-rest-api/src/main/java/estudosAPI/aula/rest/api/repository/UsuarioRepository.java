package estudosAPI.aula.rest.api.repository;

import estudosAPI.aula.rest.api.controller.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
