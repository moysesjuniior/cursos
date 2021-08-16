package ex1;

public class Crianca {
    private String nome;
    private String personalidade;

    public void boazinha() {
        System.out.println("Parabéns! Você ganhou presente!");
    }
    public void malvada() {
        System.out.println("Você foi malvada e não ganhou presente!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

}
