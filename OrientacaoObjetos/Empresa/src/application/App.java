package application;

import dao.EmpresaDAO;
import dto.EmpresaDTO;
import dto.FuncionarioDTO;

import java.util.List;

public class App {
    public static void main(String[] args) {

        // Instanciando Novas Empresas
        EmpresaDTO empresa1 = new EmpresaDTO("Empresa 1", "33.322.646/0001-44");
        EmpresaDTO empresa2 = new EmpresaDTO("Empresa 2", "88.953.337/0001-64");
        EmpresaDTO empresa3 = new EmpresaDTO("Empresa 3", "70.284.731/0001-91");

        // Salvando os Dados das Novas Empresas
        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.salvar(empresa1);
        empresaDAO.salvar(empresa2);
        empresaDAO.salvar(empresa3);

        // Mostrando Todas as Empresas Salvas
        empresaDAO.mostrarEmpresas();

        // Instanciando Novos Funcionários
        FuncionarioDTO funcionario1 = new FuncionarioDTO("Funcionário 1", "203.756.700-68");
        FuncionarioDTO funcionario2 = new FuncionarioDTO("Funcionário 2", "717.055.630-82");
        FuncionarioDTO funcionario3 = new FuncionarioDTO("Funcionário 3", "761.357.130-00");
        FuncionarioDTO funcionario4 = new FuncionarioDTO("Funcionário 4", "900.682.550-63");
        FuncionarioDTO funcionario5 = new FuncionarioDTO("Funcionário 5", "559.383.720-11");
        FuncionarioDTO funcionario6 = new FuncionarioDTO("Funcionário 6", "792.886.120-84");
        FuncionarioDTO funcionario7 = new FuncionarioDTO("Funcionário 7", "876.140.910-35");
        FuncionarioDTO funcionario8 = new FuncionarioDTO("Funcionário 8", "960.357.430-99");
        FuncionarioDTO funcionario9 = new FuncionarioDTO("Funcionário 9", "968.161.460-77");
        FuncionarioDTO funcionario10 = new FuncionarioDTO("Funcionário 10", "430.307.050-56");
        FuncionarioDTO funcionario11 = new FuncionarioDTO("Funcionário 11", "374.543.590-78");
        FuncionarioDTO funcionario12 = new FuncionarioDTO("Funcionário 12", "093.973.600-43");
        FuncionarioDTO funcionario13 = new FuncionarioDTO("Funcionário 13", "885.823.790-05");
        FuncionarioDTO funcionario14 = new FuncionarioDTO("Funcionário 14", "665.955.790-30");
        FuncionarioDTO funcionario15 = new FuncionarioDTO("Funcionário 15", "148.540.440-12");

        // Adicionando Funcionários às Respectivas Empresas
        empresa1.novoFuncionario(funcionario1);
        empresa1.novoFuncionario(funcionario2);
        empresa1.novoFuncionario(funcionario3);
        empresa2.novoFuncionario(funcionario4);
        empresa2.novoFuncionario(funcionario5);
        empresa2.novoFuncionario(funcionario6);
        empresa2.novoFuncionario(funcionario7);
        empresa2.novoFuncionario(funcionario8);
        empresa2.novoFuncionario(funcionario9);
        empresa2.novoFuncionario(funcionario10);
        empresa3.novoFuncionario(funcionario11);
        empresa3.novoFuncionario(funcionario12);
        empresa3.novoFuncionario(funcionario13);
        empresa3.novoFuncionario(funcionario14);
        empresa3.novoFuncionario(funcionario15);

        // Mostrando Funcionários Primeira Empresa
        List<FuncionarioDTO> funcionarios1 = empresa1.getFuncionariosDtoList();
        System.out.println("\n[Funcionários da "+ empresa1.getNome()+ "]");
        for (FuncionarioDTO fl : funcionarios1) {
            System.out.println("\tNome: "+ fl.getNome()+ " | CPF: "+ fl.getCpf());
        }

        // Mostrando Funcionários Segunda Empresa
        List<FuncionarioDTO> funcionarios2 = empresa2.getFuncionariosDtoList();
        System.out.println("\n[Funcionários da "+ empresa2.getNome()+ "]");
        for (FuncionarioDTO fl : funcionarios2) {
            System.out.println("\tNome: "+ fl.getNome()+ " | CPF: "+ fl.getCpf());
        }

        // Mostrando Funcionários Terceira Empresa
        List<FuncionarioDTO> funcionarios3 = empresa3.getFuncionariosDtoList();
        System.out.println("\n[Funcionários da "+ empresa3.getNome()+ "]");
        for (FuncionarioDTO fl : funcionarios3) {
            System.out.println("\tNome: "+ fl.getNome()+ " | CPF: "+ fl.getCpf());
        }

    }
}
