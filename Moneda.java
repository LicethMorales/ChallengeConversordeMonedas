import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.lang.Double.parseDouble;

public class Moneda {

    private String nombre;
    //@SerializedName("base_code")
    private String codigo;
    //@SerializedName("conversion_rate")
    private double valor;


    public Moneda(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;

    }

    public Moneda(MonedaApi miMonedaApi) {

        this.codigo = miMonedaApi.base_code();
        this.valor = Double.parseDouble(miMonedaApi.conversion_rate());
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "codigo='" + codigo + '\'' +
                ", valor=" + valor;
    }
}
