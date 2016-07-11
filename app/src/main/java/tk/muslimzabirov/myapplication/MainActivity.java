package tk.muslimzabirov.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*link to Lectures page*/
    public void lct(View view) {
        Intent a = new Intent(this, LecturesPage.class);
        startActivity(a);
    }

    /*link to calendar page*/
    public void ctt(View view) {
        Intent b = new Intent(this, CalendarPage.class);
        startActivity(b);
    }

    /*link to timetable page*/
    public void ttb(View view) {
        Intent c = new Intent(this, TimeTablePage.class);
        startActivity(c);
    }

    /*link to Portal page*/
    public void ptl(View view) {
        Intent d = new Intent(this, PortalPage.class);
        startActivity(d);
    }

    /*link to location page*/
    public void lot(View view) {
        Intent e = new Intent(this, Location.class);
        startActivity(e);
    }

    public void drc(View view) {

        String url = "tel:60383178888";
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(url));
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(intent);
    }

    public void mdl(View view) {
        Intent f = new Intent(this, ModulPage.class);
        startActivity(f);
    }

    public void abt(View view) {
        Intent g = new Intent(this, AboutPage.class);
        startActivity(g);
    }


    public void bm(View view) {
        Intent r = new Intent(Intent.ACTION_SEND);
        r.setData(Uri.parse("mailto:"));
        String[] to={"enquiry@limkokwing.edu.my"};
        r.putExtra(Intent.EXTRA_EMAIL, to);
        r.putExtra(Intent.EXTRA_SUBJECT, "Your Massage");
        r.putExtra(Intent.EXTRA_TEXT, "Your Massage");
        r.setType("message/rfc822");
        Intent chooser = Intent.createChooser(r, "Send Email");
        startActivity(chooser);

    }

    public void ctc(View view) {
        Intent c = new Intent(this, ConatctPage.class);
        startActivity(c);
    }
    


}
