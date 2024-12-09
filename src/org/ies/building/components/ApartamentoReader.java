package org.ies.building.components;

import org.ies.building.model.Apartamento;
import org.ies.building.model.Propietario;

import java.util.Scanner;

public class ApartamentoReader {
    private final Scanner scanner;
    private final PropietarioReader propietarioReader;

    public ApartamentoReader(Scanner scanner, PropietarioReader propietarioReader) {
        this.scanner = scanner;
        this.propietarioReader = propietarioReader;
    }

    public Apartamento read() {
        System.out.println("Introduce los datos del apartamento");

        System.out.println("Planta: ");
        String planta = scanner.nextLine();

        System.out.println("Puerta: ");
        String puerta = scanner.nextLine();

        Propietario propietario = propietarioReader.read();

        return new Apartamento(
                planta,
                puerta,
                propietario
        );
    }
}
