package com.example.offerkhuji_v20;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuCategoryAdapter extends RecyclerView.Adapter<MenuCategoryAdapter.ViewHolder> {

    private final Context context;
    private final ArrayList<MenuCategoryModel> menuCategoryModelArrayList;

    // Constructor
    public MenuCategoryAdapter(Context context, ArrayList<MenuCategoryModel> menuCategoryModelArrayList) {
        this.context = context;
        this.menuCategoryModelArrayList = menuCategoryModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_menu_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        MenuCategoryModel model = menuCategoryModelArrayList.get(position);
        holder.menuCategoryNameTV.setText(model.getMenu_category_name());
        holder.menuCategoryMottoTV.setText("" + model.getMenu_category_motto());
        holder.menuCategoryImageTV.setImageResource(model.getMenu_category_image());


        switch (position){
            case 0:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(view.getContext(), FoodDeliveryActivity.class);
                        view.getContext().startActivity(i);
                    }
                });
                break;




        }



    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return menuCategoryModelArrayList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView menuCategoryImageTV;
        private final TextView menuCategoryNameTV;
        private final TextView menuCategoryMottoTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            menuCategoryImageTV = itemView.findViewById(R.id.food_list_image);
            menuCategoryNameTV = itemView.findViewById(R.id.food_list_name);
            menuCategoryMottoTV = itemView.findViewById(R.id.food_list_offer);
        }
    }
}
