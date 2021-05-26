package com.example.alertdialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ThreeButtonFragment extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String button1String = "Choice - swimming";
        String button2String = "Choice - something  extreme";
        String button3String = "Choice - just lying";

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Question")
                .setMessage("What is your favourite activity?")
                .setCancelable(true)
                .setPositiveButton("swimming",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Toast.makeText(getActivity(), "swimming", Toast.LENGTH_SHORT)
                                        .show();
                                dialog.cancel();
                            }
                        })
                .setNeutralButton("something extreme",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Toast.makeText(getActivity(), "something extreme", Toast.LENGTH_SHORT)
                                        .show();
                                dialog.cancel();
                            }
                        })
                .setNegativeButton("just lying",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Toast.makeText(getActivity(), "just lying", Toast.LENGTH_SHORT)
                                        .show();
                                dialog.cancel();
                            }
                        });
        return builder.create();
    }
}
