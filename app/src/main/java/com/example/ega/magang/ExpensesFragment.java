package com.example.ega.magang;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class ExpensesFragment extends Fragment {

    public ExpensesFragment(){};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_expenses, container, false);

        ArrayList<Expenses> expenses = new ArrayList<>();
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));
        expenses.add(new Expenses("Andhika","Valid",R.drawable.narubo));

        ListView listView = view.findViewById(R.id.list_expenses);

        ExpensesAdapter adapter = new ExpensesAdapter(getActivity(), expenses);
        listView.setAdapter(adapter);

        return view;
    }

}
