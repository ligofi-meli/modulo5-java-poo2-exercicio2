package gomes.filipe;

public class Participante {
    private final String rg, nome, sobrenome, telefone, numEmergencia, grupoSangue;
    private final int idade;
    private double valorInscricao;

    public Participante(String rg, String nome, String sobrenome, String telefone, String numEmergencia, String grupoSangue, int idade) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.numEmergencia = numEmergencia;
        this.grupoSangue = grupoSangue;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", numEmergencia='" + numEmergencia + '\'' +
                ", grupoSangue='" + grupoSangue + '\'' +
                ", idade=" + idade +
                ", valorInscricao=" + valorInscricao +
                '}';
    }

    public double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNumEmergencia() {
        return numEmergencia;
    }

    public String getGrupoSangue() {
        return grupoSangue;
    }

    public int getIdade() {
        return idade;
    }
}
