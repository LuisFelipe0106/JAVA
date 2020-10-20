package Exercicio2;

public class Pessoa {
    private String nome;
    private int idade,idadeNova;

    public Pessoa() {
        setNome("");
        setIdade(0);
        setIdadeNova(0);
    }

    public void setNome(String sNome) { nome=sNome; }
    public String getNome() { return nome; }

    public void setIdade(int iIdade) { idade=iIdade; setIdadeNova(getIdade()); }
    public int getIdade() { return idade; }

    public void setIdadeNova(int iIdadeNova) { idadeNova=iIdadeNova; }
    public int getIdadeNova() { return idadeNova; }

    public void fazAniversario() { setIdadeNova(getIdadeNova()+1); }

    public void imprimePessoa() {
        System.out.println("Pessoa: "+getNome()+"\nIdade: "+getIdade()+"\nFez aniversario! Idade: "+getIdadeNova());
    }
}