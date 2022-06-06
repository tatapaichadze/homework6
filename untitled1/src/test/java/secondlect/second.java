package secondlect;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tatapc.chromrun;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class second extends chromrun {

    @Test

    public void ppp(){

        Selenide.open("https://www.google.ge/");
        Configuration.browserSize="1920x1088";
        SoftAssert soft=new SoftAssert();
         $(byName("Q")).setValue("other");
        soft.assertEquals($(byName(("Q")).getValue,"other");

        //თუ მინდა რომ არასწორი მნიშვნელობბა გადავცე მაშინ გაივლის და მეორე მნიშვნელობას ჩაწერს
        //მაგ:soft.assertEquals($(byName(("Q")).getValue,"her");

        $(byName("Q")).setValue("tata");
        sleep(3000);
        soft.assertAll();


    }
}
