package br.appLogin.appLogin.repository;

import br.appLogin.appLogin.model.usuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface usuarioRepository extends CrudRepository<usuarioModel, String> {

    usuarioModel findById(long id);
}
