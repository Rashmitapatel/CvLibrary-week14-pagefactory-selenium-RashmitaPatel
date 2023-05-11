package resources.testdata;

import org.testng.annotations.DataProvider;
public class TestData {
    @DataProvider(name = "job search Data")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow,Greater London","5 miles", "30000", "50000", "Per annum", "Permanent","Permanent Tester jobs in Harrow "},
                {"Manual tester", "Central London","5 miles", "30000", "40000", "Per annum", "Permanent","Permanent Manual Tester jobs in Central London"},
                {"IT Project Manager", "London", "7 miles", "40000", "50000", "Per annum", "Permanent","Permanent It Project Manager jobs in London"},
                {"IT Developer", "Birmingham", "10 miles", "40000", "60000", "Per annum", "Permanent","Permanent It Developer jobs in Birmingham"},
                {"Automation Tester", "Bristol(County)","15 miles", "40000", "50000", "Per annum", "Permanent","Permanent Automation Tester jobs in Bristol (County)"},
                {"Business analyst","Cardiff","10 miles", "30000", "60000", "Per annum", "Permanent","Permanent Business Analyst jobs in Cardiff"}
                   };
        return data;
    }
}