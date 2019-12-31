import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		String s = "";
		String aux[];
		String name = "";
		String phone;
		try (Scanner reader = new Scanner(new File("phonedata.txt"))) {

			while (reader.hasNextLine()) {
				s = reader.nextLine();
				aux = s.split(" ");

				if (aux.length > 2) {
					for (int i = 0; i < aux.length - 1; i++) {
						name += aux[i] + " ";
					}
					phone = aux[aux.length - 1];
				} else {
					name = aux[0];
					phone = aux[1];

				}
				System.out.println("Nome: " + name + "\nPhone: " + phone);

			}
		}

	}

}
