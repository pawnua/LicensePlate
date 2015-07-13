package com.pawnua.android.app.licenseplates.model;

import android.graphics.Bitmap;

/**
 * Created by MiK on 14.06.2015.
 */
public class LicensePlate {
    private String region;
    private String code1995;

    private String series1995;
    private String series2004;
    private String series2013;
    private Bitmap flag;


    public LicensePlate(String region, String code1995, String series1995, String series2004, String series2013) {
        this.region = region;
        this.code1995 = code1995;
        this.series1995 = series1995;
        this.series2004 = series2004;
        this.series2013 = series2013;
    }

    public String getRegion() {
        return region;
    }

    public String getcode1995() {
        return code1995;
    }

    public String getSeries1995() {
        return series1995;
    }

    public String getSeries1995_short() {
        return series1995.substring(0,2);
    }

    public String getSeries2004() {
        return series2004;
    }

    public String getSeries2013() {
        return series2013;
    }

}
