package com.nasa.nasaapp;

import java.util.List;

public class NasaMrp {
  private List<Photos> photos;

  public NasaMrp() {

  }

  public List<Photos> getPhotos() {
    return photos;
  }

  public static class Photos {
    private int id;
    private int sol;
    private Camera camera;
    private String img_src;
    private String earth_date;
    private Rover rover;

    public int getId() {
      return id;
    }

    public int getSol() {
      return sol;
    }

    public Camera getCamera() {
      return camera;
    }

    public String getImg_src() {
      return img_src;
    }

    public String getEarth_date() {
      return earth_date;
    }

    public Rover getRover() {
      return rover;
    }

    public static class Camera {
      private int id;
      private String name;
      private int rover_id;
      private String full_name;

      public int getId() {
        return id;
      }

      public String getName() {
        return name;
      }

      public int getRover_id() {
        return rover_id;
      }

      public String getFull_name() {
        return full_name;
      }
    }

    public static class Rover {
      private int id;
      private String name;
      private String landing_date;
      private String launch_date;
      private String status;
      private int max_sol;
      private String max_date;
      private int total_photos;
      private List<Camera> cameras;

      public int getId() {
        return id;
      }

      public String getName() {
        return name;
      }

      public String getLanding_date() {
        return landing_date;
      }

      public String getLaunch_date() {
        return launch_date;
      }

      public String getStatus() {
        return status;
      }

      public int getMax_sol() {
        return max_sol;
      }

      public String getMax_date() {
        return max_date;
      }

      public int getTotal_photos() {
        return total_photos;
      }

      public List<Camera> getCameras() {
        return cameras;
      }
    }
  }
}

