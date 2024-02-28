package com.nasa.nasaapp.controllers;

import com.nasa.nasaapp.restclient.NasaApodObject;
import com.nasa.nasaapp.restclient.NasaMrpObject;
import com.nasa.nasaapp.restclient.NasaRestclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1/nasa")
public class NasaController {

  @Autowired
  private NasaRestclient nasaRestclient;

  @CrossOrigin("http://localhost:4200")
  @GetMapping("apod")
  public List<NasaApodObject> getNasaApodObjects() {
    List<NasaApodObject> values = nasaRestclient.getNasaApodObjects();
    if(values == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "your query was not found");
    }
    return values;
  }

  @CrossOrigin("http://localhost:4200")
  @GetMapping("mrp/{rover}&{sol}")
  public List<NasaMrpObject> getNasaMrpObjects(@PathVariable String rover, @PathVariable int sol) {
    List<NasaMrpObject> values = nasaRestclient.getNasaMrpObjects(rover, sol);
    if(values == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "your query was not found");
    }
    return values;
  }
}
