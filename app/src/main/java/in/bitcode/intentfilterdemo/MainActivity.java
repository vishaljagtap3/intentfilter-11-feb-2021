package in.bitcode.intentfilterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEdtPath;
    private Button mBtnShowImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtPath = findViewById(R.id.edtPath);
        mBtnShowImage = findViewById(R.id.btnShowImage);

        mBtnShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setAction("in.bitcode.image.SHOW");
                intent.addCategory("in.bitcode.category.GENERAL");

                intent.setDataAndType(
                        Uri.parse(mEdtPath.getText().toString()),
                        "image/jpeg"
                );

                //intent.putExtra("path", mEdtPath.getText().toString());
                startActivity(intent);

            }
        });
    }
}