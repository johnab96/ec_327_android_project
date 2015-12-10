package ec327_final_project.my_grades;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.AdapterView.*;

public class choose_gpa_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_gpa_activity);

        String[] gpa_activities = {"Enter Courses", "Display GPAs", "Enter Scores"};

        /*
         List Adapter bridges choose_gpa_activity and  each ListItem
         List adapter fills ListView
         simple_list_item_1 is a default layout
         we can make our own and put it in its place
          */


        final ListAdapter main_activity_adapter= new ArrayAdapter<String>(this,R.layout.main_row_layout,R.id.main_custom_layout,
                gpa_activities);

        ListView main_activities_ListView = (ListView) findViewById(R.id.choose_activity_ListView);

        main_activities_ListView.setAdapter(main_activity_adapter);


        /*
        Responds to clicks on home screen.
        Toast.makeText displays what is show
        String.value of is the string being printed out
        length.short means show for a short period of time

        Be careful changing things in setOnItemClickListner. It controls the changing of screens.
         */
        main_activities_ListView.setOnItemClickListener(new OnItemClickListener() {
                                                            @Override
                                                            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                                                                String gpa_function_picked = "Selected " +
                                                                        String.valueOf(adapterView.getItemAtPosition(position));
                                                                Toast.makeText(choose_gpa_activity.this,gpa_function_picked,Toast.LENGTH_SHORT).show();

                                                                if ((String.valueOf(adapterView.getItemAtPosition(position)).equals("Enter Courses")))
                                                                {
                                                                    Intent change_to_course_input_intent = new Intent(view.getContext(),input_course_information.class);
                                                                    startActivity(change_to_course_input_intent);
                                                                }

                                                                else if((String.valueOf(adapterView.getItemAtPosition(position)).equals("Display GPAs")))
                                                                {
                                                                    Intent change_to_gpa_display_intent = new Intent(view.getContext(),gpa_information_display.class);
                                                                    startActivity(change_to_gpa_display_intent);
                                                                }

                                                                else if((String.valueOf(adapterView.getItemAtPosition(position)).equals("Enter Scores")))
                                                                {
                                                                    Intent change_to_grade_input_display_intent = new Intent(view.getContext(),grade_information_input.class);
                                                                    startActivity(change_to_grade_input_display_intent);
                                                                }

                                                            }
                                                        });


                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        Note the below button is the message icon button
         */


    }

    /*
    onCreateOptionsMenu is self-explanatory, it creates the menu inside application.
    Nothing changed or needed to be changed, just refrences main
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_gpa_activity, menu);
        return true;
    }


    /*
    onOptionsItemSelected- what happens when something is clicked on
    action_settings- opens up dialog boxes/close app etc.

    for ex. if id== main_exit_option will exit the app

    Note: Fragment is an interface block that can be placed around, in etc. of an activty
        - need fragment mananger to interact with fragment i.e. Dialog fragment
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            DialogFragment main_dialog_fragment = new popup_dialog_fragment();

            main_dialog_fragment.show(getFragmentManager(), "dialog");

            return true;

        } else if (id == R.id.main_exit_option){
            finish();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }}













