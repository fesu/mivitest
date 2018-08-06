package com.android.mivitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.android.mivitest.adapters.AccountDetailsAdapter;
import com.android.mivitest.jsonparcer.ParseCollection;
import com.android.mivitest.models.UserDetails;

public class MainActivity extends AppCompatActivity {

    TextView tv_name, tv_dob, tv_mobile, tv_email, tv_email_sub_status;
    UserDetails userDetails;
    ParseCollection parseCollection;
    RecyclerView rcv_account_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initiateComponent();

        setUserProfileDetails();

    }

    private void setUserProfileDetails() {
        String name, dob, mobile, email, email_sub_status;
        Boolean isEmailVerified = userDetails.getData().getAttributes().getEmail_address_verified();

        name = userDetails.getData().getAttributes().getFirst_name() + " " +
                userDetails.getData().getAttributes().getLast_name();
        dob = "Date of birth : " + userDetails.getData().getAttributes().getDate_of_birth();
        mobile = "Contact : " + userDetails.getData().getAttributes().getContact_number();
        if (isEmailVerified)
            email = userDetails.getData().getAttributes().getEmail_address() + " [Verified]";
        else
            email = userDetails.getData().getAttributes().getEmail_address() + " [Not Verified]";
        email_sub_status = "Email subscription status : " + userDetails.getData().getAttributes().getEmail_subscription_status();

        tv_name.setText(name);
        tv_dob.setText(dob);
        tv_mobile.setText(mobile);
        tv_email.setText(email);
        tv_email_sub_status.setText(email_sub_status);

        setAccountDetails();
    }

    private void setAccountDetails() {
        AccountDetailsAdapter adapter = new AccountDetailsAdapter(userDetails.getIncluded());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);

        rcv_account_details.setLayoutManager(linearLayoutManager);
        rcv_account_details.setItemAnimator(new DefaultItemAnimator());
        rcv_account_details.setAdapter(adapter);
    }

    private void initiateComponent() {
        parseCollection = new ParseCollection(this);
        userDetails = parseCollection.getUserDetails();

        tv_name = findViewById(R.id.tv_name);
        tv_dob = findViewById(R.id.tv_dob);
        tv_mobile = findViewById(R.id.tv_mobile);
        tv_email = findViewById(R.id.tv_email);
        tv_email_sub_status = findViewById(R.id.tv_email_sub_status);
        rcv_account_details = findViewById(R.id.rcv_account_details);
    }
}
