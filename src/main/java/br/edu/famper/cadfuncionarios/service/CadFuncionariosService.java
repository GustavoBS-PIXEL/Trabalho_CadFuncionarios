package br.edu.famper.cadfuncionarios.service;

import br.edu.famper.cadfuncionarios.model.CadFuncionarios;
import br.edu.famper.cadfuncionarios.repository.CadFuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadFuncionariosService {

    @Autowired
    private CadFuncionariosRepository cadFuncionariosRepository;

    public CadFuncionarios salvar(CadFuncionarios cadFuncionarios) {
        return cadFuncionariosRepository.save(cadFuncionarios);
    }

    public List<CadFuncionarios> findAll(){
        return cadFuncionariosRepository.findAll();
    }

    public Optional<CadFuncionarios> findById(Long id) {
        return cadFuncionariosRepository.findById(id);
    }


    public CadFuncionarios update(CadFuncionarios cadFuncionarios) {
        CadFuncionarios salvo = cadFuncionariosRepository.findById(cadFuncionarios.getFuncionario_id()).orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
        salvo.setNome(cadFuncionarios.getNome());
        salvo.setCpf(cadFuncionarios.getCpf());
        salvo.setEmail(cadFuncionarios.getEmail());
        salvo.setTelefone(cadFuncionarios.getTelefone());
        salvo.setEndereco(cadFuncionarios.getEndereco());
        salvo.setCargo(cadFuncionarios.getCargo());
        salvo.setDepartamento(cadFuncionarios.getDepartamento());
        salvo.setDatacontrat(cadFuncionarios.getDatacontrat());
        return cadFuncionariosRepository.save(salvo);
    }

    public void delete(Long id) {
        cadFuncionariosRepository.deleteById(id);
    }
}
