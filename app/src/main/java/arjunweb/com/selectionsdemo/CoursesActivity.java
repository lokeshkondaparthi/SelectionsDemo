package arjunweb.com.selectionsdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoursesActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtAndroid, mBtJava, mBtRetrovit, mBtArchitecture, mBtGit, mBtSubmit;

    public static String SELECTED = "selected";
    public  static  String UNSELECTED = "unselected";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_layout);
        mBtAndroid = findViewById(R.id.course_android_bt);
        mBtAndroid.setOnClickListener(this);
        mBtAndroid.setTag(UNSELECTED);
        mBtJava=findViewById(R.id.course_android_java);
        mBtJava.setOnClickListener(this);
        mBtJava.setTag(UNSELECTED);
        mBtRetrovit=findViewById(R.id.course_android_retrofit);
        mBtRetrovit.setOnClickListener(this);
        mBtRetrovit.setTag(UNSELECTED);
        mBtArchitecture=findViewById(R.id.course_android_architecture);
        mBtArchitecture.setOnClickListener(this);
        mBtArchitecture.setTag(UNSELECTED);
        mBtGit=findViewById(R.id.course_android_git);
        mBtGit.setOnClickListener(this);
        mBtGit.setTag(UNSELECTED);
        mBtSubmit=findViewById(R.id.course_android_submit);
        mBtSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.course_android_bt:
                    if(mBtAndroid.getTag().toString().equals(UNSELECTED)) {
                        mBtAndroid.setTag(SELECTED);
                        mBtAndroid.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    }else{
                        mBtAndroid.setTag(UNSELECTED);
                        mBtAndroid.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                    }
                break;
            case R.id.course_android_java:
                if(mBtJava.getTag().toString().equals(UNSELECTED)) {
                    mBtJava.setTag(SELECTED);
                    mBtJava.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                }else{
                    mBtJava.setTag(UNSELECTED);
                    mBtJava.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                }
                break;
            case R.id.course_android_retrofit:
                if(mBtRetrovit.getTag().toString().equals(UNSELECTED)) {
                    mBtRetrovit.setTag(SELECTED);
                    mBtRetrovit.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                }else{
                    mBtRetrovit.setTag(UNSELECTED);
                    mBtRetrovit.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                }
                break;
            case R.id.course_android_architecture:
                if(mBtArchitecture.getTag().toString().equals(UNSELECTED)) {
                    mBtArchitecture.setTag(SELECTED);
                    mBtArchitecture.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                }else{
                    mBtArchitecture.setTag(UNSELECTED);
                    mBtArchitecture.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                }
                break;
            case R.id.course_android_git:
                if(mBtGit.getTag().toString().equals(UNSELECTED)) {
                    mBtGit.setTag(SELECTED);
                    mBtGit.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                }else{
                    mBtGit.setTag(UNSELECTED);
                    mBtGit.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                }
                break;
            case R.id.course_android_submit:
                Intent mSelectedCoursesIntent = new Intent();
                mSelectedCoursesIntent.putExtra("android",mBtAndroid.getTag().toString());
                mSelectedCoursesIntent.putExtra("java",mBtJava.getTag().toString());
                mSelectedCoursesIntent.putExtra("retrofit",mBtRetrovit.getTag().toString());
                mSelectedCoursesIntent.putExtra("architecture",mBtArchitecture.getTag().toString());
                mSelectedCoursesIntent.putExtra("git",mBtGit.getTag().toString());
                setResult(Activity.RESULT_OK,mSelectedCoursesIntent);
                finish();
                break;
        }
    }
}
