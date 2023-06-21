package Screens;

import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;


public class LoginTest_IncorrectUsername {
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
      
        //Sets LoginPage  visible
        loginPage.setVisible(true);

      //Sets initial inputs of textField with incorrect username 
        username.setText("iecetitizzz");

        //Sets initial inputs of passwordField with correct password
        password.setText("pass1234");

    }

   //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the Login page after tests
        loginPage.dispose();
    }

    
    //Checks Login Button action event with incorrect username or password
    @Test
    public void testloginButtonIncorrectInformationPositive() {
        //Sets correct expected result of warningText message after the clicking Login button with correct username or password
        String exp_result = "Invalid password or username";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, welcomeText.getText());

    }
    
   //Checks Login Button action event with incorrect username or password
    @Test
    public void testloginButtonInCorrectInformationNegative() {
        //Sets incorrect expected result of warningText message after the clicking Login button with incorrect username or password
        String exp_result = "Hello World";

        //Runs Login Button action event
        loginButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, welcomeText.getText());
    }

}