package com.android.mivitest.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.mivitest.R;
import com.android.mivitest.models.Attributes;
import com.android.mivitest.models.Included;

import java.util.List;
 
public class AccountDetailsAdapter extends RecyclerView.Adapter {
 
    private List<Included> includedList;
 
    public static class SubscriptionViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_type, tv_data_balance, tv_credit_balance, tv_roll_over_credit_balance, tv_roll_over_data_balance,
                tv_int_talk_bal, tv_exp_date, tv_auto_renewal, tv_prime_sub;
 
        public SubscriptionViewHolder(View view) {
            super(view);
            tv_type = view.findViewById(R.id.tv_type);
            tv_data_balance = view.findViewById(R.id.tv_data_balance);
            tv_credit_balance = view.findViewById(R.id.tv_credit_balance);
            tv_roll_over_credit_balance = view.findViewById(R.id.tv_roll_over_credit_balance);
            tv_roll_over_data_balance = view.findViewById(R.id.tv_roll_over_data_balance);
            tv_int_talk_bal = view.findViewById(R.id.tv_int_talk_bal);
            tv_exp_date = view.findViewById(R.id.tv_exp_date);
            tv_auto_renewal = view.findViewById(R.id.tv_auto_renewal);
            tv_prime_sub = view.findViewById(R.id.tv_prime_sub);
        }
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_type, tv_name, tv_included_data, tv_included_credit, tv_included_int_talk, tv_unlimited_text,
                tv_unlimited_talk, tv_unlimited_int_text, tv_unlimited_int_talk, tv_price;

        public ProductViewHolder(View view) {
            super(view);
            tv_type = view.findViewById(R.id.tv_type);
            tv_name = view.findViewById(R.id.tv_name);
            tv_included_data = view.findViewById(R.id.tv_included_data);
            tv_included_credit = view.findViewById(R.id.tv_included_credit);
            tv_included_int_talk = view.findViewById(R.id.tv_included_int_talk);
            tv_unlimited_text = view.findViewById(R.id.tv_unlimited_text);
            tv_unlimited_talk = view.findViewById(R.id.tv_unlimited_talk);
            tv_unlimited_int_text = view.findViewById(R.id.tv_unlimited_int_text);
            tv_unlimited_int_talk = view.findViewById(R.id.tv_unlimited_int_talk);
            tv_price = view.findViewById(R.id.tv_price);
        }
    }

    public static class ServiceViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_type, tv_msn, tv_credit, tv_credit_expiry, tv_data_usage_threshold;

        public ServiceViewHolder(View view) {
            super(view);
            tv_type = view.findViewById(R.id.tv_type);
            tv_msn = view.findViewById(R.id.tv_msn);
            tv_credit = view.findViewById(R.id.tv_credit);
            tv_credit_expiry = view.findViewById(R.id.tv_credit_expiry);
            tv_data_usage_threshold = view.findViewById(R.id.tv_data_usage_threshold);
        }
    }
 
 
    public AccountDetailsAdapter(List<Included> includedList) {
        this.includedList = includedList;
    }
 
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        switch (viewType){
            case 0:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.subscription_details_row, parent, false);
                return new SubscriptionViewHolder(itemView);
            case 1:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.product_details_row, parent, false);
                return new ProductViewHolder(itemView);
            case 2:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.service_details_row, parent, false);
                return new ServiceViewHolder(itemView);

        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Included included = includedList.get(position);
        Attributes attributes = included.getAttributes();

        if (included != null){
            switch (included.getType()){
                case Included.typeSubscription:
                    SubscriptionViewHolder subscriptionViewHolder = (SubscriptionViewHolder)holder;

                    subscriptionViewHolder.tv_type.setText("Subscription");
                    subscriptionViewHolder.tv_data_balance.setText("Data Balance : " + attributes.getIncluded_data_balance());
                    subscriptionViewHolder.tv_credit_balance.setText("Credit Balance : " + attributes.getIncluded_credit_balance());
                    subscriptionViewHolder.tv_roll_over_credit_balance.setText("Roll over credit balance : " + attributes.getIncluded_rollover_credit_balance());
                    subscriptionViewHolder.tv_roll_over_data_balance.setText("Roll over data balance : " + attributes.getIncluded_rollover_data_balance());
                    subscriptionViewHolder.tv_int_talk_bal.setText("International talk balance : " + attributes.getIncluded_international_talk_balance());
                    subscriptionViewHolder.tv_exp_date.setText("Expiry Date : " + attributes.getExpiry_date());
                    subscriptionViewHolder.tv_auto_renewal.setText("Auto Renewal : " + String.valueOf(attributes.getAuto_renewal()));
                    subscriptionViewHolder.tv_prime_sub.setText("Primary Subscription : " + String.valueOf(attributes.getPrimary_subscription()));
                    break;

                case Included.typeProduct:
                    ProductViewHolder productViewHolder = (ProductViewHolder)holder;

                    productViewHolder.tv_type.setText("Product");
                    productViewHolder.tv_name.setText("Name : " + attributes.getName());
                    productViewHolder.tv_included_data.setText("Included Data : " + attributes.getIncluded_data());
                    productViewHolder.tv_included_credit.setText("Included Credit : " + attributes.getIncluded_credit());
                    productViewHolder.tv_included_int_talk.setText("Included International talk : " + attributes.getIncluded_international_talk());
                    productViewHolder.tv_unlimited_text.setText("Unlimited text : " + attributes.getUnlimited_text());
                    productViewHolder.tv_unlimited_talk.setText("Unlimited talk : " + attributes.getUnlimited_talk());
                    productViewHolder.tv_unlimited_int_text.setText("Unlimited international text : " + String.valueOf(attributes.getUnlimited_international_talk()));
                    productViewHolder.tv_unlimited_int_talk.setText("Unlimited international talk : " + String.valueOf(attributes.getUnlimited_international_talk()));
                    productViewHolder.tv_price.setText("Price : " + String.valueOf(attributes.getPrice()));

                    break;

                case Included.typeService:
                    ServiceViewHolder serviceViewHolder = (ServiceViewHolder)holder;

                    serviceViewHolder.tv_type.setText("Service");
                    serviceViewHolder.tv_msn.setText("MSN : " + attributes.getMsn());
                    serviceViewHolder.tv_credit.setText("Credit : " + attributes.getCredit());
                    serviceViewHolder.tv_credit_expiry.setText("Credit expiry : " + attributes.getCredit_expiry());
                    serviceViewHolder.tv_data_usage_threshold.setText("Data usage threshold : " + attributes.getData_usage_threshold());

                    break;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (includedList.get(position).getType()) {
            case Included.typeSubscription:
                return 0;
            case Included.typeProduct:
                return 1;
            case Included.typeService:
                return 2;
            default:
                return -1;
        }
    }

    @Override
    public int getItemCount() {
        return includedList.size();
    }
}