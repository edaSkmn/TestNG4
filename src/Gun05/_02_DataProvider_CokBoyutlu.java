package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "getData")
    void LoginTest(String userName, String password)
    {
        System.out.println("userName = " + userName+", password = "+password);
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] logins={
                {"Hasan","1223232" },
                {"Birkan","wewewe334"},
                {"Metin","ssds3434" },
                {"Ufuk","as3443s3434" }
        };

        return logins;
    }
}
