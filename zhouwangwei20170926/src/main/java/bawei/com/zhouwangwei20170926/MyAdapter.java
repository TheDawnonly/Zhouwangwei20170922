package bawei.com.zhouwangwei20170926;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Mr.周 on 2017/9/26.
 */

public class MyAdapter extends BaseAdapter {
    private List<Beans.ResultBean.ImageListBean> list;
    private Context context;

    public MyAdapter(List<Beans.ResultBean.ImageListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void getMore(List<Beans.ResultBean.ImageListBean> listBeen, boolean b) {
        for (Beans.ResultBean.ImageListBean imageListBean : listBeen) {
            if (b) {
                list.add(0, imageListBean);
            } else {
                list.add(imageListBean);
            }
        }
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

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            view = View.inflate(context, R.layout.item, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) view.findViewById(R.id.item_img);
            holder.textView = (TextView) view.findViewById(R.id.item_tv);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(list.get(i).getImageUrl()).into(holder.imageView);
        holder.textView.setText(list.get(i).getId() + "");
        return view;
    }

    class ViewHolder {
        TextView textView;
        ImageView imageView;
    }
}
