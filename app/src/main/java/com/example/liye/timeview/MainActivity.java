package com.example.liye.timeview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.excellence.basetoolslibrary.baseadapter.CommonAdapter;
import com.excellence.basetoolslibrary.baseadapter.ViewHolder;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ListView mListView = null;
    List<ResultViewModel> resultViewModels = null;
    String time = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.result_list_view);
        initData();
        ResultAdapter mAdapter = new ResultAdapter(this, resultViewModels, R.layout.item_result_view);
        mAdapter.notifyDataSetChanged();

        mListView.setAdapter(mAdapter);

    }

    private void initData() {
        resultViewModels = new ArrayList<>();

        for ( int i=0;i< 10;i++) {

        resultViewModels.add(new ResultViewModel("星期", "天气", getResources().getDrawable(R.drawable.spot_blue), "晴：心情很美丽", "3度~28度"));
        }

    }


    private class ResultAdapter extends CommonAdapter<ResultViewModel> {

        public ResultAdapter(Context context, List<ResultViewModel> datas, @LayoutRes int layoutId) {
            super(context, datas, layoutId);
        }

        @Override
        public void convert(ViewHolder viewHolder, ResultViewModel item, int position) {
            viewHolder.setText(R.id.time_text, item.getTimeStr());
            viewHolder.setText(R.id.date_text, item.getDateStr());
            viewHolder.setImageDrawable(R.id.meal_image,item.getMealDrawable());
            viewHolder.setText(R.id.result_text, item.getResultStr());
            viewHolder.setText(R.id.result_range_text, item.getRangeStr());
            //最后一项时，竖线不再显示
            if (position < resultViewModels.size() - 1) {
                viewHolder.setVisible(R.id.line_normal, View.VISIBLE);

            }
            if (position == resultViewModels.size() - 1) {
                viewHolder.setVisible(R.id.line_normal, View.GONE);
            }

        }

    }
}
