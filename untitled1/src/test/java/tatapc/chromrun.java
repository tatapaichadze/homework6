package tatapc;
  //mport com.codeborne.selenide.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
  //port com.codeborne.selenide;


public class chromrun {

     @BeforeTest

    public void setup(){
        Selenide.open("https://www.google.ge/");
         Configuration.browserSize="1920x1088";  




    }
}
