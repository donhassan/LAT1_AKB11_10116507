package donnywelist.wordpress.com;
/*
 * Nim   : 10116507
 * Nama  : Donny Hassan Hasibuan
 * Kelas : AKB-11
 * Tanggal : 06 April 2019
 * */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login_Code extends AppCompatActivity {
    Button btnKeBio;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
        btnKeBio = (Button) findViewById(R.id.masuk);
        btnKeBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_Code.this, Biodata.class);
                startActivity(i);
            }
        });
    }
}
