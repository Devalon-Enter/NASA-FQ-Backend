package com.nasa.nasaapp.restclient;

import com.nasa.nasaapp.NasaMrp;

public class NasaMrpObject {
  private final int id;
  private final NasaMrp.Photos.Camera camera;
  private final String img_src;
  private final String earth_date;
  private final NasaMrp.Photos.Rover rover;

  public NasaMrpObject(int id, NasaMrp.Photos.Camera camera, String img_src, String earth_date, NasaMrp.Photos.Rover rover) {
    this.id = id;
    this.camera = camera;
    this.img_src = img_src;
    this.earth_date = earth_date;
    this.rover = rover;
  }

  public int getId() {
    return id;
  }

  public NasaMrp.Photos.Camera getCamera() {
    return camera;
  }

  public String getImg_src() {
    return img_src;
  }

  public String getEarth_date() {
    return earth_date;
  }

  public NasaMrp.Photos.Rover getRover() {
    return rover;
  }
}

