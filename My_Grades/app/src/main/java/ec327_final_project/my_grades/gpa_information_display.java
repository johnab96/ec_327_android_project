package ec327_final_project.my_grades;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class gpa_information_display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_information_display);

        String[] gpa_display_options = {"Overall GPA", "Major GPA", "Estimated Overall GPA",
                "Estimated Major GPA"};

        final ListAdapter gpa_display_options_adapter = new ArrayAdapter<String>(this,R.layout.display_gpa_functions_layout,R.id.display_gpa_totals_text_view);


        ListView gpa_display_options_ListView = (ListView) findViewById(R.id.gpa_information_list_view);

        gpa_display_options_ListView.setAdapter(gpa_display_options_adapter);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        
    }

}
