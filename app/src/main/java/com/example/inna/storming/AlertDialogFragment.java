package com.example.inna.storming;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Inna on 10/28/2018.
 */

public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(R.string.error_title)
        .setMessage(R.string.error_message)
        .setPositiveButton(R.string.error_ok_button_text, null);

        return builder.create();
    }
}
