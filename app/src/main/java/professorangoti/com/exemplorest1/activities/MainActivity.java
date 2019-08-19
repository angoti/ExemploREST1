package professorangoti.com.exemplorest1.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import professorangoti.com.exemplorest1.R;
import professorangoti.com.exemplorest1.dominio.User;
import professorangoti.com.exemplorest1.services.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView campo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo = findViewById(R.id.viewJSON);
        buscaDados();
    }

    private void buscaDados() {
        RetrofitService.getServico().obterUsuarios().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> lista = response.body();
                for (User user : lista) {
                    campo.append("\nNome: " + user.getName() +
                            "\nid: " + user.getId() +
                            "\nusername: " + user.getUsername() +
                            "\nemail: " + user.getEmail() +
                            "\nEndereço: " + user.getAddress().getStreet() + ", " + user.getAddress().getCity() +
                            ", zipcode: " + user.getAddress().getZipcode() +
                            "\nphone: " + user.getPhone() +
                            "\nwebsite: " + user.getWebsite() + "\n");
                }
            }
            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {       }
        });
    }

}
