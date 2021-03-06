package com.makerfaireorlando.app.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by conner on 8/13/13.
 */
public class ProjectsList {

    @SerializedName("attend_link")
    public String attendLink;

    @SerializedName("sponsor_link")
    public String sponsorLink;

    @SerializedName("accepteds")
    public List<ProjectDetail> accepteds;

    @SerializedName("about_url")
    public String aboutUrl;

    @SerializedName("title")
    public String title;



}
