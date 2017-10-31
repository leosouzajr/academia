package Model;

public class Aluno {
    private int matriculaAluno;
    private String nomeAluno;
    private String telefone;
    private int diasDeAulaNaSemana;
    private Instrutor instrutor;
   
    public int getMatriculaAluno() {
        return matriculaAluno;
   
        
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getDiasDeAulaNaSemana() {
        return diasDeAulaNaSemana;
    }

    public void setDiasDeAulaNaSemana(int diasDeAulaNaSemana) {
        this.diasDeAulaNaSemana = diasDeAulaNaSemana;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    
}
