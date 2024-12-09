package org.ies.building.components;

import org.ies.building.model.Edificio;
import org.ies.building.model.Apartamento;

import java.util.Scanner;

    public class EdificioReader {
        private final Scanner scanner;
        private final ApartamentoReader apartamentoReader;

        public EdificioReader(Scanner scanner, ApartamentoReader apartamentoReader) {
            this.scanner = scanner;
            this.apartamentoReader = apartamentoReader;
        }

        public Edificio read() {
            System.out.println("Introduce los datos del edificio");

            System.out.println("Direccion: ");
            String direccion = scanner.nextLine();

            System.out.println("Municipio: ");
            String municipio = scanner.nextLine();

            Apartamento apartamento = apartamentoReader.read();

            return new Edificio(
                    direccion,
                    municipio,
                    apartamento
            );
        }
    }