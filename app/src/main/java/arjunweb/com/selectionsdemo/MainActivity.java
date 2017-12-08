package arjunweb.com.selectionsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBTSubmit;
    private TextView mTVResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBTSubmit =  findViewById(R.id.main_courses_bt);
        mBTSubmit.setOnClickListener(this);
        mTVResult = findViewById(R.id.main_result_tv);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_courses_bt:              // Selectd coursed
                Intent mIntent = new Intent(MainActivity.this,CoursesActivity.class);
                startActivityForResult(mIntent,12);

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String mSelectedCourses = "";
        if (data != null) {
            String mIsAndroidSelected  = data.getStringExtra("android");
            String mIsJavaSelected  = data.getStringExtra("java");
            String mIsRetrofitSelected  = data.getStringExtra("retrofit");
            String mIsArchitureSelected  = data.getStringExtra("architecture");
            String mIsGitSelected  = data.getStringExtra("git");

            if(mIsAndroidSelected.equals(CoursesActivity.SELECTED))
                mSelectedCourses += "android ";
            if(mIsJavaSelected.equals(CoursesActivity.SELECTED))
                mSelectedCourses += "java ";
            if(mIsRetrofitSelected.equals(CoursesActivity.SELECTED))
                mSelectedCourses += "Retrofi ";
            if(mIsArchitureSelected.equals(CoursesActivity.SELECTED))
                mSelectedCourses += "architecture ";
            if(mIsGitSelected.equals(CoursesActivity.SELECTED))
                mSelectedCourses += "git ";

            mTVResult.setText(mSelectedCourses);



        }
    }
}
