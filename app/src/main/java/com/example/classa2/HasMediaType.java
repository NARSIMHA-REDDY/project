
package com.example.classa2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HasMediaType {

    @SerializedName("_about")
    @Expose
    private String about;
    @SerializedName("label")
    @Expose
    private String label;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
