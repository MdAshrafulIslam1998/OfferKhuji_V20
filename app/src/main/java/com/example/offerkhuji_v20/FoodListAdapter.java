package com.example.offerkhuji_v20;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder> {

    private final Context context;
    private final ArrayList<FoodListModel> foodModelArrayList;
    LayoutInflater inflater;

    // Constructor
    public FoodListAdapter(Context context, ArrayList<FoodListModel> foodModelArrayList) {
        this.context = context;
        this.foodModelArrayList = foodModelArrayList;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        FoodListModel model = foodModelArrayList.get(position);
        holder.foodNameTV.setText(model.getFood_name());
        holder.foodTypeTV.setText("⦿ " + model.getFood_type());
        holder.foodRatingTV.setText(model.getFood_rating());
        holder.foodCountTV.setText(model.getFood_count());
        holder.foodOfferTV.setText(model.getFood_offer());
        holder.foodImage.setImageResource(model.getFood_image());
        holder.foodListNumber.setText(position+1+"");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                AlertDialog.Builder builder = new AlertDialog.Builder(view.getRootView().getContext());
//                View dialogView = LayoutInflater.from(view.getRootView().getContext()).inflate(R.layout.custom_dialog,null);
//                builder.setView(dialogView);
//                builder.setCancelable(true);
//                builder.show();

//
//                Dialog alertDialog = new Dialog(context);
//                alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//                View dialogView = LayoutInflater.from(view.getRootView().getContext()).inflate(R.layout.custom_dialog,null);
//                ImageView custom_dialog_image = dialogView.findViewById(R.id.custom_dialog_image);
//                custom_dialog_image.setImageResource(model.getFood_image());
//                alertDialog.setContentView(dialogView);
//                alertDialog.setContentView(R.layout.custom_dialog);
//                alertDialog.show();


                Dialog alertDialog = new Dialog(context);
                alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                alertDialog.setContentView(R.layout.custom_dialog);
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView custom_dialog_image = alertDialog.findViewById(R.id.custom_dialog_image);
                AppCompatButton cancel_button = alertDialog.findViewById(R.id.close_button);
                cancel_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
                custom_dialog_image.setImageResource(model.getFood_image());
                alertDialog.show();



            }
        });








    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return foodModelArrayList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView foodImage;
        private final TextView foodNameTV;
        private final TextView foodTypeTV;
        private final TextView foodRatingTV;
        private final TextView foodCountTV;
        private final TextView foodOfferTV;
        private final TextView foodListNumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_list_image);
            foodNameTV = itemView.findViewById(R.id.food_list_name);
            foodTypeTV = itemView.findViewById(R.id.food_list_type);
            foodRatingTV = itemView.findViewById(R.id.food_list_rating);
            foodCountTV = itemView.findViewById(R.id.food_list_count);
            foodOfferTV = itemView.findViewById(R.id.food_list_offer);
            foodListNumber = itemView.findViewById(R.id.food_list_number);
        }
    }
}
