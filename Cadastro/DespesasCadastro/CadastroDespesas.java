package DespesasCadastro;

import javax.swing.JOptionPane;

public class CadastroDespesas {
	
	private String Descricacao;
	private CadastroCategoria Categoria = new CadastroCategoria();
	private float Valor;
	
	
	public void setDescricacao(String descricacao) {
		this.Descricacao = descricacao;
	}
    
	public void setValor(float valor) {
		this.Valor = valor;
	}
	
	public float getValor() {
		return this.Valor;
	}
	
	public String getDescricacao() {
		return this.Descricacao;
	}

	public CadastroDespesas Cadastrar() {
		
		CadastroDespesas Despesas = new CadastroDespesas();
		
		
		
		Despesas.setValor(Float.parseFloat(JOptionPane.showInputDialog("Qual o Valor da despesa?")));
		return Despesas;
		
	}



public String toString() {
return ("*************************"+ "\n" + "Descrição:" + this.getDescricacao() + "\n" + "Categoria:"+ "\n" +
                "Subcategoria:"+ "\n" +
                "Valor:"+ this.getValor() + "\n" + "*************************" + "\n");
}
}
