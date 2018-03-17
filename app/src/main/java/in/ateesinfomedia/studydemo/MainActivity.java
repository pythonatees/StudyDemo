package in.ateesinfomedia.studydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  String[] strings = new String[]{"jango","jang","jan","ja"};
  Integer[] integers = new Integer[]{1,2,3,4};
  HashMap<String,Integer> hashMap = new HashMap();
  private TextView txt;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    txt = (TextView) findViewById(R.id.txt);

    makeMix();
    makeMixTwo();

  }

  private void makeMix() {

    hashMap.clear();

    for (int i = 0;i<strings.length;i++){
      String name = strings[i];
      Integer mark = integers[i];

      hashMap.put(name,mark);
      Toast.makeText(this, ""+hashMap, Toast.LENGTH_SHORT).show();
      Log.d("logg======>>>>>>>",String.valueOf(hashMap));
    }

    txt.setText(String.valueOf(hashMap));

  }

  private void makeMixTwo() {

    Subject[] subjects = new Subject[strings.length];

    for (int i = 0;i<strings.length;i++){

      subjects[i] = new Subject(integers[i],strings[i]);
      Log.d("logg222======>>>>>>>",String.valueOf(subjects));
    }

  }

  private class Subject {

    int id;
    String name;

    public Subject(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }
  }
}
