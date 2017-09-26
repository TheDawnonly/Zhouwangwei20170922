package bawei.com.zhouwangwei20170922;

import android.content.ContentValues;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;

import com.bawei.xlistviewlibrary.XListView;
import com.google.gson.Gson;
import com.youth.banner.Banner;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import bawei.com.zhouwangwei20170922.adapter.MyAdapter;
import bawei.com.zhouwangwei20170922.bean.BeansInfo;
import bawei.com.zhouwangwei20170922.utils.MyHelp;
import bawei.com.zhouwangwei20170922.utils.MyImageloader;
import bawei.com.zhouwangwei20170922.utils.Tools;

public class MainActivity extends AppCompatActivity implements XListView.IXListViewListener {
    private XListView main_xlv;
    //设置夜间模式
    private ImageView main_img_night;
    private List<BeansInfo.ListBean> list;
    private MyAdapter adapter;
    private String path = "http://qhb.2dyt.com/Bwei/news?postkey=9rff1d1AK&type=5";
    private boolean flag;
    private Banner banner;
    private List<String> imglist;
    private MyHelp help = new MyHelp(this);
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_xlv = (XListView) findViewById(R.id.main_Xlv);
        main_img_night = (ImageView) findViewById(R.id.login_btn);
        banner = (Banner) findViewById(R.id.main_banner);
        main_xlv.setXListViewListener(this);
        main_xlv.setPullLoadEnable(true);
        //图片无限轮播
        getImg();
        //获取网络数据
        getData(path);
        //保存到数据库
        savaSql();
        main_img_night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
                if (mode == Configuration.UI_MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                } else if (mode == Configuration.UI_MODE_NIGHT_NO) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    // blah blah
                }
                recreate();
            }
        });
    }

    /**
     * 保存数据库
     */
    private void savaSql() {
        db = help.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("url", "");

        db.insert("person", null, values);
    }

    /**
     * 设置无限轮播
     */
    private void getImg() {
        imglist = new ArrayList<>();
        imglist.add("https://img10.360buyimg.com/da/jfs/t4747/277/1368712300/170619/35098d7f/58f038e0N9b3a0ca5.jpg");
        imglist.add("https://img14.360buyimg.com/da/jfs/t4915/21/1427207714/81116/b005bb06/58f08963Ndb295b3c.jpg");
        imglist.add("https://img13.360buyimg.com/da/jfs/t4651/104/2867456043/68336/99da4c16/58f41eaeN5b614a63.jpg");
        banner.setImageLoader(new MyImageloader());
        banner.setImages(imglist);
        banner.start();
    }

    /**
     * 获取网络数据
     *
     * @param url
     */
    private void getData(String url) {
        new AsyncTask<String, Void, String>() {
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                if (s == null) {
                    return;
                }
                Gson gson = new Gson();
                BeansInfo beansInfo = gson.fromJson(s, BeansInfo.class);
                list = beansInfo.getList();
                if (adapter == null) {
                    adapter = new MyAdapter(list, MainActivity.this);
                    main_xlv.setAdapter(adapter);
                } else {
                    adapter.getMore(list, flag);
                }
            }

            @Override
            protected String doInBackground(String... strings) {
                try {
                    URL url1 = new URL(strings[0]);
                    HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
                    //设置请求时间
                    connection.setConnectTimeout(5000);
                    //设置读取时间
                    connection.setReadTimeout(5000);
                    //获取响应码
                    int code = connection.getResponseCode();
                    if (code == 200) {
                        InputStream inputStream = connection.getInputStream();
                        //将字节流转换为字符流
                        String is = Tools.getIs(inputStream);
                        return is;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute(url);
    }

    @Override
    public void onRefresh() {
        flag = true;
        getData(path);
        main_xlv.stopRefresh();
    }

    @Override
    public void onLoadMore() {
        flag = false;
        getData(path);
        main_xlv.stopLoadMore();
    }
}
