package homepage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import Noodles.NoodlesAdapter;

import com.example.login.R;

import java.util.ArrayList;
import java.util.List;

import Noodles.Noodles;

public class FragmentActivity_1 extends Fragment {


     Context context;
    View view;
    Activity activity;
    private List<Noodles> noodlesList = new ArrayList<>();
    Runnable b;

    @Override
    public void onStart() {
        super.onStart();

    }

    public FragmentActivity_1() {

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_1,container,false);
        activity = getActivity();
        context = getActivity();
        //面条初始化
        initNoodles();
        RecyclerView recyclerView = view.findViewById(R.id.noodles_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        NoodlesAdapter adapter = new NoodlesAdapter(noodlesList);
        recyclerView.setAdapter(adapter);
        adapter.getContext(context);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    private void initNoodles() {
        String string1 = "名称：";
        String string2 = "推荐指数：";
        Noodles noodles1 = new Noodles(string1 + "和子饭", string2 + "待定", R.drawable.a);
        noodlesList.add(noodles1);
        Noodles noodles2 = new Noodles(string1 + "小揪片", string2 + "待定", R.drawable.b);
        noodlesList.add(noodles2);
        Noodles noodles3 = new Noodles(string1 + "剪刀面", string2 + "待定", R.drawable.c);
        noodlesList.add(noodles3);
        Noodles noodles4 = new Noodles(string1 + "和子饭", string2 + "待定", R.drawable.d);
        noodlesList.add(noodles4);
        Noodles noodles5 = new Noodles(string1 + "荞面饸捞", string2 + "待定", R.drawable.e);
        noodlesList.add(noodles5);
        Noodles noodles6 = new Noodles(string1 + "粗粮佛跳墙", string2 + "待定", R.drawable.f);
        noodlesList.add(noodles6);
        Noodles noodles7 = new Noodles(string1 + "扯面", string2 + "待定", R.drawable.g);
        noodlesList.add(noodles7);
        Noodles noodles8 = new Noodles(string1 + "茼蒿拨烂子", string2 + "待定", R.drawable.h);
        noodlesList.add(noodles8);
        Noodles noodles9 = new Noodles(string1 + "生日一根面", string2 + "待定", R.drawable.i);
        noodlesList.add(noodles9);
        Noodles noodles10 = new Noodles(string1 + "台蘑羊肉栲栳栳", string2 + "待定", R.drawable.j);
        noodlesList.add(noodles10);
        Noodles noodles11 = new Noodles(string1 + "西红柿鸡蛋栲栳", string2 + "待定", R.drawable.k);
        noodlesList.add(noodles11);
        Noodles noodles12 = new Noodles(string1 + "麻饼凉粉", string2 + "待定", R.drawable.l);
        noodlesList.add(noodles12);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
