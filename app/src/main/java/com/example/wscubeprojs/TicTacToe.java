package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.wscubeprojs.databinding.ActivityTicTacToeBinding;

public class TicTacToe extends AppCompatActivity {
    ActivityTicTacToeBinding binding;
    int flag = 0;
    int count = 0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityTicTacToeBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new_Game();
                binding.textReset.setText("");
            }
        });

    }

    public void check(View view) {
//        before checking the condition we'll first take the view that user is clicking on which button
        Button btnCurrent = (Button) view;
//        on every time button is clicked we'll ++ the count
        count++;
//        Will check the condition that button is empty or not if it's only then only this will work
        if (btnCurrent.getText().toString().equals("")){
//            here we are implementing the logic
            if (flag==0){
                btnCurrent.setText("X");
                flag=1;
            }
            else {
                btnCurrent.setText("O");
                flag=0;
            }

//            Now we'll get the text of the button in Strings and check the winning condition
            if (count>4){

                b1  = binding.btn1.getText().toString();
                b2  = binding.btn2.getText().toString();
                b3  = binding.btn3.getText().toString();
                b4  = binding.btn4.getText().toString();
                b5  = binding.btn5.getText().toString();
                b6  = binding.btn6.getText().toString();
                b7  = binding.btn7.getText().toString();
                b8  = binding.btn8.getText().toString();
                b9  = binding.btn9.getText().toString();

//                Now we'll declare winner when the vertical,horizontal or diagonal have the same text
//                Checking for horizontal and with that we'll check that the button should not be empty
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b4, Toast.LENGTH_SHORT).show();
                }
                else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b7, Toast.LENGTH_SHORT).show();
                }
//                Checking for vertical
                else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                }
                else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b2, Toast.LENGTH_SHORT).show();
                }
                else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
                }
//                Checking for Diagonal
                else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b1, Toast.LENGTH_SHORT).show();
                }
                else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    binding.textReset.setText("Tap here to reset");
                    Toast.makeText(this, "Winner is "+b3, Toast.LENGTH_SHORT).show();
                }
//                Condition when game is draw
                else if (!b1.equals("") && !b2.equals("") && !b3.equals("")
                && !b4.equals("") && !b5.equals("") && !b6.equals("")
                && !b7.equals("") && !b8.equals("") && !b9.equals("")) {
                    binding.textReset.setText("Tap here to reset");
//                    When non of the button is null but all the buttons are clicked once then its a draw
                    Toast.makeText(this, "Game Draw", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }
//    Method to restart the game
    public void new_Game(){
//        we'll empty all the button and 0 the flag and count
        binding.btn1.setText("");
        binding.btn2.setText("");
        binding.btn3.setText("");
        binding.btn4.setText("");
        binding.btn5.setText("");
        binding.btn6.setText("");
        binding.btn7.setText("");
        binding.btn8.setText("");
        binding.btn9.setText("");
        flag=0;
        count=0;
    }
}