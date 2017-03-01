package commmadondo.github.favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button call_con1, call_con2, call_con3, sms_con1, sms_con2, sms_con3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtonClickEvents();
    }

private void setupButtonClickEvents(){
    call_con1 = (Button) findViewById(R.id.button1Call);
    sms_con1 =  (Button) findViewById(R.id.button1sms);

    call_con2 = (Button) findViewById(R.id.button2Call);
    sms_con2 =  (Button) findViewById(R.id.button2sms);

    call_con3 = (Button) findViewById(R.id.button3Call);
    sms_con3 =  (Button) findViewById(R.id.button3sms);

    /*
    * Call contact 1
     */
    call_con1.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
            phoneIntent.setData(Uri.parse("tel:" + "(218)9405512"));
            if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(phoneIntent);
        }
        }
    });
/*
*
*Send a sms to contact 1
 */
    sms_con1.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms: 2189405512"));
            sendIntent.putExtra("sms_body", "Hi! How's it going?");
            startActivity(sendIntent);
        }
    });
    //====================================================================================-
        /*
    * Call contact 2
     */
    call_con2.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
            phoneIntent.setData(Uri.parse("tel:" + "+26377306931"));
            if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(phoneIntent);
            }
        }
    });
/*
*
*Send a sms to contact 2
 */
    sms_con2.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms: +26377306931"));
            sendIntent.putExtra("sms_body", "Hi! How's it going?");
            startActivity(sendIntent);
        }
    });
    //====================================================================================-
        /*
    * Call contact 3
     */
    call_con3.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
            phoneIntent.setData(Uri.parse("tel:" + "+263775716382"));
            if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(phoneIntent);
            }
        }
    });
/*
*
*Send a sms to contact 3
 */
    sms_con3.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms: +263775716382"));
            sendIntent.putExtra("sms_body", "Hi! How's it going?");
            startActivity(sendIntent);
        }
    });
    //====================================================================================-
}

}
