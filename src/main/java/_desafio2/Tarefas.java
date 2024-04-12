package _desafio2;

public class Tarefas {

    public int anexar;
    public int editar;
    public int remover;

    public Tarefas(int anexar, int editar, int remover) {
        this.anexar = anexar;
        this.editar = editar;
        this.remover = remover;
    }

    public int getAnexar() {
        return anexar;
    }

    public void setAnexar(int anexar) {
        this.anexar = anexar;
    }

    public int getEditar() {
        return editar;
    }

    public void setEditar(int editar) {
        this.editar = editar;
    }

    public int getRemover() {
        return remover;
    }

    public void setRemover(int remover) {
        this.remover = remover;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "anexar=" + anexar +
                ", editar=" + editar +
                ", remover=" + remover +
                '}';
    }
}
