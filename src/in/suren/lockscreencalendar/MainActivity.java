package in.suren.lockscreencalendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CalendarView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Main).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                View optionsBar = (View) findViewById(R.id.OptionsBar);
                if (optionsBar.getVisibility() != View.VISIBLE) {
                    optionsBar.setVisibility(View.VISIBLE);
                }
            }
        });

        findViewById(R.id.btn_preview).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                findViewById(R.id.OptionsBar).setVisibility(View.INVISIBLE);
            }
        });
        
        CalendarView calendarView = (CalendarView) findViewById(R.id.Calendar);
        calendarView.setMaxDate(1370016000000L);
        calendarView.setMinDate(1367337600000L);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
