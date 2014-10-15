import java.util.ArrayList;

/**Erklaert anhand von Beispielen die verschiedenen Teile der Polymorphie
 * 
 * @author Martin Kritzl
 * @version 20141015
 */

public class Main{
	private Fahrzeug fz1;
	private Fahrrad f1;
	private Kraftfahrzeug k1;
	private PKW p1;
	private LKW l1;
	
	/**
	 * Erzeugt alle notwendigen Objekte zur Veranschaulichung der Polymorphie
	 */
	
	public Main () {
		this.fz1 = new Fahrzeug(1997, 15000.00);
		this.f1 = new Fahrrad(2000, 500.00, 20);
		this.k1 = new Kraftfahrzeug(2000, 20000.00,(short) 100,7.00);
		this.p1 = new PKW(1997, 9999.99, (short) 120, 10.0, "Kritzl Martin");
		this.l1 = new LKW(1990, 50000.00, (short) 400, 20.0, "Schotter");
	}
	
	/**
	 * Generizität wird verwendet um eine Methode oder Klasse nicht für einen speziellen Datentyp zu schreiben,
	 * sondern diese für verschiedene Typen verwendbar zu machen. Dabei setzt man statt dem Datentyp einen
	 * Platzhalter ein.
	 */
	
	public void generizitaet() {
		
		/*
		 * Es soll der Verbrauch der Fahrzeuge angezeigt werden
		 */
		
		
		//Dazu wird eine Liste erstellt, in der nur Kraftfahrzeuge zugelassen sind
		ArrayList<Kraftfahrzeug> al = new ArrayList<Kraftfahrzeug>();
		
		/*
		 * Das Hinzufügen eines Fahrzeugs und einem Fahrrad ist nicht gestattet, da diese keine Kraftfahrzeuge sind
		 * In diesem Beispiel soll der Verbrauch des Fahrzeugs ausgegeben werden, aber sowohl das Fahrzeug als auch das
		 * Rad hat diese Eigenschaft nicht. Das bedeutet, nur die Klasse Kraftfahrzeug oder erbende Klassen dürfen hinzugefügt
		 * werden, da nur bei diesen sichergestellt werden kann, dass diese die gewünschten Eigenschaften haben
		 */
		//al.add(this.fz1);
		//al.add(this.f1);
		
		/*
		 * Hinzufügen der Kraftfahrzeuge
		 */
		al.add(this.p1);
		al.add(this.l1);
		al.add(this.k1);
		
		/*
		 * Ausgeben des Verbrauchs
		 */
		System.out.println("Bezinverbrauch der Fahrzeuge:");
		for (Kraftfahrzeug kf : al) {
			System.out.println("\t" + kf.getVerbrauch());
		}
		
		/*
		 * Wenn nun die Zuladung ausgegeben werden soll, ist dies nicht möglich. Durch die Angabe <Kraftfahrzeug> in der
		 * ArrayList haben wir festgelegt, dass wir das Objekt als Kraftfahrzeug betrachten und die zusätzlichen Eigenschaften
		 * wie die Zuladung komplett egal sind. Wenn wir jetzt die Zuladung ausgeben wollten, würden nicht alle Objekte diese
		 * Eigenschaft aufweisen und somit ist diese Aktion nicht möglich
		 */
		
		/*
		for (Kraftfahrzeug kf : al) {
			System.out.println("\t" + kf.getZuladung());
		}*/
		
		
		System.out.println("----------");
		
		/*
		 * Weiteres Beispiel zur Erläuterung der Generizität
		 */
		
		SaveNumber<Integer> i = new SaveNumber<Integer>(new Integer(5));
		SaveNumber<Double> d = new SaveNumber<Double>(new Double(2.4));
		System.out.println(i.getNumber());
		System.out.println(d.getNumber());
	}
	
	/**
	 * Wenn zwei Methoden mit gleichem Namen parallel bestehen, spricht man von ueberladen von Methoden. Dazu
	 * müssen sich aber die Parameter voneinander Unterscheiden. Das kann im Sinne von einer anderen Anzahl oder
	 * anderen Datentypen verstanden werden. Eine alleinige Aenderung des Rückgabetyps ist nicht hinreichend
	 */
	
	public void ueberladen() {
		/* 
		 * fahren mit einem String Parameter
		 */
		System.out.println("PKW: " + this.k1.fahren("Martin"));
		
		/* 
		 * fahren mit zwei String Parametern
		 */
		System.out.println("PKW: " + this.k1.fahren("Sebastian", "Nina"));
	}
	
	/**
	 * Wenn eine Methode aufgerufen wird die sowohl in der Subklasse als auch in der Superklasse 
	 * vorhanden ist, wird erst zur Laufzeit je nach dem momentanen Objekttyp, und nicht nach dem 
	 * statischen Variablentyps, entschieden, welche Methode aufgerufen wird.
	 */
	
	public void laufzeitpolymorphie() {
				
		/* 
		 * Die Metode fahren(String, String) wird von der Klasse PKW aufgerufen
		 */
		System.out.println("PKW: " + this.p1.fahren("Martin", "Stefan"));
		
		Kraftfahrzeug k1 = this.p1;
		
		/* 
		 * Da p1 zwar den dynamischen Typ PKW hat, aber den statischen Typ Kraftfahrzeug hat, wird die Methode
		 * in der Klasse Kraftfahrzeug aufgerufen
		 */
		System.out.println("Kraftfahrzeug: " + this.k1.fahren("Sebastian", "Julia"));
	}
	
	/**
	 * Wenn eine Subklasse in eine Superklasse gecastet wird(Upcast), ist dies ohne weiteres moeglich, da alle notwendigen
	 * Eigenschaften durch die Vererbung gegeben sein muessen. Natürlich sind alle zusaetzlichen Eigenschaften nicht
	 * mehr verfügbar. Wenn eine Superklasse in eine Subklasse gecastet wird(downcast), ist dies nicht ganz so einfach. 
	 * Dazu muss erstens das Objekt eine Instanz von der Subklasse sein, weil sonst Eigenschaften fehlen wuerden und zweitens
	 * eine expliziter Cast angegeben werden.
	 */
	
	public void downUpCast() {
		
		/*
		 * Subklasse in Superklasse casten(upcast)
		 * PKW in Kraftfahrzeug
		 */
		
		
		/*
		 * Alle Eigenschaften die Kraftfahrzeug hat, muss PKW schon mit sich bringen(Vererbung)
		 * Dadurch sind alle nötigen Eigenschaften vorhanden, aber es gibt noch zusätzliche Eigenschaften
		 * von PKW. Bei diesem Cast werden diese zusätlichen Eigenschaften nicht beruecksichtigt
		 */
		Kraftfahrzeug k2 = this.p1;
		/*
		 * Dadurch hat der p1 noch die Methode getBesitzer(), k2 aber nicht
		 */
		this.p1.getBesitzer();
		//k2.getBesitzer();
		
		/*
		 * Die Methode getBaujahr() ist eine Eigenschaft von Kraftfahrzeug und ist dewegen bei beiden vorhanden
		 */
		System.out.println("Baujahr von PKW1: " + this.p1.getBaujahr());
		System.out.println("Baujahr von Kraftfahrzeug2: " + k2.getBaujahr());
		
		/*
		 * Superklasse in Subklasse casten
		 * Kraftfahrzeug in PKW
		 */
		
		/*
		 * Es wird geprüft ob das Kraffahrzeug eine Instanz von PKW ist. In diesem Beispiel ist k1 keine Instanz
		 * von PKW und kann somit auch nicht gecastet werden
		 */
		
		if (this.k1 instanceof PKW) {
			PKW p2 = (PKW) this.k1;
		} else {
			System.err.println("k1 ist keine Instanz von PKW");
		}
		
		/*
		 * In diesem Fall ist k2 eine Instanz von PKW und kann deswegen gecastet werden. Sowohl die Eigenschaft
		 * des Kraftfahrzeugs(getBaujahr()) als auch die Eigenschaft des PKWs(getBesitzer()) ist vorhanden
		 */
		
		PKW p3 = (PKW) k2;
		System.out.println("p3: " + p3.getBaujahr());
		System.out.println("p3: " + p3.getBesitzer());
	}
	
	/**
	 * Bei einem deklarativen Typen handelt es sich um eine Reservierung des Speichers ohne ein Objekt initialisiert zu haben.
	 * Unter dem statischen Typ versteht man, den Datentypen der bei der Variablendeklaration angegeben wird. Dieser wird nicht
	 * erst zur Laufzeit entschieden und kann deswegen vom Compiler ueberprueft werden.
	 * Unter dem dynamischen Typ versteht man, welchen Inhalt die Varibale zur Laufzeit hat
	 */
	
	public void dekDynStaTyp() {
		/*
		 * deklarativer Typ
		 * keine Initialisierung
		 */
		PKW p1;
		
		/*
		 * Statischer Typ
		 * Der Compiler weiß beim Compilieren welches Objekt in p2 geschrieben wird
		 */
		PKW p2 = new PKW(1997, 9999.99, (short) 120, 10.0, "Kritzl Martin");
		
		/*
		 * Dynamischer Typ
		 * Erst zur Laufzeit ist klar welches Objekt in k1 geschrieben wird
		 */
		Kraftfahrzeug k1 = p2;
		
	}
	
	/**Verwendet die Methoden der Klasse Main
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println("Generizität");
		System.out.println("----------");
		m.generizitaet();
		System.out.println("----------");
		System.out.println("Überladen");
		System.out.println("----------");
		m.ueberladen();
		System.out.println("----------");
		System.out.println("Laufzeitpolymorphie");
		System.out.println("----------");
		m.laufzeitpolymorphie();
		System.out.println("----------");
		System.out.println("Down- und Upcast");
		System.out.println("----------");
		m.downUpCast();
	}
}
