
package com.example.classa2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mainbook {

    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("result")
    @Expose
    private Result result;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
