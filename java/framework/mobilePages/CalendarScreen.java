package framework.mobilePages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CalendarScreen extends MobileBasePage {

    @AndroidFindBy(id = "com.google.android.calendar:id/floating_action_button")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement addButton;

    @AndroidFindBy(xpath = "com.google.android.calendar:id/speed_dial_title[@content-desc='Reminder button']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement reminderButton;


    @AndroidFindBy(id = "com.google.android.calendar:id/title_edit_text")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement writeInForReminder;



    public void tapOnaddButton() {
        tapOn(addButton);
    }

    public void clickOnReminder(){

        tapOn(reminderButton);
    }

    public void writeMessage(){
        setValue(writeInForReminder,"Practice,Practice");
    }
}
