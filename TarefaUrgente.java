//Classe TarefaUrgente é um extensão da classe Tarefa
//Herança de classe

public class TarefaUrgente extends Tarefa{

    private String razaoUrgencia;

    //Contrutor da TarefaUrgente
    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoUrgencia){
        super (titulo , descricao , prazo , 5);
        this.razaoUrgencia = razaoUrgencia;

    }

    //Metodos Gets and Sets
    public getRazaoUrgencia(){
        return this.razaoUrgencia;
    }

    public void setRazaoUrgente(String razaoUrgencia){
        this.razaoUrgencia=razaoUrgencia;
    }

    @Override//sobrescrição de metodo
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Razao Urgencia:" + this.razaoUrgencia)
    }
}