package exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
	int idFunc;
	String nomeFunc; 
	String departamento;       
    LocalDate dataContratacao = LocalDate.parse("2018-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    double salario;
	String documento;
	boolean ativo;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    String documento;
    boolean ativo;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    void bonifica(double aumento) {
        double bonificacao = this.salario + aumento;
        this.salario = bonificacao;
    }

    void demiteFuncionario() {
        this.ativo = true;
    }

    void imprimir(){
        System.out.println(idFunc);
        System.out.println(nomeFunc);
		System.out.println(departamento);
		System.out.println(salario);
        System.out.println(dataContratacao);
        System.out.println(demiteFuncionario);
    }
}