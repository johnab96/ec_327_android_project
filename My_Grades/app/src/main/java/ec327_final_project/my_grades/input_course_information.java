package ec327_final_project.my_grades;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class input_course_information extends AppCompatActivity {

    /* about done with saving course information, but feel to change if you figure anything out */


    private String file = "ec_327_save_data";
    static  int course_count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_course_information);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /*
    in send_course_info we are taking data from the user input and storing it on the device memory.

    for delete button check vid. 17 5:27
     */

    public void send_course_info(View view) {

        /* Information is Saved for later date
           also maybe put an id front of save file so it can be found an erased
         */

        EditText course_name = (EditText)findViewById(R.id.course_name_input);
        EditText credit_hours = (EditText)findViewById(R.id.course_hours_input);

        String course_name_str = course_name.getText().toString();
        String credit_hours_str = credit_hours.getText().toString();
        String is_major = "Yes";
        String not_major = "No";

        try {
            FileOutputStream out_stream = openFileOutput(file, Context.MODE_PRIVATE);
            out_stream.write(String.valueOf(course_count).getBytes());
            out_stream.write(course_name_str.getBytes());
            out_stream.write(credit_hours_str.getBytes());

            if (findViewById(R.id.major_course_check_box).isPressed()) {
                out_stream.write(is_major.getBytes());
            } else {
                out_stream.write(not_major.getBytes());
            }

            out_stream.close();
            Toast.makeText(getBaseContext(),"File Saved",Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView grid_course_name;
        TextView grid_course_weight;
        TextView grid_is_major;


        switch (course_count)
        {
            case 1:
                grid_course_name = (TextView)findViewById(R.id.r1_c1);
                grid_course_weight = (TextView)findViewById(R.id.r1_c2);
                grid_is_major = (TextView)findViewById(R.id.r1_c3);
                grid_course_name.setText(course_name_str);
                grid_course_weight.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major.setText(is_major);
                } else {
                    grid_is_major.setText(not_major);
                }
            case 2:
                grid_course_name = (TextView)findViewById(R.id.r2_c1);
                grid_course_weight = (TextView)findViewById(R.id.r2_c2);
                grid_is_major = (TextView)findViewById(R.id.r2_c3);
                grid_course_name.setText(course_name_str);
                grid_course_weight.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major.setText(is_major);
                } else {
                    grid_is_major.setText(not_major);
                }

            case 3:
                grid_course_name = (TextView)findViewById(R.id.r3_c1);
                grid_course_weight = (TextView)findViewById(R.id.r3_c2);
                grid_is_major = (TextView)findViewById(R.id.r3_c3);
                grid_course_name.setText(course_name_str);
                grid_course_weight.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major.setText(is_major);
                } else {
                    grid_is_major.setText(not_major);
                }

            case 4:
                grid_course_name = (TextView)findViewById(R.id.r4_c1);
                grid_course_weight = (TextView)findViewById(R.id.r4_c2);
                grid_is_major = (TextView)findViewById(R.id.r4_c3);
                grid_course_name.setText(course_name_str);
                grid_course_weight.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major.setText(is_major);
                } else {
                    grid_is_major.setText(not_major);
                }

            case 5:
                grid_course_name = (TextView)findViewById(R.id.r5_c1);
                grid_course_weight = (TextView)findViewById(R.id.r5_c2);
                grid_is_major = (TextView)findViewById(R.id.r5_c3);
                grid_course_name.setText(course_name_str);
                grid_course_weight.setText(credit_hours_str);
                if (findViewById(R.id.major_course_check_box).isPressed()) {
                    grid_is_major.setText(is_major);
                } else {
                    grid_is_major.setText(not_major);
                }
        }

        course_count++;
    }

}


