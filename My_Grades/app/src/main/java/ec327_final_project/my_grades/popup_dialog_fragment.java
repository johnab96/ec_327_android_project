package ec327_final_project.my_grades;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Jack on 12/8/2015.
 */

/*
To create Dialog double click DialogFragment, click overwrite methods, click onCreateDialog

To build dialog box, use AlertDialog.Builder, getActivity get activity fragment is working with

To sense a click main... . setPostitiveButton ... actions to be taken are in onClickListner
body
 */

public class popup_dialog_fragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder main_popup_dialog_1 = new AlertDialog.Builder(
                getActivity());
        main_popup_dialog_1.setTitle("Sample Dialog");
        main_popup_dialog_1.setMessage("Sample Dialog 1");
        main_popup_dialog_1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked Ok", Toast.LENGTH_SHORT).show();
            }
        });
        main_popup_dialog_1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked Cancel", Toast.LENGTH_SHORT).show();
            }
        });

        return super.onCreateDialog(savedInstanceState);
    }
}
