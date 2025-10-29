package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFunc(Funcionario f){
        funcionarios.add(f);
    }

    public void exibeTodos(){
        for (Funcionario f : funcionarios){
            System.out.println("Funcionário: " + f + "\n");
        }
    }

    public void exibeTotalSalario(){
        Double total = 0.0;
        for (Funcionario f : funcionarios){
            total += f.calcSalario();
        }
        System.out.println("Total dos salários: " + total);
    }

    public void exibeHoristas(){
        for (Funcionario f : funcionarios){
            if (f instanceof Horista){
                System.out.println("Horista: " + f);
            }
        }
    }
}
