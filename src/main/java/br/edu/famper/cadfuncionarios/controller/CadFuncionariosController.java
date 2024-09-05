package br.edu.famper.cadfuncionarios.controller;

import br.edu.famper.cadfuncionarios.model.CadFuncionarios;
import br.edu.famper.cadfuncionarios.service.CadFuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/funcionarios")
public class CadFuncionariosController {
    @Autowired
    private CadFuncionariosService cadFuncionariosService;

    @GetMapping
    public ResponseEntity<List<CadFuncionarios>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(cadFuncionariosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CadFuncionarios>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(cadFuncionariosService.findById(id));
    }
    @PostMapping
    public ResponseEntity<CadFuncionarios> create(@RequestBody CadFuncionarios cadFuncionarios){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cadFuncionariosService.salvar(cadFuncionarios));
    }
    @PutMapping
    public ResponseEntity<CadFuncionarios> update(@RequestBody CadFuncionarios cadFuncionarios){
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(cadFuncionariosService.update(cadFuncionarios));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        cadFuncionariosService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
