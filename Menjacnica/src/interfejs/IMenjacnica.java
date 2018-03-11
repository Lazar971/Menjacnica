package interfejs;

import java.util.GregorianCalendar;

import valuta.Kurs;
import valuta.Valuta;

public interface IMenjacnica {
	public void dodajKurs(Valuta v,Kurs k);
	public void obrisiKurs(Valuta v,GregorianCalendar dan);
	public Kurs pronadjiKurs(Valuta v,GregorianCalendar dan);
}
