package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class LoginTest_3TimesWrongAttempts {

    //Creates LoginPage
    LoginPage loginPage = new LoginPage();

    //Creates JTextField named "username" from the LoginPage
    JTextField username = (JTextField) TestUtils.getChildNamed(loginPage, "username");

    //Creates JPasswordField named "password" from the LoginPage
    JPasswordField password = (JPasswordField) TestUtils.getChildNamed(loginPage, "password");

    //Creates JButton named "loginButton" from the LoginPage
    JButton loginButton = (JButton) TestUtils.getChildNamed(loginPage, "loginButton");

    //Creates JLabel named "welcome_text" from the LoginPage
    JLabel welcomeText = (JLabel) TestUtils.getChildNamed(loginPage, "welcomeText");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {
        //Sets initial inputs of username with incorrect username
        username.setText("iecetitizz");

        //Sets initial inputs of password with incorrect password
        password.setText("pass12345");

        //Sets initial wrong username or password counter as 4
        loginPage.setCounter(3);
    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the Login page after tests
        loginPage.dispose();
    }

    //Checks Login Button action event with 3 times wrong attemts and correct expected result
    @Test
    public void testloginButton3WrongAttamptPositive() {
        //Sets correct expected result
        String exp_result = "Enter Activation Code";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, welcomeText.getText());
    }

   //Checks Login Button action event with 3 times wrong attemts and incorrect result
    @Test
    public void testloginButton3WrongAttamptNegative() {
        //Sets incorrect expected result 
        String exp_result = "Hello World";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, welcomeText.getText());
    }

}
