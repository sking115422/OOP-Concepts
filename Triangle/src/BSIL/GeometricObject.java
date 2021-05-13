// Class:        CS5000
// Term:         Summer 2020
// Name:         Spencer King
// Instructor:   Dr. Haddad
// Assignment:   10 - P1
// IDE:          IntelliJ IDEA


package BSIL;

public abstract class GeometricObject {

  private String color = "White";
  private boolean filled;
  private java.util.Date dateCreated;

  // Construct a default geometric object
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  // Construct a geometric object with color and filled value
  protected GeometricObject(String newColor, boolean newFilled) {
    dateCreated = new java.util.Date();
    color = newColor;
    filled = newFilled;
  }

  // Return color
  public String getColor() {
    return color;
  }

  // Set a new color
  public void setColor(String newColor) {
    color = newColor;
  }

  // Return fill status
  public boolean isFilled() {
    return filled;
  }

  // Set a new fill status
  public void setFilled(boolean newFilled) {
    filled = newFilled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}