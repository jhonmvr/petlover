import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TinderPetLover {
	static Integer totalMascotas = 0;

	public static void main(String[] args) {
		int x = 10;
		Scanner leer = new Scanner(System.in);
		while (x != 0) {
			System.out.println("Bienvenido a Tinder Pet Match");
			System.out.println("Tinder para mascotas");
			System.out.println("MENU:");

			System.out.println("1.- Registro");
			System.out.println("2.- Ver lista de mascotas");
			System.out.println("3.- Match");
			System.out.println("0.- Salir");
			x = leer.nextInt();
			switch (x) {
			case 1: {
				registro();
				break;

			}
			case 2: {

				System.out.println("Usted eligió la opcion 2.");

				break;

			}
			case 3: {

				System.out.println("Usted eligió la opcion 3.");

				break;

			}
			default: {
				System.out.println("Opcion incorrecta");

			}

			}

		}

		// TODO Auto-generated method stub

	}

	static void registro() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa los datos de tu mascota");
		Mascota mascota = new Mascota();

		System.out.println("Edad:");
		mascota.setEdad(leer.nextInt());
		mascota.setEstadoMatch(true);
		mascota.setId(totalMascotas + 1);
		System.out.println("Nombre:");
		mascota.setNombre(leer.next());
		System.out.println("Observacion:");
		mascota.setObservacion(leer.next());
		System.out.println("Registrar propietario");
		mascota.setPropietario(registrarPropietario());
		System.out.println("Raza:");
		mascota.setRaza(leer.next());
		System.out.println("Tipo:");
		mascota.setTipo(leer.next());

		guardarMascota(mascota);

	}

	static void guardarMascota(Mascota mascota) {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("C:\\WORKSPACE\\CHANDRESH\\TINDER_PET_LOVER\\Mascota.txt"));
			System.out.print(mascota.toString());
			outputStream.writeObject(mascota);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
            //Close the ObjectOutputStream
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

	}

	static Persona registrarPropietario() {

		return null;

	}

	Persona buscarPropietario() {
		return null;
	}

}
