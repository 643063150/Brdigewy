package com.zpp.mygraffiti.graffiti;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 创建日期：2018/6/19
 *
 * @author zpp
 * @version 1.0
 * 文件名称： $file_name$
 * 类说明：
 */
public class LabelPop {
    View popView;
    PopupWindow popupWindow;
    private MyPopwindowsListener mListViewListener;
    GridView poplist;

    public void showpop(Activity activity, View view) {
        popView = activity.getLayoutInflater().inflate(
                R.layout.screenpops, null);
        WindowManager windowManager = activity.getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        popupWindow = new PopupWindow(popView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        popView.setFocusable(true);
        popView.setFocusableInTouchMode(true);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.update();
        popupWindow.showAtLocation(popView,
                Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);

        poplist = (GridView) popView.findViewById(R.id.gridview);
        HashMap<String, String> hashMap;
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            hashMap = new HashMap<>();
            if (i == 0) {
                hashMap.put("name", "圆形");
            } else if (i == 1) {
                hashMap.put("name", "矩形");
            }else if (i==2){
                hashMap.put("name", "线条");
            }
            ScreenAdapter popAdapter = new ScreenAdapter(activity, arrayList);
            poplist.setAdapter(popAdapter);
            poplist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    startLoadMore(position, popupWindow);
                }
            });
            arrayList.add(hashMap);
        }
    }

    public void setMyPopwindowswListener(MyPopwindowsListener l) {
        mListViewListener = l;
    }

    public interface MyPopwindowsListener {
        public void onRefresh(int position, PopupWindow popupWindow);
    }

    private void startLoadMore(int position, PopupWindow popupWindow) {

        if (mListViewListener!=null){
            mListViewListener.onRefresh(position, popupWindow);
        }

    }
}
