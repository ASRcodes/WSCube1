package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.wscubeprojs.databinding.ActivityImplicitIntentBinding;

public class implicitIntent extends AppCompatActivity {
ActivityImplicitIntentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImplicitIntentBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idial = new Intent(Intent.ACTION_DIAL);
//                now for by default number to be sent
                idial.setData(Uri.parse("tel:+919162758437"));

                startActivity(idial);
            }
        });
        binding.msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imsg = new Intent(Intent.ACTION_SENDTO);
//                by default number and message
                imsg.setData(Uri.parse("smsto:+919162758437"));
                imsg.putExtra("sms body","Hello bhai maza aaa raha hai na rahde radhe!!!");
                startActivity(imsg);
            }
        });
        binding.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iEmail = new Intent(Intent.ACTION_SEND);
//                type is used to diff bet^n email and normal message
                iEmail.setType("message/rfc822");
//                used array to deliver the email to multiple acc in future
                iEmail.putExtra(Intent.EXTRA_EMAIL,new String[]{"rajsinghrajput7002@gmail.com"});
                iEmail.putExtra(Intent.EXTRA_SUBJECT,("Heheheheh"));
                iEmail.putExtra(Intent.EXTRA_TEXT,("this app is amazing"));
//                chooser is used so that user can have option to use the apps to send email
                startActivity(Intent.createChooser(iEmail,"Email via"));
            }
        });
        binding.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iShare = new Intent(Intent.ACTION_SEND);
                iShare.setType("text/plain");
                iShare.putExtra(Intent.EXTRA_TEXT,"watch this vdo : https://youtu.be/PSuKYLfHygs?si=miACvgZVXbmtrDdH");
                startActivity(Intent.createChooser(iShare,"Send via"));
            }
        });
    }
}