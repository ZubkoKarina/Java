package java_24;

class CatDetails {
  private String name; 
  private String breed;
  private String email;
  private int catlives;
  private long phone;
  private String city;
  private boolean likesMice;
  
  public CatDetails(String name, String breed, String email, int catlives, long phone,
      String city, boolean likesMice) {
    super();
    this.name = name;
    this.email = email;
    this.catlives = catlives;
    this.phone = phone;
    this.city = city;
    this.likesMice = likesMice;   
    this.breed = breed;}
//getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
public String getBreed() {
    return breed;
}
public void setBreed(String breed) {
    this.breed = breed;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public int getCatlives() {
    return catlives;
}
public void setCatlives(int catlives) {
    this.catlives = catlives;
}
public long getPhone() {
    return phone;
}
public void setPhone(long phone) {
    this.phone = phone;
}
public String getCity() {
    return city;
}
  
public void setCity(String city) {
    this.city = city;
}
public boolean isLikesMice() {
    return likesMice;
}
public void setLikesMice(boolean likesMice) {
    this.likesMice = likesMice;
}
}