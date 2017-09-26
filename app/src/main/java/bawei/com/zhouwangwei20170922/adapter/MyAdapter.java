package bawei.com.zhouwangwei20170922.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import bawei.com.zhouwangwei20170922.R;
import bawei.com.zhouwangwei20170922.bean.BeansInfo;

/**
 * Created by Mr.周 on 2017/9/22.
 */

public class MyAdapter extends BaseAdapter {
    private List<BeansInfo.ListBean> list;
    private Context context;

    public MyAdapter(List<BeansInfo.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public void getMore(List<BeansInfo.ListBean> beansInfoList, boolean b) {

        for (BeansInfo.ListBean listBean : beansInfoList) {
            if (b) {
                list.add(0, listBean);
            } else {
                list.add(listBean);
            }

        }
    }


    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        ViewHolder1 holder1 = null;
        int type = getItemViewType(i);
        switch (type) {
            case 0:
                if (view == null) {
                    holder = new ViewHolder();
                    view = View.inflate(context, R.layout.item, null);
                    holder.imageView = (ImageView) view.findViewById(R.id.item_img);
                    holder.imageView1 = (ImageView) view.findViewById(R.id.item_img1);
                    holder.imageView2 = (ImageView) view.findViewById(R.id.item_img2);
                    holder.imageView3 = (ImageView) view.findViewById(R.id.item_img3);
                    holder.imageView4 = (ImageView) view.findViewById(R.id.item_img4);
                    holder.imageView5 = (ImageView) view.findViewById(R.id.item_img5);
                    holder.imageView6 = (ImageView) view.findViewById(R.id.item_img6);
                    holder.imageView7 = (ImageView) view.findViewById(R.id.item_img7);
                    holder.imageView8 = (ImageView) view.findViewById(R.id.item_img8);
                    holder.imageView9 = (ImageView) view.findViewById(R.id.item_img9);
                    view.setTag(holder);
                } else {
                    holder = (ViewHolder) view.getTag();
                }
                break;
            case 1:
                if (view == null) {
                    holder1 = new ViewHolder1();
                    view = View.inflate(context, R.layout.item1, null);
                    holder1.imageView = (ImageView) view.findViewById(R.id.item1_img);
                    view.setTag(holder1);
                } else {
                    holder1 = (ViewHolder1) view.getTag();
                }
                break;
        }
        switch (type) {
            case 0:
                String path1 = "http://p3.pstatp.com/list/190x124/1c19000062675e53b27e";
                String path2 = "http://p3.pstatp.com/list/190x124/1aa4000a2b8a788b321f";
                String path3 = "http://p3.pstatp.com/list/190x124/2a3f0000d9a4a6ac884d";
                String path4 = "http://p1.pstatp.com/list/190x124/2a3c000520bf9b36fdf0";
                String path5 = "http://p3.pstatp.com/list/190x124/26ed0005636b714a9f61";
                String path6 = "http://p1.pstatp.com/list/190x124/26ee000375da57f8b8b1";
                String path7 = "http://p3.pstatp.com/list/190x124/26ef0000545531df0dfa";
                String path8 = "http://p3.pstatp.com/list/190x124/26ef00005463b7a8f958";
                String path9 = "http://p3.pstatp.com/list/190x124/213300016c777190f9ed";
                String path10 = "http://p3.pstatp.com/list/190x124/22ca00011911b0a8061c";
                Glide.with(context).load(path1).into(holder.imageView);
                Glide.with(context).load(path2).into(holder.imageView1);
                Glide.with(context).load(path3).into(holder.imageView2);
                Glide.with(context).load(path4).into(holder.imageView3);
                Glide.with(context).load(path5).into(holder.imageView4);
                Glide.with(context).load(path6).into(holder.imageView5);
                Glide.with(context).load(path7).into(holder.imageView6);
                Glide.with(context).load(path8).into(holder.imageView7);
                Glide.with(context).load(path9).into(holder.imageView8);
                Glide.with(context).load(path10).into(holder.imageView9);

                break;
            case 1:
                String url1 = "http://p3.pstatp.com/list/190x124/26ed0005636b714a9f61";
                String url2 = "http://p1.pstatp.com/list/190x124/26ee000375da57f8b8b1";
                String url3 = "http://p3.pstatp.com/list/190x124/26ef0000545531df0dfa";
                String url4 = "http://p3.pstatp.com/list/190x124/26ef00005463b7a8f958";
                String url5 = "http://p3.pstatp.com/list/190x124/28820012a2ed870afe9c";
                String url6 = "http://p9.pstatp.com/list/190x124/28820012a37f01432419";
                String url7 = "http://s3m.mediav.com/galileo/88d8e16558fa0fd6402fe8daa32f5d44.jpg";
                String url8 = "http://p3.pstatp.com/list/190x124/289c001c528de064679d";
                Glide.with(context).load(url1).into(holder1.imageView);
                Glide.with(context).load(url2).into(holder1.imageView);
                Glide.with(context).load(url3).into(holder1.imageView);
                Glide.with(context).load(url4).into(holder1.imageView);
                Glide.with(context).load(url5).into(holder1.imageView);
                Glide.with(context).load(url6).into(holder1.imageView);
                Glide.with(context).load(url7).into(holder1.imageView);
                Glide.with(context).load(url8).into(holder1.imageView);
                break;
        }
        return view;
    }

    class ViewHolder {
        ImageView imageView, imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9;
    }

    class ViewHolder1 {
        TextView textView;
        ImageView imageView;
    }
}
