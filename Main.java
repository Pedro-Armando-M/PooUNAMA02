class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    //Construtor 1
    public Tarefa(String titulo, String descricao, String prazo, int prioridade){
        this.titulo=titulo;
        this.descricao=descricao;
        this.prazo=prazo;
        this.prioridade=prioridade;
    }
    //Construtor 2: Sobrecarga de Construtor
    public Tarefa(String titulo, String descricao){
        this.titulo = titulo;
        this.prazo = prazo;
        this.descricao="";
        this.prioridade= 0;
    }
    
    //GETs e SETs
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    

    public void exibir(){
        System.out.println("Titulo" + this);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }
    }



public class Main{

    public static void main(String[] args){
            
        Tarefa tarefa1= new Tarefa("Estudar POO", "Revisar conceitos de classe de objs", "04/09/2024",1);
        
        System.out.println("=============== Testando métodos gets ===============");
        System.out.println("Título: " + tarefa1.getTitulo());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println();

        System.out.println("=============== Imprimindo com método exibitDetalhes() ===============");
        tarefa1.exibir();


        Tarefa tarefa2= new Tarefa("Estudar para prova", );

    }
}