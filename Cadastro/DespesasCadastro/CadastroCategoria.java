
package DespesasCadastro;

import javax.swing.JOptionPane;

public class CadastroCategoria {
	private String Categoria;
	private String Subcategoria;
	
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getSubcategoria() {
		return Subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		Subcategoria = subcategoria;
	}
	
	public CadastroCategoria Cadastrar() {
		
		CadastroCategoria Categoria = new CadastroCategoria();
		
		Categoria.setCategoria(JOptionPane.showInputDialog("Qual é o nome da Categoria?"));
		Categoria.setSubcategoria(JOptionPane.showInputDialog("Qual é o nome do aluno?"));
		return Categoria;
	}
	
}
