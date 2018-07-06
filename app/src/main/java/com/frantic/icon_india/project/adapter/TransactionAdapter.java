package com.frantic.icon_india.project.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frantic.icon_india.project.R;
import com.frantic.icon_india.project.ui.MainActivity;
import com.frantic.icon_india.project.ui.fragment.TransactionDetails;
import com.frantic.icon_india.project.ui.fragment.Transactions;

/**
 * Created by Ankur_ on 5/13/2018.
 */

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionHolder> {

    public Context context;
    public Fragment fragment;
    private Fragment transactionDetails;

    public TransactionAdapter(Context context, Fragment fragment) {
        this.fragment=fragment;
        this.context=context;
    }

    @Override
    public TransactionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.transactions_card, parent, false);
        TransactionAdapter.TransactionHolder transactionHolder = new TransactionAdapter.TransactionHolder(view);
        return transactionHolder;
    }

    @Override
    public void onBindViewHolder(TransactionHolder holder, int position) {

holder.cardTransaction.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        transactionDetails = new TransactionDetails();
        ((MainActivity) context).loadFragment(transactionDetails);
    }
});
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class TransactionHolder extends RecyclerView.ViewHolder {

        private final CardView cardTransaction;

        public TransactionHolder(View itemView) {
            super(itemView);

            cardTransaction = (CardView)itemView.findViewById(R.id.cardTransaction);
        }
    }
}
