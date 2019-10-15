
package com.example.classa2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryTopic {

    @SerializedName("_about")
    @Expose
    private String about;
    @SerializedName("hasExtent")
    @Expose
    private String hasExtent;
    @SerializedName("creator")
    @Expose
    private Creator creator;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("subject")
    @Expose
    private List<Subject> subject = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("ISBN10")
    @Expose
    private String iSBN10;
    @SerializedName("hasCarrierType")
    @Expose
    private HasCarrierType hasCarrierType;
    @SerializedName("hasContentType")
    @Expose
    private HasContentType hasContentType;
    @SerializedName("hasMediaType")
    @Expose
    private HasMediaType hasMediaType;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("datePublished")
    @Expose
    private String datePublished;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("BNBNumber")
    @Expose
    private String bNBNumber;
    @SerializedName("publication")
    @Expose
    private Publication publication;
    @SerializedName("type")
    @Expose
    private List<String> type = null;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("sameAs")
    @Expose
    private String sameAs;
    @SerializedName("isPrimaryTopicOf")
    @Expose
    private String isPrimaryTopicOf;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getHasExtent() {
        return hasExtent;
    }

    public void setHasExtent(String hasExtent) {
        this.hasExtent = hasExtent;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN10() {
        return iSBN10;
    }

    public void setISBN10(String iSBN10) {
        this.iSBN10 = iSBN10;
    }

    public HasCarrierType getHasCarrierType() {
        return hasCarrierType;
    }

    public void setHasCarrierType(HasCarrierType hasCarrierType) {
        this.hasCarrierType = hasCarrierType;
    }

    public HasContentType getHasContentType() {
        return hasContentType;
    }

    public void setHasContentType(HasContentType hasContentType) {
        this.hasContentType = hasContentType;
    }

    public HasMediaType getHasMediaType() {
        return hasMediaType;
    }

    public void setHasMediaType(HasMediaType hasMediaType) {
        this.hasMediaType = hasMediaType;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBNBNumber() {
        return bNBNumber;
    }

    public void setBNBNumber(String bNBNumber) {
        this.bNBNumber = bNBNumber;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSameAs() {
        return sameAs;
    }

    public void setSameAs(String sameAs) {
        this.sameAs = sameAs;
    }

    public String getIsPrimaryTopicOf() {
        return isPrimaryTopicOf;
    }

    public void setIsPrimaryTopicOf(String isPrimaryTopicOf) {
        this.isPrimaryTopicOf = isPrimaryTopicOf;
    }

}
