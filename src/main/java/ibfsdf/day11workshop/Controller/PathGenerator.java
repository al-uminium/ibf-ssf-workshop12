package ibfsdf.day11workshop.Controller;

import java.util.ArrayList;
import java.util.List;

public class PathGenerator {
    public int generateRandomNumber() {
    return (int) ((Math.random() * (30 - 1)) + 1);
  }

  public List<String> generateImgPath(int num) {
    int counter = 0;
    List<String> listOfImgPaths = new ArrayList<>();
    while (true) {
      int number = generateRandomNumber();
      String imgPath = "/numbers/number" + number + ".jpg";
      if (counter == num) {
        break;
      }
      if (!listOfImgPaths.contains(imgPath)) {
        listOfImgPaths.add(imgPath);
        counter++;
      }
    }
    return listOfImgPaths;
  } 
}
