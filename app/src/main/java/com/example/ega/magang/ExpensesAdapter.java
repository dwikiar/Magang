package com.example.ega.magang;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ega on 06/02/2018.
 */

public class ExpensesAdapter extends ArrayAdapter<Expenses> {

    public ExpensesAdapter(@NonNull Context context, @NonNull List<Expenses> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.expenses_layout,parent,false);
        }
        Expenses current = getItem(position);
        TextView namaId = (TextView) convertView.findViewById(R.id.nama);
        TextView card = (TextView) convertView.findViewById(R.id.status_smartcard);
        ImageView image = (ImageView) convertView.findViewById(R.id.image_upload);

        namaId.setText(current.getmNama());
        card.setText(current.getmCard());

        return convertView;
    }
}
