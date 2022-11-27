import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
 class Musica {
			private String id;//Variaveis
			private String nome; 
			private String key;
			private List <String> artists = new ArrayList<>();
			private Date release_date;
			private double acousticness;
			private double danceability;
			private double energy;
			private int duration_ms;
			private double instrumentalness;
			private double valence;
			private int popularity;
			private float tempo;
			private double liveness;
			private double loudness;
			private double speechiness;
			private int year;
			
			//id ## artists ## name ## realease date ## acousticness ## danceability ##
			//instrumentalness ## liveness ## loudness ## speechiness ## energy ## duration
			
			public String getId (){ //Gets
				return id;
			}
			public String getNome (){ 
				return nome;
			}
			public String getKey (){
				return key;
			}
			public List<String> getArtists (){
				return artists;
			}
			public Date getRelease_date (){
				return release_date;
			}
			public double getAcousticness (){
				return acousticness;	
			}
			public double getDanceability (){
				return danceability;	
			}
			public double getEnergy(){
				return energy;	
			}
			public int getDuration_ms(){
				return duration_ms;
			}
			public double getInstrumentalness (){
				return instrumentalness;	
			}
			public double getValence (){
				return valence;	
			}
			public int getPopularity(){
				return popularity;
			}
			public float getTempo (){
				return tempo;	
			}
			public double getLiveness (){
				return liveness;	
			}
			public double getLoudness (){
				return loudness;	
			}
			public double getSpeechiness (){
				return speechiness;
			}
			public int getYear (){
				return year;
			}

			public void setId (String ide){ //Sets
				 id=ide;
			}
			public void setNome (String no){ 
				 nome=no;
			}
			public void setKey (String kei){
				 key=kei;
			}
			public void setArtists (List<String> art){
				artists=art;
			}
			public void setRelease_date (Date release){
				release_date=release;
			}
			public void setAcousticness (Double ac){
				 acousticness=ac;	
			}
			public void setDanceability (Double dance){
				 danceability=dance;	
			}
			public void setEnergy(Double ener){
				 energy=ener;	
			}
			public void setDuration_ms(int duration){
				 duration_ms=duration;
			}
			public void setInstrumentalness (Double instru){
				instrumentalness=instru;	
			}
			public void setValence (Double valen){
				 valence=valen;	
			}
			public void setPopularity(int popu){
				 popularity=popu;
			}
			public void setTempo (Float time){
				 tempo=time;	
			}
			public void setLiveness (Double live){
				 liveness=live;	
			}
			public void setLoudness (Double loud){
				 loudness=loud;	
			}
			public void setSpeechiness (Double speech){
				 speechiness=speech;
			}
			public void setYear (int yea){
				 year=yea;
			}
			

			public Musica(){//Construtor
				id=null;
				nome=null;
				key=null;
				artists=null;
				release_date=null;
				acousticness=0.0;
				danceability=0.0;
				energy=0.0;
				duration_ms=0;
				instrumentalness=0.0;
				valence=0.0;
				popularity=0;
				tempo=0;
				liveness=0.0;
				loudness=0.0;
				speechiness=0.0;
				year=0;
			}

			public Musica(String id,String nome, String key,List<String> artists,Date release_date,double acousticness,double danceability,double energy,int duration_ms,double instrumentalness,double valence,int popularity,float tempo,double liveness,double loudness,double speechiness,int year){//Construtor 2
				this.id=id;
				this.nome=nome;
				this.key=key;
				this.artists=artists;
				this.release_date=release_date;
				this.acousticness=acousticness;
				this.danceability=danceability;
				this.energy=energy;
				this.duration_ms=duration_ms;
				this.instrumentalness=instrumentalness;
				this.valence=valence;
				this.popularity=popularity;
				this.tempo=tempo;
				this.liveness=liveness;
				this.loudness=loudness;
				this.speechiness=speechiness;
				this.year=year;
			}

			public Musica clone(){//Como esta escrito,clona
				Musica temp = new Musica();

				temp.id = this.id;
				temp.nome = this.nome;
				temp.key = this.key;
				temp.artists = this.artists;
				temp.release_date = this.release_date;
				temp.acousticness = this.acousticness;
				temp.danceability = this.danceability;
				temp.energy = this.energy;
				temp.duration_ms = this.duration_ms;
				temp.instrumentalness = this.instrumentalness;
				temp.valence = this.valence;
				temp.popularity = this.popularity;
				temp.tempo = this.tempo;
				temp.liveness = this.liveness;
				temp.loudness = this.loudness;
				temp.speechiness = this.speechiness;
				temp.year = this.year;

				return temp;
			}

			public void imprimir (){//Printar

				SimpleDateFormat datatemp= new SimpleDateFormat("dd/MM/yyyy");
				MyIO.print (id + " ## " + artists + " ## " + nome + " ## " + datatemp.format(release_date) + " ## " + acousticness + " ## " + danceability + " ## " + instrumentalness + " ## " + liveness + " ## " + loudness + " ## " + speechiness + " ## " + energy + " ## " + duration_ms + "\n" );
			}

			// valence,year,acousticness,artists,danceability,duration_ms,energy,explicit,id,instrumentalness,
			// key,liveness,loudness,mode,name,popularity,release_date,speechiness,tempo

			public void ler (String caminho,String datacsv[]) throws ParseException{//Ler os bagulho e arrumar
				String json = "";
				//MyIO.println("foi: "+caminho);
				for (int i = 0; i < datacsv.length; i++) {
					if (datacsv[i] != null && datacsv[i].contains(caminho)) {
						json += datacsv[i];
						i = datacsv.length;
					}
				}
				//while (Arq.hasNext()&& !achou){
				//	json=Arq.readLine(); 
				//	if (json.contains(""+caminho)){
				//		achou=true;
				//	} 
				//}

				//try {
				//	json = ISO88591toUTF8(json);//converter
				//} catch (Exception e) {
				//	MyIO.println("Deu ruim.");
				//}
				//MyIO.println(""+json);
				
				//MyIO.println("ENTROU"+json);
				if (json.contains("\"")){
					String[] tempp = json.split ("\"");
					if(json.contains("\"[\"\"")){
						json=json.replace ("\"","");
					}
					else if(tempp.length==3 && (!json.contains("\"["))){
						tempp[0]=tempp[0].replace("\"","");
						tempp[1]=tempp[1].replace(",",";");
						tempp[2]=tempp[2].replace("\"","");
						//MyIO.println("TEMPP: "+tempp[1]);
						json=tempp[0]+tempp[1]+tempp[2];
					}
					else if(tempp.length==3 ){
					tempp[0]=tempp[0].replace("\"","");
					tempp[1]=tempp[1].replace("\'[",";");
					tempp[1]=tempp[1].replace(",",";");
					//MyIO.println(""+tempp[1]);
					tempp[1]=tempp[1].replace("\"","");
					json=tempp[0]+tempp[1]+tempp[2];
					//MyIO.println(""+json);
					}
					else if(tempp.length==5){
						tempp[0]=tempp[0].replace("\"","");
						tempp[1]=tempp[1].replace("\"","");
						tempp[1]=tempp[1].replace(",",";");
						tempp[2]=tempp[2].replace("\"","");
						tempp[3]=tempp[3].replace(",",";");
						tempp[3]=tempp[3].replace(",",";");
						tempp[4]=tempp[4].replace("\"","");
						//MyIO.println("ENTROU"+tempp[1]);
						json=tempp[0]+tempp[1]+tempp[2]+tempp[3]+tempp[4];
					}
					else if(tempp.length==7){
						tempp[0]=tempp[0].replace("\"","");
						tempp[1]=tempp[1].replace("\"","");
						tempp[1]=tempp[1].replace(",",";");
						tempp[2]=tempp[2].replace("\"","");
						tempp[3]=tempp[2].replace("\"","");
						tempp[4]=tempp[4].replace("\"","");
						tempp[5]=tempp[5].replace("\"","");
						tempp[5]=tempp[5].replace(",",";");
						//MyIO.println("ENTROU"+tempp[1]);
						json=tempp[0]+tempp[1]+tempp[2]+tempp[3]+tempp[4]+tempp[5]+tempp[6];
					}
					else if(tempp.length==13){
						tempp[0]=tempp[0].replace("\"","");
						tempp[1]=tempp[1].replace("\"","");
						tempp[1]=tempp[1].replace(",",";");
						tempp[2]=tempp[2].replace("\"","");
						tempp[3]=tempp[2].replace("\"","");
						tempp[4]=tempp[4].replace("\"","");
						tempp[5]=tempp[5].replace("\"","");
						tempp[6]=tempp[6].replace("\"","");
						tempp[7]=tempp[7].replace("\"","");
						tempp[8]=tempp[8].replace("\"","");
						tempp[9]=tempp[9].replace("\"","");
						tempp[10]=tempp[10].replace("\"","");
						tempp[11]=tempp[11].replace("\"","");
						tempp[12]=tempp[12].replace("\"","");
						//MyIO.println("ENTROU"+tempp[1]);
						json=tempp[0]+tempp[1]+tempp[2]+tempp[3]+tempp[4]+tempp[5]+tempp[6]+tempp[7]+tempp[8]+tempp[9]+tempp[10]+tempp[11]+tempp[12];
					}
					
				}
				//MyIO.println("ENTROU"+json);
				
				//MyIO.println("ENTROU"+json);
				String[] propriedades = json.split(",");//dividir e conquistar (Split>>>>>>>>>>>>>)
				//MyIO.println("ta aqui: <>"+propriedades[14]);
				String temp;
				temp=propriedades[0].split(",")[0].replace(",", "").trim();
				valence = Double.parseDouble(temp);
				temp=propriedades[1].split(",")[0].replace(",", "").trim();
				year = Integer.parseInt(temp);
				temp=propriedades[2].split(",")[0].replace(",", "").trim();
				acousticness = Double.parseDouble(temp) ;
				//MyIO.println(""+propriedades[3]);
				String templist = propriedades[3].split(",")[0].replace("'", "").trim();
				//MyIO.println(""+templist);
				templist.replace(",","");
				//MyIO.println(""+templist);
				if (templist.contains(";")){
					//MyIO.println(""+artists);
					templist=templist.replace(";",",");
				}		
				//MyIO.println(""+templist);
				templist=templist.replace("[","");
				templist=templist.replace("]","");
				artists = new ArrayList<String>(Arrays.asList(templist));
				//MyIO.println(""+artists);
				temp=propriedades[4].split(",")[0].replace(",", "").trim();
				danceability = Double.parseDouble(temp) ;
				temp=propriedades[5].split(",")[0].replace(",", "").trim();
				duration_ms =  Integer.parseInt(temp);
				temp=propriedades[6].split(",")[0].replace(",", "").trim();
				energy = Double.parseDouble(temp) ;
				String explicit = propriedades[7].split(",")[0].replace(",", "").trim();
				id = propriedades[8].split(",")[0].replace(",", "").trim();
				temp=propriedades[9].split(",")[0].replace(",", "").trim();
				instrumentalness = Double.parseDouble(temp) ;
				key = propriedades[10].split(",")[0].replace(",", "").trim() ;
				temp=propriedades[11].split(",")[0].replace(",", "").trim();
				liveness = Double.parseDouble(temp) ;
				temp=propriedades[12].split(",")[0].replace(",", "").trim();
				loudness = Double.parseDouble(temp) ;
				String mode =  propriedades[13].split(",")[0].replace(",", "").trim();
				nome =  propriedades[14].split(",")[0].replace(",", "").trim();
				if (nome.contains(";")){
					nome=nome.replace(";",",");
					nome=nome.replace("\'","");
				}
				temp=propriedades[15].split(",")[0].replace(",", "").trim();
				popularity = Integer.parseInt(temp);
				String tempdate= (propriedades[16].split(",")[0].replace(",", "").trim() );
				String tempdate2;
				if (tempdate.length()==4){
					tempdate2="-01-01";
					tempdate= (tempdate+tempdate2);
				}
					else if(tempdate.length()==7){
						tempdate2="-01";
						tempdate= tempdate+tempdate2;
					}
				release_date = new SimpleDateFormat("yyyy-MM-dd").parse(tempdate);
				temp=propriedades[17].split(",")[0].replace(",", "").trim();
				speechiness = Double.parseDouble(temp) ;
				temp=propriedades[18].split(",")[0].replace(",", "").trim();
				tempo = Float.parseFloat (temp);

				//nome = propriedades[0].split(":")[1].replace("\'", "").trim();

				//String temp = propriedades[1].split(":")[1].replace("\'", "").trim();
				//if(!temp.equals("unknown"))
				//	altura = Integer.parseInt(temp.replace(",", ""));
				//	else {
				//		altura = Integer.parseInt(temp.replace("unknown", "0"));
				//	}
//
				//temp = propriedades[2].split(":")[1].replace("\'", "").trim();
				//if(!temp.equals("unknown"))
				//	peso = Double.parseDouble(temp.replace(",", ""));
				//	else {
				//		peso = Double.parseDouble(temp.replace("unknown", "0.0"));
				//	}
//
				//corDoCabelo = propriedades[3].split(":")[1].replace("\'", "").trim();
				//corDosOlhos = propriedades[4].split(":")[1].replace("\'", "").trim();
				//codDaPele = propriedades[5].split(":")[1].replace("\'", "").trim();
				//anoNascimento = propriedades[6].split(":")[1].replace("\'", "").trim();
				//genero = propriedades[7].split(":")[1].replace("\'", "").trim();
				//homeworld = propriedades[8].split(":")[1].replace("\'", "").trim();
			}

			public static String ISO88591toUTF8(String strISO) throws Exception {//copiei do felipe deve ta certo (converter)
        		byte[] isoBytes = strISO.getBytes("ISO-8859-1");
        		return new String(isoBytes, "UTF-8");
    		}
			
		}

	 

public class q1 {
	static Musica[] array = new Musica[256];

	public static void swap(int i, int j) {
		Musica temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int getMaior(int n) {
		int maior = (int)array[0].getPopularity();

		for (int i = 0; i < n; i++) {
			if (maior < (int)array[i].getPopularity()) {
				maior = (int)array[i].getPopularity();
			}
		}
		return maior;
	}

	/**
	 * Algoritmo de ordenacao Countingsort.
	 */
	public static void countingsort(int n) {
		// Array para contar o numero de ocorrencias de cada elemento
		int[] count = new int[getMaior(n) + 1];
		Musica[] ordenado = new Musica[n];

		// Inicializar cada posicao do array de contagem
		for (int i = 0; i < count.length; count[i] = 0, i++);

		// Agora, o count[i] contem o numero de elemento iguais a i
		for (int i = 0; i < n; count[(int)array[i].getPopularity()]++, i++);

		// Agora, o count[i] contem o numero de elemento menores ou iguais a i
		for (int i = 1; i < count.length; count[i] += count[i - 1], i++);

		// Ordenando
		for (int i = n - 1; i >= 0; ordenado[count[(int)array[i].getPopularity()] - 1] = array[i], count[(int)array[i].getPopularity()]--, i--);

		// Copiando para o array original
		for (int i = 0; i < n; array[i] = ordenado[i], i++);
	}


	
	public static void main (String[] args) throws ParseException {
		MyIO.setCharset("UTF-8");

		String[] entrada = new String[200000]; //valor adequeado pra nao dar overflow
        int numEntrada = 0;

		String[] datacsv= new String [170627];
		Arq.openRead("data.csv","UTF-8");
		int w = 0;
		while (Arq.hasNext()) {
			datacsv[w] = Arq.readLine();
			w++;
		}
		Arq.close();

        // Leitura da entrada padrao
        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (entrada[numEntrada++].equals("FIM") == false);
        numEntrada--; // Desconsiderar ultima linha contendo a palavra FIM
        // Para cada entrada pesquisar atributos
        for (int i = 0; i < numEntrada; i++) {
			array[i] = new Musica();
			array[i].ler(entrada[i],(datacsv));  
			//MyIO.println(""+i);      
        }

		countingsort(numEntrada);
		for (int i = 0; i < numEntrada; i++) {
			array[i].imprimir();
		}
	}

}