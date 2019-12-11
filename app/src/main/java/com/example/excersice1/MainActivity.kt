package com.example.excersice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calCar(view: View){
        val carPrice = findViewById<EditText>(R.id.editTextCarPrice).text.toString().toInt();
        val downPayment = findViewById<EditText>(R.id.editTextDownPayment).text.toString().toInt();
        val loanPeriod = findViewById<EditText>(R.id.editTextLoanPeriod).text.toString().toInt();
        val rate = findViewById<EditText>(R.id.editTextInterestRate).text.toString().toInt();
        val clTxtView = findViewById<TextView>(R.id.textViewLoan);
        val itTxtView = findViewById<TextView>(R.id.textViewInterest);
        val mrTxtView = findViewById<TextView>(R.id.textViewMonthlyRepayment);
        val carLoan = (carPrice-downPayment);
        val interest = (carLoan*rate*loanPeriod);
        val monthRepay = (carLoan+interest)/loanPeriod/12;
        /*val clTxtView = findViewById<TextView>(R.id.textViewLoan);
        val itTxtView = findViewById<TextView>(R.id.textViewInterest);
        val mrTxtView = findViewById<TextView>(R.id.textViewMonthlyRepayment);*/
        clTxtView.setText("Loan: "+carLoan);
        itTxtView.setText("Interest : "+interest);
        mrTxtView.setText("Monthly Repayment : "+monthRepay);
    }
    fun clear1(view: View){
        val carPrice = findViewById<EditText>(R.id.editTextCarPrice);
        val downPayment = findViewById<EditText>(R.id.editTextDownPayment);
        val loanPeriod = findViewById<EditText>(R.id.editTextLoanPeriod);
        val rate = findViewById<EditText>(R.id.editTextInterestRate);
        val clTxtView = findViewById<TextView>(R.id.textViewLoan);
        val itTxtView = findViewById<TextView>(R.id.textViewInterest);
        val mrTxtView = findViewById<TextView>(R.id.textViewMonthlyRepayment);
        carPrice.setText("");
        downPayment.setText("");
        loanPeriod.setText("");
        rate.setText("");
        clTxtView.setText("Loan :");
        itTxtView.setText("Interest :");
        mrTxtView.setText("Monthly Repayment :");
    }
}
