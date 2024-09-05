package br.edu.famper.cadfuncionarios.repository;

import br.edu.famper.cadfuncionarios.model.CadFuncionarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadFuncionariosRepository extends JpaRepository<CadFuncionarios, Long> {
}
