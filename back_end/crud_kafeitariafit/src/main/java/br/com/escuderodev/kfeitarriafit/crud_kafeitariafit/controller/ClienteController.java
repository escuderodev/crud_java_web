package br.com.escuderodev.kfeitarriafit.crud_kafeitariafit.controller;

import br.com.escuderodev.kfeitarriafit.crud_kafeitariafit.DAO.ICliente;
import br.com.escuderodev.kfeitarriafit.crud_kafeitariafit.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
//    utilizando Autowired para injeção de dependência a fim de não precisar impementar os metodos da interface ICliente
    @Autowired
    private ICliente dao;
    @GetMapping
    public List<Cliente> clientes() {
        return (List<Cliente>) dao.findAll();
    }

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        Cliente clienteNovo = dao.save(cliente);
        return clienteNovo;
    }

    @PutMapping
    public Cliente atualizarCliente(@RequestBody Cliente cliente) {
        Cliente clienteAtualizado = dao.save(cliente);
        return clienteAtualizado;
    }

    @DeleteMapping("/{idcliente}")
    public Optional<Cliente> excluirCliente(@PathVariable Integer idcliente) {
        Optional<Cliente> cliente = dao.findById(idcliente);
        dao.deleteById(idcliente);
        return cliente;
    }
}
