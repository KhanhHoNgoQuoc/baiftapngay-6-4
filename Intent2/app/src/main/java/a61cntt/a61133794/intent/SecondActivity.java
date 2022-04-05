package a61cntt.a61133794.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button iLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        iLogin= (Button) findViewById(R.id.iLogin);
        iLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText tk = (EditText) findViewById(R.id.edtusername);
                EditText mk = (EditText) findViewById(R.id.edtpass);
                EditText ml = (EditText) findViewById(R.id.edtemail);
                String user = "khanhho";
                String pass = "123";
                String mail = "";
                String t = tk.getText().toString();
                String m = mk.getText().toString();
                String e = ml.getText().toString();
                if ((t.equals(user)) && (m.equals(pass)) && (e.equals(mail)==false)){
                    Toast.makeText(SecondActivity.this, "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    Intent Home = new Intent(SecondActivity.this, ThirdActivity.class);
                    Home.putExtra("ten", t);
                    startActivity(Home);
                }
                else {
                    Toast.makeText(SecondActivity.this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}