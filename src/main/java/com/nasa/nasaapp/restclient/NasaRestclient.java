package com.nasa.nasaapp.restclient;

import com.nasa.nasaapp.NasaApod;
import com.nasa.nasaapp.NasaMrp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class NasaRestclient {
  @Value("${token}")
  private String token;
  private RestTemplate restTemplate;

  public NasaRestclient(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public List<NasaApodObject> getNasaApodObjects() {
    String baseURL = "https://api.nasa.gov/planetary/apod?api_key=";
    ResponseEntity<List<NasaApod>> apodObjects = restTemplate.exchange(
            baseURL + token + "&count=3", HttpMethod.GET, new HttpEntity<>(new HttpHeaders()),  new ParameterizedTypeReference<>() {}
    );

    List<NasaApodObject> nasaApodObjects = new ArrayList<>();

    if(apodObjects.getBody() != null) {
      for(NasaApod apodObject: apodObjects.getBody()) {
        nasaApodObjects.add( new NasaApodObject(
                URLEncoder.encode(apodObject.getTitle(), StandardCharsets.UTF_8),
                apodObject.getTitle(),
                apodObject.getDate(),
                apodObject.getUrl(),
                apodObject.getExplanation(),
                apodObject.getCopyright())
        );
      }
    }
    return nasaApodObjects;
  }

  public List<NasaMrpObject> getNasaMrpObjects(String rover, int sol) {
    String baseURL = "https://api.nasa.gov/mars-photos/api/v1/rovers/" + rover + "/photos?sol=" + sol + "&page=1&api_key=";
    ResponseEntity<NasaMrp> mrpObjects = restTemplate.exchange(
            baseURL + token, HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), new ParameterizedTypeReference<>() {}
    );

    List<NasaMrpObject> nasaMrpObjects = new ArrayList<>();

    if(mrpObjects.getBody() != null) {
      for(int i = 0; i < mrpObjects.getBody().getPhotos().size(); i++) {
        nasaMrpObjects.add(new NasaMrpObject(
          mrpObjects.getBody().getPhotos().get(i).getId(),
          mrpObjects.getBody().getPhotos().get(i).getCamera(),
          mrpObjects.getBody().getPhotos().get(i).getImg_src(),
          mrpObjects.getBody().getPhotos().get(i).getEarth_date(),
          mrpObjects.getBody().getPhotos().get(i).getRover()
        ));
      }
    }
    return nasaMrpObjects;
  }
}

