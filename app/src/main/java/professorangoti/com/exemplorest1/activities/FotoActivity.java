package professorangoti.com.exemplorest1.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import professorangoti.com.exemplorest1.R;

public class FotoActivity extends AppCompatActivity {
ImageView iv
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);
        buscaFoto();
    }
}
