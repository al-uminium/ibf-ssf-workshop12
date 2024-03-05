package ibfsdf.day11workshop.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RandomCardController {

  @RequestMapping(path="/randomcards", method = RequestMethod.POST)
  public String getRandomNumbers(Model model, @RequestBody String request) {
    String[] splitRequest = request.split("&");
    String[] keyValuePair = splitRequest[0].split("=");
    Integer number = Integer.valueOf(keyValuePair[1]);
    List<String> listOfPaths = (new PathGenerator()).generateImgPath(number);
    model.addAttribute("number", number);
    model.addAttribute("listOfPaths", listOfPaths);
    return "randomcards";
  }

}
