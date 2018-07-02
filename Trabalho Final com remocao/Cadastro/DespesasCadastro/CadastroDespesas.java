package DespesasCadastro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CadastroDespesas {
	
	private CadastroCategoria Categoria = new CadastroCategoria();
	private ArrayList<String> Subcategorias = new ArrayList();
	private float Valorindividual;
	private float Valor;
	
	public void setVetor(ArrayList<String> a) {
		
		this.Subcategorias = a;
		
	}
    
	public void setValor(float valor) {
		this.Valor = valor;
	}
	
	public float getValor() {
		return this.Valor;
	}
	
	public void setValorindividual(float valor) {
		this.Valorindividual = valor;
	}
	
	public float getValorindividual() {
		return this.Valorindividual;
	}
	public String getCategoria(){
		
		return this.Categoria.getCategoria();
		
	}
	
	public void setCategoria(String categoria) {
		this.Categoria.setCategoria(categoria);
	}
	
	public String getSubcategoria(){
		
		return this.Categoria.getSubcategoria();
		
	}
	
	public void setSubategoria(String Subcategoria) {
		this.Categoria.setSubcategoria(Subcategoria);
	}
	


	public CadastroDespesas Cadastrar() {
		CadastroDespesas Despesas = new CadastroDespesas();
		ArrayList<String> Sub = new ArrayList();
		int p = 0;
		int q = 0;
		float Valor1 = 0;
		Despesas.setCategoria(JOptionPane.showInputDialog("Qual a Categoria da Despesa"));		
		int b = 0;
		while(b == 0) {
		
			Object[] options = {"Sim",
	                "Não"};
	int n = JOptionPane.showOptionDialog(null,
	"Gostaria de Cadastrar Subcategoria?",
	"Cadastros República",
	JOptionPane.YES_NO_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE,
	null,
	options,
	options[1]);
	
	if(n == -1) {
		break;
	}
	if(n == 0) {
		
		
		Despesas.setSubategoria(JOptionPane.showInputDialog("Qual a Subcategoria da Despesa?"));
		Sub.add("Subcategoria:" + Despesas.getSubcategoria() + " / ");
		Despesas.setValorindividual(Float.parseFloat(JOptionPane.showInputDialog("Qual o Valor desta despesa?")));
		Sub.add("Valor:" + Despesas.getValorindividual() + "\n");
		Valor1 = Despesas.getValorindividual() + Valor1;
		p = 1;
		
	}
	else if(n == 1) {	
		q = 1;
		break;
	}	
		}
		
		if(q == 1 && p == 0) {
			
			Despesas.setSubategoria("-1");
			Despesas.setValorindividual(Float.parseFloat(JOptionPane.showInputDialog("Qual o Valor desta despesa?")));
			Valor1 = Despesas.getValorindividual() + Valor1;
			
		}
		Despesas.setVetor(Sub);
		Despesas.setValor(Valor1);
		return Despesas;	
	}



public String toString() {
if(this.getSubcategoria() == ("-1")) {
	return ("Categoria : " + this.getCategoria() + " /  "+ "Valor : "+ this.getValorindividual() + "\n");
}else {

return ("Categoria : " + this.getCategoria() +"\n" + this.Subcategorias.toString() + "\n");
}
}
}