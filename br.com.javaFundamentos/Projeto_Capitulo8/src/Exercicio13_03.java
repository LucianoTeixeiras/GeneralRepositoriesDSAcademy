import models.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Luciano Teixeira on 06/03/2019.
 * Agrupamentos por Funcionários x Departamento
 */

public class Exercicio13_03 {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("José",1000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Roberto",2000d, "Marketing"));
        funcionarios.add(new Funcionario("Márcia",3000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Vera",4000d, "Marketing"));
        funcionarios.add(new Funcionario("João",5000d,"Recursos Humanos"));

        // Obtendo o total de salários por setor

        System.out.println("-----");
        System.out.println("--- Total de Funcionários Por Departamento");
        System.out.println("-----");

        Map<String, Long> mapFuncionariosPorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                                Collectors.counting()));

        for(String departamento : mapFuncionariosPorDepartamento.keySet()) {
            System.out.println(
                    String.format("Total de Funcionários em %s: %d",
                            departamento,
                            mapFuncionariosPorDepartamento.get(departamento)
                    ));
        }

        System.out.println("-----");
        System.out.println("--- Total de Salário Por Departamento");
        System.out.println("-----");

        // Obtendo o total de salários por setor
        Map<String, Double> mapSalariosPorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                                Collectors.summingDouble(f -> f.getSalario())));

        for(String departamento : mapSalariosPorDepartamento.keySet()) {
            System.out.println(
                    String.format("Total de salário em %s: %.2f",
                            departamento,
                            mapSalariosPorDepartamento.get(departamento)
                    ));
        }

        System.out.println("-----");
        System.out.println("--- Média Salarial");
        System.out.println("-----");

        // Obtendo a média de salários por setor
        Map<String, Double> mapMediaSalarialPorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                                Collectors.averagingDouble(f -> f.getSalario())));

        for(String departamento : mapMediaSalarialPorDepartamento.keySet()) {
            System.out.println(
                    String.format("Média salarial de %s: %.2f",
                            departamento,
                            mapMediaSalarialPorDepartamento.get(departamento)
                    ));
        }

    }
}


