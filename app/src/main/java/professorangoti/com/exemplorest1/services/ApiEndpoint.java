package professorangoti.com.exemplorest1.services;

import java.util.List;

import professorangoti.com.exemplorest1.dominio.Foto;
import professorangoti.com.exemplorest1.dominio.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiEndpoint {

    @GET("users")
    Call<List<User>> obterUsuarios();

    @GET("photos/{id}")
    Call<Foto> obterFoto(@Path("id") int id);

}
