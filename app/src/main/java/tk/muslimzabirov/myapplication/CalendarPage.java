package tk.muslimzabirov.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarPage extends AppCompatActivity {

    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);

        calendar = (CalendarView)findViewById(R.id.calendar);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,int dayOfMonth ){
                Toast.makeText(getApplicationContext(),dayOfMonth + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            }

        });


    }
}
