package com.example.demo.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hotel implements Comparable<Hotel>{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column
  private String name;

  @Column
  private int rate;

  @Column
  private Integer price;

  @Column
  private String city;

  @Column
  private String description;

  @Column
  private String imagePath;

  @Column
  private int stars;

  @ManyToOne
  private Category category = new Category();

  @Column
  private boolean parking;

  @Column
  private boolean restaurant;

  @Column
  private boolean pets;

  @Column
  private boolean smoking;

  @Column
  private boolean swimmingPool;

  @Column
  private boolean beachFront;

  @Column
  private boolean airConditioning;

  @Column
  private boolean freeWiFi;

  @Column
  private boolean sauna;

  @Column
  private boolean fitness;

  public Hotel(String name, String city, int rate, String imagePath,  String description, Integer price,  int stars, Category category,
               boolean parking, boolean restaurant, boolean pets, boolean smoking, boolean swimmingPool, boolean beachFront,
               boolean airConditioning, boolean freeWifi, boolean sauna, boolean fitness) {
    this.rate = rate;
    this.name = name;
    this.price = price;
    this.city = city;
    this.description = description;
    this.imagePath = imagePath;
    this.stars = stars;
    this.category = category;
    this.parking = parking;
    this.restaurant = restaurant;
    this.pets = pets;
    this.smoking = smoking;
    this.swimmingPool = swimmingPool;
    this.beachFront = beachFront;
    this.airConditioning = airConditioning;
    this.freeWiFi = freeWifi;
    this.sauna = sauna;
    this.fitness = fitness;

    //this.category = category;
  }

  public Hotel(String name) {
    this.name = name;
  }
  public Hotel() {
  }

  public String getName(){
    return this.name;
  }
  public int getRate(){
    return this.rate;
  }
  public Integer getPrice(){
    return this.price;
  }
  public String getCity(){
    return this.city;
  }
  public String getDescription(){
    return this.description;
  }
  public String getImage(){
    return this.imagePath;
  }
  public int getStars(){
    return this.stars;
  }
  public Category getCategory(){
    return this.category;
  }
  public boolean getParking(){return this.parking;}
  public boolean getRestauran(){return this.restaurant;}
  public boolean getPets(){return this.pets;}
  public boolean getSmoking(){return this.smoking;}
  public boolean getSwimmingPool(){return this.swimmingPool;}
  public boolean getBeachFront(){return this.beachFront;}
  public boolean getAirConditioning(){return this.airConditioning;}
  public boolean getFreeWiFi(){return this.freeWiFi;}
  public boolean getSauna(){return this.sauna;}
  public boolean getFitness(){return this.fitness;}
  public void setName(String name){
    this.name = name;
  }
  public void setRate(int rate){
    this.rate = rate;
  }
  public void setPrice(Integer price){
    this.price = price;
  }
  public void setCity(String city){
    this.city = city;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public void setImage(String imagePath){
    this.imagePath = imagePath;
  }
  public void setStars(int stars){
    this.stars = stars;
  }
  public void setCategory(Category category){
    this.category = category;
  }
  public void setParking(boolean parking){this.parking = parking;}
  public void setRestauran(boolean restaurant){this.restaurant = restaurant;}
  public void setPets(boolean pets){this.pets = pets;}
  public void setSmoking(boolean smoking){this.smoking = smoking;}
  public void setSwimmingPool(boolean swimmingPool){this.swimmingPool = swimmingPool;}
  public void setBeachFront(boolean beachFront){this.beachFront = beachFront;}
  public void setAirConditioning(boolean airConditioning){this.airConditioning = airConditioning;}
  public void setFreeWiFi(boolean freeWiFi){this.freeWiFi = freeWiFi;}
  public void setSauna(boolean sauna){this.sauna = sauna;}
  public void setFitness(boolean fitness){ this.fitness = fitness;}


  @Override
  public int compareTo(Hotel hotel) {
    return this.getPrice().compareTo(hotel.getPrice());
  }
}
