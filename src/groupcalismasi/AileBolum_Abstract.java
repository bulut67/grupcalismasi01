package groupcalismasi;

public class AileBolum_Abstract extends Restoran_Abstract {

	public static void main(String[] args) {
		
		
		
		
		AileBolum_Abstract aile=new AileBolum_Abstract();
		 aile.Cay();
		 aile.wifi();
		 aile.oyunSalonu();
		 aile.Su();
		
		
		
	}

	@Override
	void Su() {
		System.out.println("Su servisi zorunlu");
	}
	
	@Override
	public void Cay() {
	System.out.println("Cay  servisi zorunlu");
		
	}

	@Override
	public void wifi() {
		System.out.println("Wifi istege baglidir");
	}

	@Override
	public void oyunSalonu() {
		System.out.println("Aileler icin oyun salonu istege bagli");
	}

	
	
	
	
	

}
