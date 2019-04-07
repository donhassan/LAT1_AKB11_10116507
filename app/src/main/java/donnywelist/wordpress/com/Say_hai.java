package donnywelist.wordpress.com;
/*
 * Nim   : 10116507
 * Nama  : Donny Hassan Hasibuan
 * Kelas : AKB-11
 * Tanggal : 06 April 2019
 * */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Say_hai extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String nama;
    TextView hai;
    Button btnOke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        hai = (TextView) findViewById(R.id.hai);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        hai.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+nama+" ngatur waktu :)");

        btnOke = (Button) findViewById(R.id.btnOke);
        btnOke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}
