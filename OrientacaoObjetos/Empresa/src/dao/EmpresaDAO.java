package dao;

import dto.EmpresaDTO;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDAO {

    List<EmpresaDTO> empresaDTOList = new ArrayList<>();

    public void salvar(EmpresaDTO _empresa) {
        empresaDTOList.add(_empresa);
    }

    public void mostrarEmpresas() {
        if (empresaDTOList.isEmpty()) {
            System.out.println("\n[Lista de empresas está vazia no momento]\n");
        }
        else {
            System.out.println("\n[Empresas cadastradas]");
            for (EmpresaDTO e : empresaDTOList) {
                System.out.println("\tNome: "+ e.getNome()+ " | CNPJ: "+ e.getCnpj());
            }
        }
    }
}
