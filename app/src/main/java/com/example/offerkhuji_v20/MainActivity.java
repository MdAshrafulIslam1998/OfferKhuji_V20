package com.example.offerkhuji_v20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.skydoves.powermenu.MenuAnimation;
import com.skydoves.powermenu.OnMenuItemClickListener;
import com.skydoves.powermenu.PowerMenu;
import com.skydoves.powermenu.PowerMenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity  {

    Toolbar toolbar;
    PowerMenu powerMenu;
    String ss = "লোকেশন";
    String slide1,slide2,slide3,slide4,slide5,slide6;
    AppCompatButton cuponcode1, cuponcode2,cuponcode3;
    ImageView footerImage;

    //slider
    private List<The_Slide_Items_Model_Class> listItems;
    private ViewPager page;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cuponcode1 = findViewById(R.id.cupone_code1);
        cuponcode2 = findViewById(R.id.cupone_code2);
        cuponcode3 = findViewById(R.id.cupone_code3);

        footerImage = findViewById(R.id.footer_image);
        Glide.with(this).asGif().load(R.raw.splashscreenlogogif).into(footerImage);


        cuponcode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("CuponCode", cuponcode1.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this,"Copied",Toast.LENGTH_SHORT).show();
            }
        });


        cuponcode2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("CuponCode", cuponcode2.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this,"Copied",Toast.LENGTH_SHORT).show();
            }
        });


        cuponcode3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("CuponCode", cuponcode3.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this,"Copied",Toast.LENGTH_SHORT).show();
            }
        });


        //slider
        page = findViewById(R.id.my_pager) ;
        tabLayout = findViewById(R.id.my_tablayout);


        //slider
        // Make a copy of the slides you'll be presenting.
        slide1 = "ফাস্টফুড";
        slide2 = "ডেজার্ট";
        slide3 = "জুসবার";
        slide4 = "কাচ্চি";
        slide5 = "ডাটা প্যাক";
        slide6 = "বিকাশ";

        listItems = new ArrayList<>() ;
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.slider_fastfood, "KFC",slide1,"রেটিং: 4.2","রিভিউ দিয়েছেন ১৮০০ জন","FOOD55+ 50% off"));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.slider_dessert, "Tasty Treat",slide2,"রেটিং: 4.0","রিভিউ দিয়েছেন ১২৪৩ জন","TASTY100"));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.slider_juice, "Ragon Juice",slide3,"রেটিং: 3.3","রিভিউ দিয়েছেন ১৩৯ জন","50 Taka off"));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.slider_kacchi, "Siltans Dine",slide4,"রেটিং: 2.5","রিভিউ দিয়েছেন ১৮৬০ জন","BHAI360"));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.slider_datainternet, "Banglalink",slide5,"রেটিং: 4.5","রিভিউ দিয়েছেন ২৫৪০ জন","1 GB prepaid 50"));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.slider_bkash, "BKash",slide6,"রেটিং: 4.3","রিভিউ দিয়েছেন ১০৪৮ জন","80 Taka Cashback"));






        The_Slide_items_Pager_Adapter itemsPager_adapter = new The_Slide_items_Pager_Adapter(this, listItems);
        page.setAdapter(itemsPager_adapter);

        // The_slide_timer
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new The_slide_timer(),2000,3000);
        tabLayout.setupWithViewPager(page,true);





        // custom toolbar with logo gif mainactivity
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        ImageView imageView = findViewById(R.id.toolbarLogo);
        Glide.with(this).asGif().load(R.raw.whitelogo_cropped).into(imageView);








        // power popup library code
        List<PowerMenuItem> list = new ArrayList<>();
        powerMenu = new PowerMenu.Builder(MainActivity.this)
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
                .setTextColor(ContextCompat.getColor(MainActivity.this, R.color.appred))
                .setTextGravity(Gravity.CENTER)
                .setTextTypeface(Typeface.create("adornoirrit_regular", Typeface.BOLD))
                .setSelectedTextColor(Color.WHITE)
                .setMenuColor(Color.WHITE)
                .setSelectedMenuColor(ContextCompat.getColor(MainActivity.this, R.color.appred))
                .setOnMenuItemClickListener(onMenuItemClickListener)
                .build();






        // reecyler cardview Category

        RecyclerView menuCategoryRV = findViewById(R.id.idRVCourse);

        // Here, we have created new array list and added data to it
        ArrayList<MenuCategoryModel> menuCategoryArrayList = new ArrayList<MenuCategoryModel>();
        menuCategoryArrayList.add(new MenuCategoryModel("ফুড ডেলিভারি", "সব অফার একসাথে", R.drawable.category_burger2));
        menuCategoryArrayList.add(new MenuCategoryModel("মোবাইল প্যাকেজ", "নতুন ডাটা প্যাক", R.drawable.category_phone2));
        menuCategoryArrayList.add(new MenuCategoryModel("কেনাকাটা", "সব ব্র্যান্ড এখানেই", R.drawable.category_shopping));
        menuCategoryArrayList.add(new MenuCategoryModel("ডাক্তার খুঁজুন", "ডাক্তার হাতের মুঠোয়", R.drawable.category_doctor));

        // we are initializing our adapter class and passing our arraylist to it.
        MenuCategoryAdapter menuCategoryAdapter = new MenuCategoryAdapter(this, menuCategoryArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        menuCategoryRV.setLayoutManager(linearLayoutManager);
        menuCategoryRV.setAdapter(menuCategoryAdapter);




    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_side_menu,menu);
        MenuItem jh = menu.getItem(0);
        jh.setTitle(ss+"  ▿");
        return super.onCreateOptionsMenu(menu);
    }






    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                powerMenu.showAsDropDown(findViewById(R.id.item1));
                return true;

            case R.id.item2:
                Intent i = new Intent(MainActivity.this, DrawerActivity.class);
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
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


    public class The_slide_timer extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (page.getCurrentItem()< listItems.size()-1) {
                        page.setCurrentItem(page.getCurrentItem()+1);
                    }
                    else
                        page.setCurrentItem(0);
                }
            });
        }
    }





}