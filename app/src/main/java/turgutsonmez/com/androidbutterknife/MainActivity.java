package turgutsonmez.com.androidbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.btnTıklaBana)

  Button btnTıklaBana;


  int count = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ButterKnife.bind(this);

  }

  @OnClick(R.id.btnTıklaBana)
  public void count(){
    count++;
    btnTıklaBana.setText(""+count);
  }
}
