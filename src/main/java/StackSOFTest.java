/**
 * Created by hackx on 11/8/16.
 */
public class StackSOFTest {

    public void stackLeak(){
        stackLeak();
    }

    public static void main(String[] args) {
        StackSOFTest stackSOFTest = new StackSOFTest();
        stackSOFTest.stackLeak();
    }
}
