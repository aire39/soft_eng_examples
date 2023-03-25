public enum PizzaSize {
  SMALL("small"),
  MEDIUM("medium"),
  LARGE("large");

  private String sizeName;

  PizzaSize(String size_name) {
      this.sizeName = size_name;
  }

  public String GetSizeName() {
      return sizeName;
  }
}
