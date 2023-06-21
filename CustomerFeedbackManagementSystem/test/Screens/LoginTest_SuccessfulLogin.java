package Screens;

import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LoginTest_SuccessfulLogin {

    //Creates Login page
    LoginPage loginPage = new LoginPage();

    //Creates JTextField which is name "textField" from the LoginPage
    JTextField username = (JTextField) TestUtils.getChildNamed(loginPage, "username");

    //Creates JPasswordField which is name "passwordField" from the LoginPage
    JPasswordField password = (JPasswordField) TestUtils.getChildNamed(loginPage, "password");

    //Creates JButton which is name "loginButton" from the LoginPage
    JButton loginButton = (JButton) TestUtils.getChildNamed(loginPage, "loginButton");

    //Creates JLabel which is name "welcome_text" from the LoginPage
    JLabel welcomeText = (JLabel) TestUtils.getChildNamed(loginPage, "welcomeText");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {

        //Sets initial inputs of textField with correct username 
        username.setText("iecetitiz");

        //Sets initial inputs of passwordField with correct password
        password.setText("pass1234");

    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the Login page after tests
        loginPage.dispose();
    }

    //Checks Login Button action event with correct username and password and correct expected result
    @Test
    public void testloginButtonSuccessflLoginPositive() {
        //Sets correct expected result 
        String exp_result = "Welcome...";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, welcomeText.getText());

    }

    //Checks Login Button action event with correct username and password and incorrect expected result
    @Test
    public void testloginButtonSuccessflLoginNegative() {
        //Sets incorrect expected result 
        String exp_result = "Hello World";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, welcomeText.getText());
    }
}
