package sg.edu.rp.c346.id20045524.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textViewA1);
//        tvAnswer.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");


        String msg = "";
        if (questionsSelected.equals("Q1")){
            msg = questionsSelected + " answer is: Queue";
        } else if (questionsSelected.equals("Q2")){
            msg = questionsSelected + " answer is: Gone";
        }
        tvAnswer.setText(msg);


    }
}
