package org.ies.building.components;

import org.ies.building.model.Propietario;

import java.util.Scanner;

public class PropietarioReader {
    private final Scanner scanner;

    public PropietarioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Propietario read() {
        System.out.println("Introduce los datos del propietario: ");

        System.out.println("NIF: ");
        String nif = scanner.nextLine();

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();

        return new Propietario(
                nif,
                nombre,
                apellido
        );
    }
}
