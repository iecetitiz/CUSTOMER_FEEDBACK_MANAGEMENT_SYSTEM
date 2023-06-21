package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LoginTest_MissingPassword {
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
       
        //Sets initial inputs of username with correct username
        username.setText("ptunc");

        //Sets initial inputs of password with empty space
        password.setText("");

    }

    //Runs after each test method
    @After
    public void tearDown() {
      //Dispose the Login page after tests
        loginPage.dispose();
    }

    //Checks Login Button action event with empty username and password field
    @Test
    public void testMissingPasswordPositive() {
        //Sets correct expected result of warningText message after the clicking Login button with incorrect username or password
        String exp_result = "Username and password can not be empty!";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, welcomeText.getText());
    }

    //Checks Login Button action event with empty username and password field
    @Test
    public void testMissingPasswordNegative() {
        //Sets incorrect expected result of warningText message after the clicking Login button with empty username and password field
        String exp_result = "Hello World";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, welcomeText.getText());
    }
}
