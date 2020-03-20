package homepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.example.login.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import Noodles.Noodles;
import Noodles.NoodlesAdapter;

public class HomePageActivity extends AppCompatActivity {
    private TabLayout tabId;
    private ViewPager vpId;
    SharedPreferences sharedPreferences;
    TextView UserName;

    private List<Fragment> list = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_page);
        UserName = findViewById(R.id.name);
        sharedPreferences = getSharedPreferences("register_date", MODE_PRIVATE);
        String user_name_date = sharedPreferences.getString("register_name", "");
        UserName.setText(user_name_date);

        tabId = findViewById(R.id.tab_id);
        vpId = findViewById(R.id.vp_id);

        list.add(new FragmentActivity_1());
        list.add(new FragmentActivity_2());
        list.add(new FragmentActivity_3());

        titles.add("美食咨询");
        titles.add("拍照识图");
        titles.add("简介");

        //建立适配器
        ViewPagerAdapter myFragmentAdapter = new ViewPagerAdapter(getSupportFragmentManager(), list, titles);
        vpId.setAdapter(myFragmentAdapter);
        //tablayout与viewpager关联
        tabId.setupWithViewPager(vpId);

    }


}
