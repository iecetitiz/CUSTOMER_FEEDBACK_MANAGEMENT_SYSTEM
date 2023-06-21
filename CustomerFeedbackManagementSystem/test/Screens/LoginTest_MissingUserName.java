package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LoginTest_MissingUserName {
   //Creates LoginPage
    LoginPage loginPage = new LoginPage();

    //Creates JTextField which is name "username" from the LoginPage
    JTextField username = (JTextField) TestUtils.getChildNamed(loginPage, "username");

    //Creates JPasswordField which is name "password" from the LoginPage
    JPasswordField password = (JPasswordField) TestUtils.getChildNamed(loginPage, "password");

    //Creates JButton which is name "loginButton" from the LoginPage
    JButton loginButton = (JButton) TestUtils.getChildNamed(loginPage, "loginButton");

    //Creates JLabel which is name "welcomeText" from the LoginPage
    JLabel welcomeText = (JLabel) TestUtils.getChildNamed(loginPage, "welcomeText");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {
       

        //Sets initial inputs of textField with empty space 
        username.setText("");

        //Sets initial inputs of passwordField with correct password
        password.setText("pass123");

    }

    //Runs after each test method
    @After
    public void tearDown() {
       //Dispose the Login page after tests
        loginPage.dispose();
    }

    //Checks Login Button action event with empty username and password field and correct expected result
    @Test
    public void testloginButtonEmptyFieldPositive() {
        //Sets correct expected result 
        String exp_result = "Username and password can not be empty!";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, welcomeText.getText());
    }

    //Checks Login Button action event with empty username and password field and incorrect expected result
    @Test
    public void testloginButtonEmptyFieldNegative() {
        //Sets incorrect expected result
        String exp_result = "Hello World";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, welcomeText.getText());
    }
}
