import java.time.Duration;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {


		System.out.println("MyFlight project...");

        GerenciadorCias cias = new GerenciadorCias();

		CiaAerea c1  = new CiaAerea("G3", "Gol");
        CiaAerea c2  = new CiaAerea("JJ", "LATAM");
        CiaAerea c3  = new CiaAerea("AZ", "Azul");

        cias.adicionar(c1);
        cias.adicionar(c2);
        cias.adicionar(c3);

        for (CiaAerea c: cias.listarTodas()){
            System.out.println(c + "\n");
        }

        Geo portoAlegre = new Geo(23,22);
        Geo saoPaulo = new Geo (24, 26);
        Geo london = new Geo (35,39);

        Aeroporto portoAlegreAero = new Aeroporto ("POA", "Porto Alegre", portoAlegre);
        Aeroporto saoPauloAero = new Aeroporto ("GRU", "São Paulo", saoPaulo);
        Aeroporto londonAero = new Aeroporto ("LON" , "Londres", london);

        Aeronave aviao1 = new Aeronave ("B747", "Boing 747", 200);

        Rota r1 = new Rota (portoAlegreAero, saoPauloAero, aviao1, c1);
        Rota r2 = new Rota (saoPauloAero, londonAero, aviao1, c1);
        Rota r3 = new Rota(londonAero, saoPauloAero, aviao1, c1);
        Rota r4 = new Rota (saoPauloAero, portoAlegreAero, aviao1, c1);

        long distanciaR1 = (long)r1.calculaDistancia();
        long distanciaR2 = (long)r2.calculaDistancia();
        long distanciaR3 = (long)r3.calculaDistancia();
        long distanciaR4 = (long)r4.calculaDistancia();

        long tempoHR1 = distanciaR1 / 805;
        long tempoHR2 = distanciaR2 / 805;
        long tempoHR3 = distanciaR3 / 805;
        long tempoHR4 = distanciaR4 / 805;

        LocalDateTime datahora = LocalDateTime.of(2019, 6, 30, 12, 00);
        Duration duracao = Duration.ofHours(tempoHR1 + tempoHR2 + tempoHR3 + tempoHR4);
        Duration duracaoV2 = Duration.ofHours(tempoHR1);


/*--------------------------------------------------------------------------*/
        VooEscalas vooTeste = new VooEscalas(datahora, duracao);
        vooTeste.adicionarRota(r2);
        vooTeste.adicionarRota(r3);
        vooTeste.adicionarRota(r4);
        System.out.print (vooTeste + "\n\n");

		VooDireto vooTeste2 = new VooDireto(r1, datahora, duracaoV2);
		System.out.print (vooTeste2);

		 
	}
}