package io.caster.wickedcool;


import android.app.Application;

public abstract class CasterApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
    }


    public abstract void init();
}
