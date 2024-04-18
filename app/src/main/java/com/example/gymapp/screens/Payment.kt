package com.example.gymapp.screens

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import com.example.gymapp.MainActivity
import com.razorpay.Checkout
import com.razorpay.PayloadHelper
import com.razorpay.PaymentResultListener
import org.json.JSONObject

class Payment {
    fun startPayment(context: Context,activity: Activity) {
        Checkout.preload(context)
        val co = Checkout()
        // apart from setting it in AndroidManifest.xml, keyId can also be set
        // programmatically during runtime
        co.setKeyID("rzp_test_7FxVinZRlo9EB2")


        val payloadHelper = PayloadHelper("INR", 100, "order_XXXXXXXXX")
        payloadHelper.name = "Gaurav Kumae"
        payloadHelper.description = "Description"
        payloadHelper.prefillEmail = "gaurav.kumar@example.com"
        payloadHelper.prefillContact = "9000090000"
        payloadHelper.prefillCardNum = "4111111111111111"
        payloadHelper.prefillCardCvv = "111"
        payloadHelper.prefillCardExp = "11/24"
        payloadHelper.prefillMethod = "card"
        payloadHelper.prefillName = "MerchantName"
        payloadHelper.sendSmsHash = true
        payloadHelper.retryMaxCount = 4
        payloadHelper.retryEnabled = true
        payloadHelper.color = "#000000"
        payloadHelper.allowRotation = true
        payloadHelper.rememberCustomer = true
        payloadHelper.timeout = 10
        payloadHelper.redirect = true
        payloadHelper.recurring = "1"
        payloadHelper.subscriptionCardChange = true
        payloadHelper.customerId = "cust_XXXXXXXXXX"
        payloadHelper.callbackUrl = "https://accepts-posts.request"
        payloadHelper.subscriptionId = "sub_XXXXXXXXXX"
        payloadHelper.modalConfirmClose = true
        payloadHelper.backDropColor = "#ffffff"
        payloadHelper.hideTopBar = true
        payloadHelper.notes = JSONObject("{\"remarks\":\"Discount to cusomter\"}")
        payloadHelper.readOnlyEmail = true
        payloadHelper.readOnlyContact = true
        payloadHelper.readOnlyName = true
        payloadHelper.image = "https://www.razorpay.com"
        // these values are set mandatorily during object initialization. Those values can be overridden like this
        payloadHelper.amount = 100
        payloadHelper.currency = "INR"
        payloadHelper.orderId = "order_XXXXXXXXXXXXXX"



        try {
            val options = JSONObject()
            options.put("name","Razorpay Corp")
            options.put("description","Demoing Charges")
            //You can omit the image option to fetch the image from the dashboard
            options.put("image","https://s3.amazonaws.com/rzp-mobile/images/rzp.jpg")
            options.put("theme.color", "#3399cc");
            options.put("currency","INR");
            options.put("order_id", "order_DBJOWzybf0sJbb");
            options.put("amount","50000")//pass amount in currency subunits

            val retryObj = JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            options.put("retry", retryObj);

            val prefill = JSONObject()
            prefill.put("email","gaurav.kumar@example.com")
            prefill.put("contact","9876543210")

            options.put("prefill",prefill)
            co.open(activity,options)
        }catch (e: Exception){
            Toast.makeText(activity,"Error in payment: "+ e.message,Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }




    class PaymentActivity : Activity(), PaymentResultListener {
        // ...
        override fun onPaymentError(errorCode: Int, response: String?) {
            Toast.makeText(this, "Payment failed", Toast.LENGTH_SHORT).show()
        }

        override fun onPaymentSuccess(razorpayPaymentId: String?) {
            Toast.makeText(this, "Payment successful", Toast.LENGTH_SHORT).show()
        }
    }
}
