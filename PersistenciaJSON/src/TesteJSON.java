import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteJSON {
	public static void main(String[] args){
		try {
			ObjectMapper objeto = new ObjectMapper();
			//objeto para utilizar na serealização
			Pessoa pes = new Pessoa("Abel", 45);
			
			//serealizar o obj pes
			String json = objeto.writeValueAsString(pes);
			
			System.out.println("Objeto serealizado");
			System.out.println(json);
			
			//deserealizar o JSON para o obj pes
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserealizado para obj Pessoa:");
			System.out.println("Nome: " + desPessoa.getNome());
			System.out.println("Idade: " + desPessoa.getIdade());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
