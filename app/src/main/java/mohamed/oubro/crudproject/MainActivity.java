package mohamed.oubro.crudproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void connect(){
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/crudproject";
            connection = DriverManager.getConnection(url, "admin", "");
            System.out.println("You are connected!");
        }
        catch(Exception e){
            System.out.println("Message : "+e);
        }
    }
}