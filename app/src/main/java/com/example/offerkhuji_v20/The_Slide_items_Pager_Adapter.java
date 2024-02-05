package com.example.offerkhuji_v20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class The_Slide_items_Pager_Adapter extends PagerAdapter {

    private Context Mcontext;
    private List<The_Slide_Items_Model_Class> theSlideItemsModelClassList;


    public The_Slide_items_Pager_Adapter(Context Mcontext, List<The_Slide_Items_Model_Class> theSlideItemsModelClassList) {
        this.Mcontext = Mcontext;
        this.theSlideItemsModelClassList = theSlideItemsModelClassList;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) Mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View sliderLayout = inflater.inflate(R.layout.the_items_layout,null);

        ImageView slider_image = sliderLayout.findViewById(R.id.custom_dialog_image);
        TextView slider_name = sliderLayout.findViewById(R.id.slider_name_xml);
        TextView slider_type = sliderLayout.findViewById(R.id.food_list_type);
        TextView slider_rating = sliderLayout.findViewById(R.id.food_list_rating);
        TextView slider_count = sliderLayout.findViewById(R.id.food_list_count);
        TextView slider_offer = sliderLayout.findViewById(R.id.slider_offer_xml);

        slider_image.setImageResource(theSlideItemsModelClassList.get(position).getSlider_image_model());
        slider_name.setText(theSlideItemsModelClassList.get(position).getSlider_name_model());
        slider_type.setText(theSlideItemsModelClassList.get(position).getSlider_type_model());
        slider_rating.setText(theSlideItemsModelClassList.get(position).getSlider_rating_model());
        slider_count.setText(theSlideItemsModelClassList.get(position).getSlider_count_model());
        slider_offer.setText(theSlideItemsModelClassList.get(position).getSlider_offer_model());
        container.addView(sliderLayout);
        return sliderLayout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return theSlideItemsModelClassList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
}
