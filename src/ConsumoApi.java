import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    //Se agrego el Trhow para la excepcion y se llama a RECORDAPI
public RecordApi moneda(String base,String cambio,double monto) throws IOException, InterruptedException {
//    URI direccion=URI.create("https://v6.exchangerate-api.com/v6/" + "93d956446f51a32c31c1914f/latest/USD"); //Moneda base DLR (cambiarlo si se desea.)

    URI direccion=URI.create("https://v6.exchangerate-api.com/v6/" + "93d956446f51a32c31c1914f/pair/" + base +"/" + cambio+"/"+ monto);

    /*Va a recibir un String, con el cual el usuario pondra la moneda base, a la moneda de cambio que desea efectuar. */

    /* ************ Estructurando el JAR Gson *******************  */


    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
             return new Gson().fromJson(response.body(),RecordApi.class);

             /* Devolvera un GSON desde el JSON (con RespondeBody) y lo convertira al formato de la clase/ Record (RecordApi)*/

    /* HACER EL OVERRIDE DEL HASH MONEDA */



        }
}
