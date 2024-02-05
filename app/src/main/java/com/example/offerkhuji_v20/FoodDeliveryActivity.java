package com.example.offerkhuji_v20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.skydoves.powermenu.MenuAnimation;
import com.skydoves.powermenu.OnMenuItemClickListener;
import com.skydoves.powermenu.PowerMenu;
import com.skydoves.powermenu.PowerMenuItem;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryActivity extends AppCompatActivity {

    Toolbar toolbar2;
    PowerMenu powerMenu;
    String ss = "লোকেশন";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_delivery);
        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);





        // power popup library code
        List<PowerMenuItem> list = new ArrayList<>();
        powerMenu = new PowerMenu.Builder(FoodDeliveryActivity.this)
                .addItemList(list)// list has "Novel", "Poetry", "Art"
                .addItem(new PowerMenuItem("মিরপুর",  R.drawable.area_mirpur , false))
                .addItem(new PowerMenuItem("গুলশান", R.drawable.area_gulshan ,false))
                .addItem(new PowerMenuItem("ধানমন্ডি",  R.drawable.area_dhanmondi , false))
                .addItem(new PowerMenuItem("আজিমপুর", R.drawable.area_azimpur ,false))
                .addItem(new PowerMenuItem("বাড্ডা", R.drawable.area_badda ,false))
                .addItem(new PowerMenuItem("মোহাম্মাদপুর", R.drawable.area_mohammadpur ,false))
                .addItem(new PowerMenuItem("বনানী", R.drawable.area_banani ,false))
                .addItem(new PowerMenuItem("উত্তরা", R.drawable.area_uttara ,false))
                .addItem(new PowerMenuItem("শ্যামলী", R.drawable.area_shamoly ,false))
                .addItem(new PowerMenuItem("কমলাপুর", R.drawable.area_kamalapur ,false))
                .addItem(new PowerMenuItem("হাজারীবাগ", R.drawable.area_hazaribag ,false))
                .addItem(new PowerMenuItem("শাহবাগ", R.drawable.area_shahabag ,false))
                .addItem(new PowerMenuItem("রমনা", R.drawable.area_ramna ,false))
                .addItem(new PowerMenuItem("তেজগাঁও", R.drawable.area_tejgao ,false))
                .addItem(new PowerMenuItem("পল্লবী", R.drawable.area_pallabi ,false))
                .addItem(new PowerMenuItem("তুরাগ", R.drawable.area_turag ,false))
                .addItem(new PowerMenuItem("ওয়ারী", R.drawable.area_oari ,false))
                .addItem(new PowerMenuItem("মুগদা", R.drawable.area_mugda ,false))
                .addItem(new PowerMenuItem("যাত্রাবাড়ী", R.drawable.area_jatrabari ,false))
                .addItem(new PowerMenuItem("কাফরুল", R.drawable.area_kafrul ,false))
                .addItem(new PowerMenuItem("নিউমার্কেট", R.drawable.area_newmarket ,false))
                .addItem(new PowerMenuItem("কলাবাগান", R.drawable.area_kalabagan ,false))
                .addItem(new PowerMenuItem("পল্টন", R.drawable.area_paltan ,false))
                .addItem(new PowerMenuItem("পুরান ঢাকা", R.drawable.area_purandhaka ,false))
                .addItem(new PowerMenuItem("বংশাল", R.drawable.area_bongshal ,false))
                .addItem(new PowerMenuItem("লালবাগ", R.drawable.area_lalbag ,false))
                .addItem(new PowerMenuItem("মতিঝিল", R.drawable.area_motijhil ,false))
                .addItem(new PowerMenuItem("সাভার", R.drawable.area_savar ,false))
                .setAnimation(MenuAnimation.SHOWUP_TOP_LEFT) // Animation start point (TOP | LEFT).
                .setMenuRadius(10f) // sets the corner radius.
                .setMenuShadow(10f) // sets the shadow.
                .setTextColor(ContextCompat.getColor(FoodDeliveryActivity.this, R.color.appred))
                .setTextGravity(Gravity.CENTER)
                .setTextTypeface(Typeface.create("adornoirrit_regular", Typeface.BOLD))
                .setSelectedTextColor(Color.WHITE)
                .setMenuColor(Color.WHITE)
                .setSelectedMenuColor(ContextCompat.getColor(FoodDeliveryActivity.this, R.color.appred))
                .setOnMenuItemClickListener(onMenuItemClickListener)
                .build();











        // reecyler cardview Category

        RecyclerView foodListRV = findViewById(R.id.rvFoodList);

        // Here, we have created new array list and added data to it
        ArrayList<FoodListModel> foodListArrayList = new ArrayList<FoodListModel>();
        foodListArrayList.add(new FoodListModel("Sultans Dine", "কাচ্চি","রেটিং: ৪.৫","রিভিউ দিয়েছেন 1800 জন","FOOD45+ 50% oFF", R.drawable.slider_kacchi));
        foodListArrayList.add(new FoodListModel("Kacchi Khor", "কাচ্চি","রেটিং: ৪.২","রিভিউ দিয়েছেন 1230 জন","VHAI100", R.drawable.slider_kacchi2));
        foodListArrayList.add(new FoodListModel("Dessert Heart", "ডেজার্ট","রেটিং: ৩.৫","রিভিউ দিয়েছেন 130 জন","Save Upto 100", R.drawable.slider_dessert));
        foodListArrayList.add(new FoodListModel("KFC Bangladesh", "ফাস্টফুড","রেটিং: ৩.১","রিভিউ দিয়েছেন 1860 জন","50% Off on BKash Payment", R.drawable.slider_fastfood));
        foodListArrayList.add(new FoodListModel("Takeout - Mirpur", "ফাস্টফুড","রেটিং: ৩.৮","রিভিউ দিয়েছেন 2300 জন","Buy 1 Get 1 free", R.drawable.slider_juice));
        foodListArrayList.add(new FoodListModel("Waffle Up - Mirpur", "জুসবার","রেটিং: ২.৫","রিভিউ দিয়েছেন 2500 জন","Online Payment Discount", R.drawable.slider_kacchi2));
        foodListArrayList.add(new FoodListModel("Binni Kitchen", "বাংলাদেশি","রেটিং: ৩.৫","রিভিউ দিয়েছেন 109 জন","Save 20%", R.drawable.slider_dessert));
        foodListArrayList.add(new FoodListModel("Cake Stories", "ডেজার্ট","রেটিং: ২.২","রিভিউ দিয়েছেন 340 জন","CAKE450", R.drawable.slider_kacchi));
        foodListArrayList.add(new FoodListModel("Koolfiano", "জুসবার","রেটিং: ৪.৪","রিভিউ দিয়েছেন 890 জন","FOODI23+ 20% oFF", R.drawable.slider_fastfood));


        // we are initializing our adapter class and passing our arraylist to it.
        FoodListAdapter foodListAdapter = new FoodListAdapter(this, foodListArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        foodListRV.setLayoutManager(linearLayoutManager);
        foodListRV.setAdapter(foodListAdapter);






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.food_side_menu,menu);

        MenuItem jh = menu.getItem(0);
        jh.setTitle(ss+"  ▿");

        MenuItem jh1 = menu.getItem(1);
        jh1.setTitle(ss+"  ▿  ");

        return super.onCreateOptionsMenu(menu);
    }


    public OnMenuItemClickListener<PowerMenuItem> onMenuItemClickListener = new OnMenuItemClickListener<PowerMenuItem>() {
        @Override
        public void onItemClick(int position, PowerMenuItem pitem) {
            ss = String.valueOf(pitem.getTitle());
            invalidateOptionsMenu();
            powerMenu.setSelectedPosition(position); // change selected item
            powerMenu.dismiss();

        }
    };



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                powerMenu.showAsDropDown(findViewById(R.id.item1));
                return true;

            case R.id.item2:
                powerMenu.showAsDropDown(findViewById(R.id.item2));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}