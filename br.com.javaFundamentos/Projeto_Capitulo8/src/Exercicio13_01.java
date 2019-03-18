import models.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Luciano Teixeira on 06/03/2019.
 * Agrupamentos por Funcionários x Departamento
 */

public class Exercicio13_01 {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("José",1000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Roberto",2000d, "Marketing"));
        funcionarios.add(new Funcionario("Márcia",3000d, "Contabilidade"));
        funcionarios.add(new Funcionario("Vera",4000d, "Marketing"));
        funcionarios.add(new Funcionario("João",5000d,"Recursos Humanos"));

        // Obtendo o total de salários por setor
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
    }
}


