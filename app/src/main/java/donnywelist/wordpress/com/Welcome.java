package donnywelist.wordpress.com;

/*
 * NIM   : 10116507
 * NAMA  : Donny Hassan Hasibuan
 * KELAS : AKB-11
 * */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import donnywelist.wordpress.com.R;

public class Welcome extends AppCompatActivity {
    Button btnStart;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnStart = (Button) findViewById(R.id.btnMulai);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Welcome.this, Login_Code.class);
                startActivity(i);
            }
        });
    }
}
