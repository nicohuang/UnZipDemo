package com.hwz.unzipdemo;

import android.app.Activity;
import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            ZipFileHelper.unZipFile("filePath+fileName","unZipPath");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
