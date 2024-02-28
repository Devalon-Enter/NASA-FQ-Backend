package com.nasa.nasaapp;

import java.util.List;

public class NasaApod {
  private List<String> resource;
  private boolean concept_tags;
  private String title;
  private String date;
  private String url;
  private String hdurl;
  private String media_type;
  private String explanation;
  private List<String> conepts;
  private String thumbnail_url;
  private String copyright;
  private String service_version;

  public NasaApod(
          List<String> resource,
          boolean concept_tags,
          String title,
          String date,
          String url,
          String hdurl,
          String media_type,
          String explanation,
          List<String> conepts,
          String thumbnail_url,
          String copyright,
          String service_version
  ) {
    this.resource = resource;
    this.concept_tags = concept_tags;
    this.title = title;
    this.date = date;
    this.url = url;
    this.hdurl = hdurl;
    this.media_type = media_type;
    this.explanation = explanation;
    this.conepts = conepts;
    this.thumbnail_url = thumbnail_url;
    this.copyright = copyright;
    this.service_version = service_version;
  }

  public List<String> getResource() {
    return resource;
  }

  public boolean isConcept_tags() {
    return concept_tags;
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

  public String getHdurl() {
    return hdurl;
  }

  public String getMedia_type() {
    return media_type;
  }

  public String getExplanation() {
    return explanation;
  }

  public List<String> getConepts() {
    return conepts;
  }

  public String getThumbnail_url() {
    return thumbnail_url;
  }

  public String getCopyright() {
    return copyright;
  }

  public String getService_version() {
    return service_version;
  }

  @Override
  public String toString() {
    return "NasaAdop{" +
            "resource=" + resource +
            ", concept_tags=" + concept_tags +
            ", title='" + title + '\'' +
            ", date='" + date + '\'' +
            ", url='" + url + '\'' +
            ", hdurl='" + hdurl + '\'' +
            ", media_type='" + media_type + '\'' +
            ", explanation='" + explanation + '\'' +
            ", conepts=" + conepts +
            ", thumbnail_url='" + thumbnail_url + '\'' +
            ", copyright='" + copyright + '\'' +
            ", service_version='" + service_version + '\'' +
            '}';
  }
}
