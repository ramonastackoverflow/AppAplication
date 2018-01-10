package make.appaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        TextView textViewDisplayResult = (TextView) findViewById(R.id.text_view_display_result);
        Button textViewDisplayButton = (Button) findViewById(R.id.button);



        final String TAG = "Ramona";
        /*String anotherButton;

        String answer = "";
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            if (bundle.containsKey("KEY_ANSWER"))
                answer = bundle.getString("KEY_ANSWER");
            anotherButton  = bundle.getString("KEY_ANOTHER_BUTTON");

        }

        Log.d("SUCCESS", "answer: " + answer);

        */

        String answer= getIntent().getExtras().getString("KEY_ANSWER","");
        Log.e(TAG, "initVariable: answer="+answer);
        if(answer.equalsIgnoreCase("Good Answer")){
            String  anotherButton= getIntent().getExtras().getString("KEY_ANOTHER_BUTTON","");
            Log.e(TAG, "initVariable: another button="+anotherButton );
            textViewDisplayButton.setVisibility(View.VISIBLE);
            textViewDisplayButton.setText(anotherButton);
        }else{
            textViewDisplayButton.setVisibility(View.GONE);
        }



        textViewDisplayResult.setText(answer);


            final Button button = (Button) findViewById(R.id.button_id);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Perform action on click
                    finish();
                }
            });

        }
    }





