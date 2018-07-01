package Pessoas;

import javax.swing.JOptionPane;

public class CadastroPessoas {
	
	private String Nome;
	private String Email;
	private float Rendimento;
	
	
	   public String toString() {
	        return (    " Nome : "+ this.getNome()  + " / " +
	                    " Email : "+ this.getEmail() + " / " +
	                    " Rendimento : " + this.getRendimento() + "\n");
	   }
	   
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public void setEmail(String email) {
		this.Email = email;
	}
	
	public void setRendimento(float rendimento) {	
		this.Rendimento = rendimento;
	}
	
	
	public String getNome() {
		return this.Nome;
	}
	public String getEmail() {
		return this.Email;
	}
	public float getRendimento() {
		return this.Rendimento;
	}
	
	public CadastroPessoas Cadastrar() {
		
		CadastroPessoas aluno = new CadastroPessoas();
		
		aluno.setNome(JOptionPane.showInputDialog("Qual é o nome do aluno?"));
		
		aluno.setEmail(JOptionPane.showInputDialog("Qual é o email do aluno?"));
		
		aluno.setRendimento(Float.parseFloat(JOptionPane.showInputDialog("Qual o Rendimento Mensal do Aluno?")));
		return aluno;

	}

}
