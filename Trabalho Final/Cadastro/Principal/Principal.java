package Principal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import DespesasCadastro.CadastroCategoria;
import DespesasCadastro.CadastroDespesas;
import Pessoas.CadastroPessoas;
import DespesasValor.Igualitaria;
import DespesasValor.Proporcional;



public class Principal {
	public static void main(String[] args) throws IOException {
	ArrayList<CadastroPessoas> Pessoas = new ArrayList();
	ArrayList<CadastroDespesas> Despesas = new ArrayList();
	CadastroPessoas pessoa = new CadastroPessoas();
	CadastroDespesas despesa = new CadastroDespesas();
	

int x = 1;
while(x != 0) {

		Object[] options = {"Cadastras Pessoa",
                "Cadastrar Despesa",
                "Checar"};
int n = JOptionPane.showOptionDialog(null,
"O que gostaria de fazer?",
"Cadastros Rep�blica",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[2]);
if(n == -1) {
	break;
}
if(n == 0) {
	Pessoas.add(pessoa.Cadastrar());
    ArrayList<String> lines = new ArrayList<>();
	lines.add(Pessoas.toString());
	Path file = Paths.get("alunos.txt");
	Files.write(file, lines, Charset.forName("UTF-8"));

}
else if(n == 1) {		
	
	Despesas.add(despesa.Cadastrar());

}

else if(n == 2) {

	checa(Pessoas, Despesas);
	
}
}
	}

	private static void checa(ArrayList<CadastroPessoas> Pessoas, ArrayList<CadastroDespesas> Despesas) throws IOException {
	int x = 1;
	while(x != 0) {

			Object[] options = {"Checar Pessoas",
					"Checar Despesas",
					"Checar Contribui��o",
	                "Voltar"};
	int n = JOptionPane.showOptionDialog(null,
	"O que gostaria de fazer?",
	"Cadastros Rep�blica",
	JOptionPane.YES_NO_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE,
	null,
	options,
	options[2]);
	float DespesaTotal = 0;
	float RendimentoTotal = 0;
	
	for(int i =0;i<Despesas.size();i++) {
		
		DespesaTotal = DespesaTotal + Despesas.get(i).getValor();
	}
	
	for(int i =0;i<Pessoas.size();i++) {
		
		RendimentoTotal = RendimentoTotal + Pessoas.get(i).getRendimento();
	}
	
	if(n == -1) {
		break;
	}
	if(n == 0) {
		JOptionPane.showMessageDialog(null, Pessoas.toString());
		
	}
	else if(n == 1) {	
		
		JOptionPane.showMessageDialog(null, Despesas.toString());

	}

	else if(n == 2) {
	contribuicao(RendimentoTotal, DespesaTotal, Pessoas);
		
	}
	else if(n == 3) {
		break;
		
	}
	}

	}

	private static void contribuicao(float rendimentototal, float despesatotal, ArrayList<CadastroPessoas> Pessoas) {
		
		Object[] options = {"Regra Igualit�ria",
		"Regra Proporcional"};
int n = JOptionPane.showOptionDialog(null,
"O que gostaria de fazer?",
"Cadastros Rep�blica",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[1]);
	if(n == 0) {
		float ContribuicaoIgualitaria;
		
		Igualitaria contribuicao = new Igualitaria();
		ContribuicaoIgualitaria  = contribuicao.Calcula(Pessoas.size(), despesatotal);
		JOptionPane.showMessageDialog(null,"O total de despesas �:" + despesatotal + "\n" +  "R$" + ContribuicaoIgualitaria + " para cada um");

	}
	
	if(n == 1) {
		ArrayList<String> listacontri = new ArrayList();
		Proporcional contribuicao = new Proporcional();
		float[] armazena = new float[Pessoas.size()];
		float[] porcentagem = new float[Pessoas.size()];
		for(int i = 0; i < Pessoas.size();i++) {
			
		armazena[i] = contribuicao.Calcula(Pessoas.get(i).getRendimento(), despesatotal, rendimentototal);
		porcentagem[i] = (armazena[i]*100)/despesatotal;
		}
		
		for(int i = 0; i < Pessoas.size();i++) {
		listacontri.add("O total de despesas �:" + despesatotal + "\n" + Pessoas.get(i).getNome() + " deve contribuir com R$: " + armazena[i] + "\n" + porcentagem[i] + "%" + "\n" + "***********************" + "\n");
		}
		JOptionPane.showMessageDialog(null, listacontri.toArray());
		
	}
	}

}