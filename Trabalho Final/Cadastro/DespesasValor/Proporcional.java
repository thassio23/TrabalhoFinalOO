package DespesasValor;

public class Proporcional {
	
	public float Calcula(float Rendimento, float SomadasDespesas, float SomadosRendimentos) {
		
		float Porcentagem;
		float ValordaPessoa;
		
		Porcentagem = Rendimento/SomadosRendimentos;
				
		ValordaPessoa = Porcentagem*SomadasDespesas;
		
		
		return ValordaPessoa;
		
	}

}
