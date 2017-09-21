package com.magento.pages;


import com.magento.database.DbUtils;
import com.magento.webControls.ButtonControl;
import com.magento.webControls.TextFieldsControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dotcom on 4/29/17.
 */
public class AccountPage extends BasePage{

    @FindBy(how = How.ID, using = "email")
    private WebElement usernameElement = null;
    @FindBy(id = "pass")
    private WebElement passwordElement = null;
    @FindBy(id = "send2")
    private WebElement submitButton = null;

    private static Map<String, String> data = new HashMap<String, String>();

    public AccountPage(WebDriver expectedDriver) {
        super(expectedDriver);
    }


    public WelcomePage loginWith(String username, String password) {
        TextFieldsControl.enterText(usernameElement, username);
        TextFieldsControl.enterText(passwordElement, password);
        ButtonControl.clickButton(submitButton);
        return PageFactory.initElements(driver, WelcomePage.class);
    }


    private void getTeacherDetails(){
        try {
            String query = "SELECT * FROM [SchoolDB].[dbo].[Teacher];";
            ResultSet result = DbUtils.runQuery(query);
            int a = 1;
            while (result.next()){
                String id = result.getString("ID");
                String firstname = result.getString("FirstName");
                String lastname = result.getString("LastName");
                String gender = result.getString("Gender");
                String age = result.getString("Age");
                String salary = result.getString("Salary");
                String mobileNumber = result.getString("Mobile");

                data.put("Email"+a, id);
                data.put("FirstName"+a, firstname);
                data.put("LastName"+a, lastname);
                data.put("Gender"+a, gender);
                data.put("Age"+a, age);
                data.put("Salary"+a, salary);
                data.put("MobileNumber"+a, mobileNumber);
                a++;
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private void getDataFromProcedure() {
        String query = "CALL get_customers_info();";
        try {
            ResultSet result = DbUtils.runStoredProcedure(query);
            while(result.next()){
                String custID = result.getString("CustomerID");
                String names = result.getString("CustomerFirstName");
                System.out.println(custID +  " " + names);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getData(){
        try {
            String query = "SELECT * FROM magento.userdetails;";
            ResultSet result = DbUtils.runQuery(query);
            int a = 1;
            while (result.next()){
                String firstname = result.getString("firstname");
                String lastname = result.getString("lastname");
                String email = result.getString("email");
                data.put("Email"+a, email);
                data.put("FirstName"+a, firstname);
                data.put("LastName"+a, lastname);
                a++;
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
