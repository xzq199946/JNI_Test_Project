package com.example.testmyproject;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ActionBar {
    public static final int NAVIGATION_MODE_STANDARD = 0;
    public static final int NABIGATION_MODE_LIST = 1;
    public static final int NAVIGATION_MODE_TABS = 2;

    public @interface NavigationMode {}

    @NavigationMode
    public abstract int getNavigationMode();

    public abstract void setNavigationMode(@NavigationMode int mode);


}
