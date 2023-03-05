package br.com.escuderodev.kfeitarriafit.crud_kafeitariafit.DAO;

import br.com.escuderodev.kfeitarriafit.crud_kafeitariafit.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ICliente extends CrudRepository<Cliente, Integer> {
}
