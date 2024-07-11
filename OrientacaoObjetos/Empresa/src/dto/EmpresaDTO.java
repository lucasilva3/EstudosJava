package dto;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDTO {

    protected String nome;
    protected String cnpj;

    protected List<FuncionarioDTO> funcionarioDTOList;

    public EmpresaDTO() {
        this.funcionarioDTOList = new ArrayList<>();
    }

    public EmpresaDTO(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarioDTOList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<FuncionarioDTO> getFuncionariosDtoList() {
        return funcionarioDTOList;
    }

    public void novoFuncionario(FuncionarioDTO _funcionarioDTO) {
        funcionarioDTOList.add(_funcionarioDTO);
    }

}
