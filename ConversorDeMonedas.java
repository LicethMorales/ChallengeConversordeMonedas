import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorDeMonedas {

    public static void main(String[] args) throws IOException, InterruptedException {


        String menu = """
                **********************************************************
                Sea bienvenido/a al Conversor de Moneda
                
                1. Dólar =>> Peso Argentino
                2. Peso Argentino =>> Dólar
                3. Dólar =>> Real Brasileño
                4. Real Brasileño =>> Dólar
                5. Dólar =>> Peso Colombiano
                6. Peso Colombiano =>> Dólar
                7. Salir
                
                Escoja una opción válida:
                **********************************************************""";


        int iniciador = 0;

        while (iniciador == 0) {

            System.out.println(menu);

            Scanner leer = new Scanner(System.in);
            try{
                int opcion = leer.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("Ingresa el valor que deseas convertir: ");
                        var cantidadAconvertir = leer.nextDouble();
                        HttpClient client1 = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/pair/USD/ARS"))
                                .build();

                        HttpResponse<String> response = client1
                                .send(request, HttpResponse.BodyHandlers.ofString());

                        String json = response.body();

                        Gson gson = new Gson();
                        MonedaApi miMonedaApi = gson.fromJson(json, MonedaApi.class);
                        Moneda miMoneda = new Moneda(miMonedaApi);
                        System.out.println("El valor " + cantidadAconvertir + " [USD] corresponde al valor final de =>>> " + miMoneda.getValor() * cantidadAconvertir + " [ARS]");
                        break;

                    case 2:

                        System.out.println("Ingresa el valor que deseas convertir: ");
                        var cantidadAconvertir2 = leer.nextDouble();
                        HttpClient client2 = HttpClient.newHttpClient();
                        HttpRequest request2 = HttpRequest.newBuilder()
                                .uri(URI.create("https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/pair/ARS/USD"))
                                .build();

                        HttpResponse<String> response2 = client2
                                .send(request2, HttpResponse.BodyHandlers.ofString());

                        String json2 = response2.body();

                        Gson gson2 = new Gson();
                        MonedaApi miMonedaApi2 = gson2.fromJson(json2, MonedaApi.class);
                        Moneda miMoneda2 = new Moneda(miMonedaApi2);
                        System.out.println("El valor " + cantidadAconvertir2 + " [ARS] corresponde al valor final de =>>> " + miMoneda2.getValor() * cantidadAconvertir2 + " [USD]");
                        break;

                    case 3:

                        System.out.println("Ingresa el valor que deseas convertir: ");
                        var cantidadAconvertir3 = leer.nextDouble();
                        HttpClient client3 = HttpClient.newHttpClient();
                        HttpRequest request3 = HttpRequest.newBuilder()
                                .uri(URI.create("https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/pair/USD/BRL"))
                                .build();

                        HttpResponse<String> response3 = client3
                                .send(request3, HttpResponse.BodyHandlers.ofString());

                        String json3 = response3.body();

                        Gson gson3 = new Gson();
                        MonedaApi miMonedaApi3 = gson3.fromJson(json3, MonedaApi.class);
                        Moneda miMoneda3 = new Moneda(miMonedaApi3);
                        System.out.println("El valor " + cantidadAconvertir3 + " [USD] corresponde al valor final de =>>> " + miMoneda3.getValor() * cantidadAconvertir3 + " [BRL]");
                        break;

                    case 4:

                        System.out.println("Ingresa el valor que deseas convertir: ");
                        var cantidadAconvertir4 = leer.nextDouble();
                        HttpClient client4 = HttpClient.newHttpClient();
                        HttpRequest request4 = HttpRequest.newBuilder()
                                .uri(URI.create("https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/pair/BRL/USD"))
                                .build();

                        HttpResponse<String> response4 = client4
                                .send(request4, HttpResponse.BodyHandlers.ofString());

                        String json4 = response4.body();

                        Gson gson4 = new Gson();
                        MonedaApi miMonedaApi4 = gson4.fromJson(json4, MonedaApi.class);
                        Moneda miMoneda4 = new Moneda(miMonedaApi4);
                        System.out.println("El valor " + cantidadAconvertir4 + " [BRL] corresponde al valor final de =>>> " + miMoneda4.getValor() * cantidadAconvertir4 + " [USD]");
                        break;

                    case 5:

                        System.out.println("Ingresa el valor que deseas convertir: ");
                        var cantidadAconvertir5 = leer.nextDouble();
                        HttpClient client5 = HttpClient.newHttpClient();
                        HttpRequest request5 = HttpRequest.newBuilder()
                                .uri(URI.create("https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/pair/USD/COP"))
                                .build();

                        HttpResponse<String> response5 = client5
                                .send(request5, HttpResponse.BodyHandlers.ofString());

                        String json5 = response5.body();

                        Gson gson5 = new Gson();
                        MonedaApi miMonedaApi5 = gson5.fromJson(json5, MonedaApi.class);
                        Moneda miMoneda5 = new Moneda(miMonedaApi5);
                        System.out.println("El valor " + cantidadAconvertir5 + " [USD] corresponde al valor final de =>>> " + miMoneda5.getValor() * cantidadAconvertir5 + " [COP]");
                        break;

                    case 6:

                        System.out.println("Ingresa el valor que deseas convertir: ");
                        var cantidadAconvertir6 = leer.nextDouble();
                        HttpClient client6 = HttpClient.newHttpClient();
                        HttpRequest request6 = HttpRequest.newBuilder()
                                .uri(URI.create("https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/pair/COP/USD"))
                                .build();

                        HttpResponse<String> response6 = client6
                                .send(request6, HttpResponse.BodyHandlers.ofString());

                        String json6 = response6.body();

                        Gson gson6 = new Gson();
                        MonedaApi miMonedaApi6 = gson6.fromJson(json6, MonedaApi.class);
                        Moneda miMoneda6 = new Moneda(miMonedaApi6);
                        System.out.println("El valor " + cantidadAconvertir6 + " [COP] corresponde al valor final de =>>> " + miMoneda6.getValor() * cantidadAconvertir6 + " [USD]");
                        break;

                    case 7:
                        System.out.println("Ha salido del programa");
                        iniciador+= 1;
                        break;

                    default:
                        System.out.println("Opción inválida");


                }

            } catch(InputMismatchException e){
                System.out.println("Ocurrió un error, solo debe seleccionar números");
                System.out.println(e.toString());
            }
        }

    }


}



//String url_str = "https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/latest/USD";
//https://v6.exchangerate-api.com/v6/2a0d4e2f54737c767b88f864/pair/USD/COP;
//Moneda.convierte("USD/ARS");