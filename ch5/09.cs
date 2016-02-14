// C#
public class Car {

  public string Make { get; private set; }
  public string Model { get; private set; }
  public int Year { get; private set; }
  public string Plate { get; set; }

  public Car(string make, string model, int year = -1, string plate = String.Empty) {
    Make = make;
    Model = model;
    Year = year;
    Plate = plate;
  }
}

// The Scala version is ~33% the size of the c# code
