import java.util.Collection;

public class Array implements Ukoly{

	int n;
	
	Ukol poleUk[] = new Ukol[n+1];
	
	public void pridatUkol(Ukol ukol) {
		
		for(int i=0; i<poleUk.length;i++) {
			poleUk[i]=ukol;

		}
		
		
	}

	
	public Collection najdiUkol(String nazev) {
		
		for(int i = 0; i<poleUk.length; i++) {
			
		}
		
		return null;
	}

}
