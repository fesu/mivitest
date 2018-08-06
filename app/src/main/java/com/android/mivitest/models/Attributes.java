package com.android.mivitest.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Faisal on 04-08-2018.
 */

public class Attributes {

    @SerializedName("payment-type")
    private String payment_type;
    @SerializedName("unbilled-charges")
    private String unbilled_charges;
    @SerializedName("next-billing-date")
    private String next_billing_date;
    private String title;
    @SerializedName("first-name")
    private String first_name;
    @SerializedName("last-name")
    private String last_name;
    @SerializedName("date-of-birth")
    private String date_of_birth;
    @SerializedName("contact-number")
    private String contact_number;
    @SerializedName("email-address")
    private String email_address;
    @SerializedName("email-address-verified")
    private Boolean email_address_verified;
    @SerializedName("email-subscription-status")
    private Boolean email_subscription_status;
    private Long msn;
    private String credit;
    @SerializedName("credit-expiry")
    private String credit_expiry;
    @SerializedName("data-usage-threshold")
    private Boolean data_usage_threshold;
    @SerializedName("included-data-balance")
    private String included_data_balance;
    @SerializedName("included-credit-balance")
    private String included_credit_balance;
    @SerializedName("included-rollover-credit-balance")
    private String included_rollover_credit_balance;
    @SerializedName("included-rollover-data-balance")
    private String included_rollover_data_balance;
    @SerializedName("included-international-talk-balance")
    private String included_international_talk_balance;
    @SerializedName("expiry-date")
    private String expiry_date;
    @SerializedName("auto-renewal")
    private Boolean auto_renewal;
    @SerializedName("primary-subscription")
    private Boolean primary_subscription;
    private String name;
    @SerializedName("included-data")
    private String included_data;
    @SerializedName("included-credit")
    private String included_credit;
    @SerializedName("included-international-talk")
    private String included_international_talk;
    @SerializedName("unlimited-text")
    private String unlimited_text;
    @SerializedName("unlimited-talk")
    private String unlimited_talk;
    @SerializedName("unlimited-international-text")
    private Boolean unlimited_international_text;
    @SerializedName("unlimited-international-talk")
    private Boolean unlimited_international_talk;
    private String price;

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getUnbilled_charges() {
        return unbilled_charges;
    }

    public void setUnbilled_charges(String unbilled_charges) {
        this.unbilled_charges = unbilled_charges;
    }

    public String getNext_billing_date() {
        return next_billing_date;
    }

    public void setNext_billing_date(String next_billing_date) {
        this.next_billing_date = next_billing_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public Boolean getEmail_address_verified() {
        return email_address_verified;
    }

    public void setEmail_address_verified(Boolean email_address_verified) {
        this.email_address_verified = email_address_verified;
    }

    public Boolean getEmail_subscription_status() {
        return email_subscription_status;
    }

    public void setEmail_subscription_status(Boolean email_subscription_status) {
        this.email_subscription_status = email_subscription_status;
    }

    public Long getMsn() {
        return msn;
    }

    public void setMsn(Long msn) {
        this.msn = msn;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCredit_expiry() {
        return credit_expiry;
    }

    public void setCredit_expiry(String credit_expiry) {
        this.credit_expiry = credit_expiry;
    }

    public Boolean getData_usage_threshold() {
        return data_usage_threshold;
    }

    public void setData_usage_threshold(Boolean data_usage_threshold) {
        this.data_usage_threshold = data_usage_threshold;
    }

    public String getIncluded_data_balance() {
        return included_data_balance;
    }

    public void setIncluded_data_balance(String included_data_balance) {
        this.included_data_balance = included_data_balance;
    }

    public String getIncluded_credit_balance() {
        return included_credit_balance;
    }

    public void setIncluded_credit_balance(String included_credit_balance) {
        this.included_credit_balance = included_credit_balance;
    }

    public String getIncluded_rollover_credit_balance() {
        return included_rollover_credit_balance;
    }

    public void setIncluded_rollover_credit_balance(String included_rollover_credit_balance) {
        this.included_rollover_credit_balance = included_rollover_credit_balance;
    }

    public String getIncluded_rollover_data_balance() {
        return included_rollover_data_balance;
    }

    public void setIncluded_rollover_data_balance(String included_rollover_data_balance) {
        this.included_rollover_data_balance = included_rollover_data_balance;
    }

    public String getIncluded_international_talk_balance() {
        return included_international_talk_balance;
    }

    public void setIncluded_international_talk_balance(String included_international_talk_balance) {
        this.included_international_talk_balance = included_international_talk_balance;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public Boolean getAuto_renewal() {
        return auto_renewal;
    }

    public void setAuto_renewal(Boolean auto_renewal) {
        this.auto_renewal = auto_renewal;
    }

    public Boolean getPrimary_subscription() {
        return primary_subscription;
    }

    public void setPrimary_subscription(Boolean primary_subscription) {
        this.primary_subscription = primary_subscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncluded_data() {
        return included_data;
    }

    public void setIncluded_data(String included_data) {
        this.included_data = included_data;
    }

    public String getIncluded_credit() {
        return included_credit;
    }

    public void setIncluded_credit(String included_credit) {
        this.included_credit = included_credit;
    }

    public String getIncluded_international_talk() {
        return included_international_talk;
    }

    public void setIncluded_international_talk(String included_international_talk) {
        this.included_international_talk = included_international_talk;
    }

    public String getUnlimited_text() {
        return unlimited_text;
    }

    public void setUnlimited_text(String unlimited_text) {
        this.unlimited_text = unlimited_text;
    }

    public String getUnlimited_talk() {
        return unlimited_talk;
    }

    public void setUnlimited_talk(String unlimited_talk) {
        this.unlimited_talk = unlimited_talk;
    }

    public Boolean getUnlimited_international_text() {
        return unlimited_international_text;
    }

    public void setUnlimited_international_text(Boolean unlimited_international_text) {
        this.unlimited_international_text = unlimited_international_text;
    }

    public Boolean getUnlimited_international_talk() {
        return unlimited_international_talk;
    }

    public void setUnlimited_international_talk(Boolean unlimited_international_talk) {
        this.unlimited_international_talk = unlimited_international_talk;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "payment_type='" + payment_type + '\'' +
                ", unbilled_charges='" + unbilled_charges + '\'' +
                ", next_billing_date='" + next_billing_date + '\'' +
                ", title='" + title + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", email_address='" + email_address + '\'' +
                ", email_address_verified=" + email_address_verified +
                ", email_subscription_status=" + email_subscription_status +
                ", msn=" + msn +
                ", credit='" + credit + '\'' +
                ", credit_expiry='" + credit_expiry + '\'' +
                ", data_usage_threshold=" + data_usage_threshold +
                ", included_data_balance='" + included_data_balance + '\'' +
                ", included_credit_balance='" + included_credit_balance + '\'' +
                ", included_rollover_credit_balance='" + included_rollover_credit_balance + '\'' +
                ", included_rollover_data_balance='" + included_rollover_data_balance + '\'' +
                ", included_international_talk_balance='" + included_international_talk_balance + '\'' +
                ", expiry_date='" + expiry_date + '\'' +
                ", auto_renewal='" + auto_renewal + '\'' +
                ", primary_subscription='" + primary_subscription + '\'' +
                ", name='" + name + '\'' +
                ", included_data='" + included_data + '\'' +
                ", included_credit='" + included_credit + '\'' +
                ", included_international_talk='" + included_international_talk + '\'' +
                ", unlimited_text='" + unlimited_text + '\'' +
                ", unlimited_talk='" + unlimited_talk + '\'' +
                ", unlimited_international_text=" + unlimited_international_text +
                ", unlimited_international_talk=" + unlimited_international_talk +
                ", price='" + price + '\'' +
                '}';
    }
}
