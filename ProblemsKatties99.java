
import java.util.Scanner;
import java.util.Arrays;

public class ProblemsKatties99 {

	public static void main(String[] args) {
		int lastDigit = 10000;
		
		

		if (lastDigit <= 99) {
			System.out.println("99");

		} else {

			String fullNumber = String.valueOf(lastDigit);
			
			// System.out.println(fullNumber.substring(fullNumber.length() - 2));

			// Dopo svariati calcole sulle posizioni delle cifre sono arrivato a concludere
			// che il modo migliore di aggirare sto es sia quello di sfruttare un bug di
			// java:

			// con 5 cifre fullNumber.lenght = 5 pertanto
			// fullNumber.substring(fullNumber.length()-2)= substringa dalla posizone
			// 5-2=3 alla fine, ovvero ultime 2 cifre, la stringa creata da valueOf parte da
			// 0. Si noti che -2 non è
			// un magic number ma il numero che ci pemette di ottenere sempre le ultime 2
			// cifre senza problei(quando le cifre sono da 2 a 5)
			// per ora la casisca da 0 a 9(con una cifra) si lascia per il futuro, al
			// massimo è un if

			// System.out.println(fullNumber.substring(fullNumber.length() - 2));

			int[] finalBig = new int[10000];

			// System.out.println(finalBig.length);
			int notEmpty = 1;

			// rimpimento da finalBig[0] = 1 .... finalBig[9999] = 10000
			for (int i = 1; i <= finalBig.length; i++) {
				finalBig[i - 1] = notEmpty;
				notEmpty++;
			}
			//System.out.println(finalBig[9998]);
			//System.out.println(finalBig.length);

			int valueFindMax = 0;
			int valueFindMin = 0;
			int fakeDistanceMin = 0;
			int fakeDistanceMax = 0;

			for (int j = (lastDigit - 1); j >= 9; j--) {

				String NumberIsChecking = String.valueOf(finalBig[j]);
				// int valueFind;
				// System.out.println(finalBig[j]);
				// String iWantU = "99";
				// System.out.println((NumberIsChecking.substring(NumberIsChecking.length()
				// -2)));

				if ((NumberIsChecking.substring(NumberIsChecking.length() - 2)).equals("99")) {
					valueFindMax = finalBig[j];
					fakeDistanceMin = (lastDigit - finalBig[j]);
					// System.out.println(valueFindMax);
					// System.out.println(fakeDistanceMin);
					// quando si trova il valore valueFind vogliamo farmi ridare le iterazioni che
					// il ciclo ha fatto
					// ovvero la distanza fakeDistance
					// int takeMeOut = fakeDistanceMin;
					break;

				} else {

				}

			}

			for (int j = (lastDigit - 1); j < finalBig.length; j++) {

				String NumberIsChecking = String.valueOf(finalBig[j]);
				// int valueFind;
				// System.out.println(finalBig[j]);
				// String iWantU = "99";
				// System.out.println((NumberIsChecking.substring(NumberIsChecking.length()
				// -2)));

				if ((NumberIsChecking.substring(NumberIsChecking.length() - 2)).equals("99")) {
					valueFindMin = finalBig[j];
					fakeDistanceMax = j - (lastDigit - 1);
					// System.out.println(valueFindMin);
					// quando si trova il valore valueFind vogliamo farmi ridare le iterazioni che
					// il ciclo ha fatto
					// ovvero la distanza fakeDistance
					// System.out.println(fakeDistanceMax);
					break;

				} else {

				}
			}

			if (fakeDistanceMax > fakeDistanceMin) {
				System.out.println(valueFindMax);
			} else if (fakeDistanceMax < fakeDistanceMin) {
				System.out.println(valueFindMin);
			} else if (fakeDistanceMax == fakeDistanceMin) {
				System.out.println(valueFindMin);

			}

			// System.out.println(finalBig[9999]);
			// if (toCompare > 0 && toCompare <= 99) {

			// } else {
		}
	}

}
