package ru.samsung.itschool.dbgame;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StatActivity extends Activity {
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        dbManager = DBManager.getInstance(this);
        TextView count = (TextView)this.findViewById(R.id.sum);
        count.setText(Integer.toString(dbManager.gamesCount()));

    }
}
