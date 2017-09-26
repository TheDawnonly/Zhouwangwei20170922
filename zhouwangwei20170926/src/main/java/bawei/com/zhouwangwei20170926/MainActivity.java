package bawei.com.zhouwangwei20170926;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bawei.xlistviewlibrary.XListView;
import com.google.gson.Gson;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity implements XListView.IXListViewListener {

    private XListView xListView;
    private String path = "http://japi.juhe.cn/comic/chapterContent?comicName=%E8%BE%9B%E5%B7%B4%E8%BE%BE%E7%9A%84%E5%86%92%E9%99%A9&id=237401&key=68a8c3b1a7fc43f93e71cc02f0f78505";
    private List<Beans.ResultBean.ImageListBean> list;
    private MyAdapter adapter;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找控件
        xListView = (XListView) findViewById(R.id.main_xlv);
        xListView.setPullLoadEnable(true);
        xListView.setXListViewListener(this);
        getData(path);

    }

    /**
     * 请求网络数据
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
                Beans beans = gson.fromJson(s, Beans.class);
                list = beans.getResult().getImageList();
                if (adapter == null) {
                    adapter = new MyAdapter(list, MainActivity.this);
                    xListView.setAdapter(adapter);
                } else {
                    adapter.getMore(list, flag);
                }

            }

            @Override
            protected String doInBackground(String... strings) {
                try {
                    URL url1 = new URL(strings[0]);
                    HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
                    //设置请求方式
                    connection.setRequestMethod("GET");
                    //设置请求时间
                    connection.setConnectTimeout(5000);
                    //设置读取时间
                    connection.setReadTimeout(5000);
                    //获取响应码
                    int code = connection.getResponseCode();
                    if (code == 200) {
                        InputStream inputStream = connection.getInputStream();
                        //将字符流转换为字节流
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
        xListView.stopRefresh();
    }

    @Override
    public void onLoadMore() {
        flag = false;
        getData(path);
        xListView.stopLoadMore();
    }
}
