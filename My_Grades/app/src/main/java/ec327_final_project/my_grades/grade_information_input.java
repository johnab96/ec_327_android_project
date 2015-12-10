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

public class grade_information_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_information_input);

        String[] grade_input_information = {"Points Earned", "Total Points"};

        final ListAdapter grade_input_adapter = new ArrayAdapter<String>(this,R.layout.grade_information_input_layout,
                R.id.grade_information_input_text_view);
        ListView grade_information_input_ListView = (ListView) findViewById(R.id.grade_information_input_list_view);

        grade_information_input_ListView.setAdapter(grade_input_adapter);
    }

}
