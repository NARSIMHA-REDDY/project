
package com.example.classa2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("_about")
    @Expose
    private String about;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("definition")
    @Expose
    private String definition;
    @SerializedName("extendedMetadataVersion")
    @Expose
    private String extendedMetadataVersion;
    @SerializedName("inDataset")
    @Expose
    private String inDataset;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("primaryTopic")
    @Expose
    private PrimaryTopic primaryTopic;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExtendedMetadataVersion() {
        return extendedMetadataVersion;
    }

    public void setExtendedMetadataVersion(String extendedMetadataVersion) {
        this.extendedMetadataVersion = extendedMetadataVersion;
    }

    public String getInDataset() {
        return inDataset;
    }

    public void setInDataset(String inDataset) {
        this.inDataset = inDataset;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public PrimaryTopic getPrimaryTopic() {
        return primaryTopic;
    }

    public void setPrimaryTopic(PrimaryTopic primaryTopic) {
        this.primaryTopic = primaryTopic;
    }

}
