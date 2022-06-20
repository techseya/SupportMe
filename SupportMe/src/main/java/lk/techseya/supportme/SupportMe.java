package lk.techseya.supportme;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

public class SupportMe {
    public static void ClickDialog(Context context,int count,String title,String message,String url){
        SharedPreferences preferences= context.getSharedPreferences("PREFERENCE", MODE_PRIVATE);
        final String static_count=preferences.getString("count", String.valueOf(count));
        String time=preferences.getString("count", String.valueOf(count));



        if (time.equals("0")){
            AlertDialog alertDialog;
            alertDialog = new AlertDialog.Builder(context).create();
            alertDialog.setTitle(title);
            alertDialog.setMessage(message);
            alertDialog.setIcon(R.drawable.bell);
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Sure", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putString("count", "dismiss");
                    editor.apply();
                    try{
                        Uri uri = Uri.parse(url);
                        context.startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }catch (Exception e){
                        Toast.makeText(context, "Url no longer reachable", Toast.LENGTH_SHORT).show();
                    }


                } });
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Later", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putString("count", String.valueOf(5));
                    editor.apply();
                    dialog.dismiss();
                }});
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Never", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.dismiss();
                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putString("count", "dismiss");
                    editor.apply();
                }});
            alertDialog.show();
        }else if (time.equals("dismiss")){
            SharedPreferences.Editor editor=preferences.edit();
            editor.putString("count", "dismiss");
            editor.apply();
        } else{
            int reduced=Integer.parseInt(time)-1;
            SharedPreferences.Editor editor=preferences.edit();
            editor.putString("count", String.valueOf(reduced));
            editor.apply();
        }



    }

    
}
