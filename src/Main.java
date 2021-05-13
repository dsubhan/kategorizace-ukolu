import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priorita dulNal = Priorita.DULEZITE_NALEHAVE;
		Priorita dulNenal = Priorita.DULEZITE_NENALEHAVE;
		Priorita nedNal = Priorita.NEDULEZITE_NALEHAVE;
		Priorita nedNenal = Priorita.NEDULEZITE_NENALEHAVE;
		
		
		Ukol u = new Ukol("Projekt", dulNal);
		
		Array a = new Array();
		
		a.pridatUkol(u);
		
		System.out.println(a);
		
		HashMap<Priorita, Ukol> stejnaPriorita = new HashMap<Priorita, Ukol>();
		
		stejnaPriorita.put(dulNal, u);
		
		System.out.println(stejnaPriorita.get(dulNal));
		
		HashMap<Ukol, Priorita> dostatPrioritu = new HashMap<Ukol, Priorita>();
		
		dostatPrioritu.put(u, dulNal);
		
		System.out.println(dostatPrioritu.get(u));
	}

}
