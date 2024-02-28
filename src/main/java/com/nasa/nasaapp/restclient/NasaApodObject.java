package com.nasa.nasaapp.restclient;

public class NasaApodObject {
  private String id;
  private String title;
  private String date;
  private String url;
  private String explanation;
  private String copyright;
  public NasaApodObject(String id, String title, String date, String url, String explanation, String copyright) {
    this.id = id;
    this.title = title;
    this.date = date;
    this.url = url;
    this.explanation = explanation;
    this.copyright = copyright;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDate() {
    return date;
  }

  public String getUrl() {
    return url;
  }

  public String getExplanation() {
    return explanation;
  }

  public String getCopyright() {
    return copyright;
  }
}
