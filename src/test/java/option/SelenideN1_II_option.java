package option;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;


public class SelenideN1_II_option {
 /*2. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()

 - Откройте https://the-internet.herokuapp.com/drag_and_drop
            - Перенесите прямоугольник А на место В
 - Проверьте, что прямоугольники действительно поменялись
 - В Selenide есть команда $(element).dragAndDrop($(to-element)),
    проверьте работает ли тест, если использовать её вместо actions()*/

@Test
    void Sn1HwTest2(){
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo("#column-b");
    $("#column-a").shouldHave(Condition.text("B"));
    $("#column-b").shouldHave(Condition.text("A"));

}


}
