package com.example.pdffiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer = (PDFView)findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("1 Signals")){
            myPDFViewer.fromAsset("1_Signals.pdf").load();
        }
        if(getItem.equals("2 Object-Oriented Thinking")){
            myPDFViewer.fromAsset("2_Object-Oriented Thinking,pdf").load();
        }
        if(getItem.equals("18ce112_inheritance.docx")){
            myPDFViewer.fromAsset("18ce112_inheritance.docx.pdf").load();
        }
        if(getItem.equals("18ce112_Practical")){
            myPDFViewer.fromAsset("18ce112_Practical.pdf").load();
        }
        if(getItem.equals("Graph Theory")){
            myPDFViewer.fromAsset("graph theory.pdf").load();
        }
        if(getItem.equals("Java Practicals")){
            myPDFViewer.fromAsset("java practicals.pdf").load();
        }
        if(getItem.equals("Set Theory")){
            myPDFViewer.fromAsset("set theory.pdf").load();
        }
        if(getItem.equals("WEEK_2")){
            myPDFViewer.fromAsset("WEEK_2.pdf").load();
        }
    }
}
