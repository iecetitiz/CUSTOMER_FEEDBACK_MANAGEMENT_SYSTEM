package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class RegistrationTest_AlreadyExistsUsername {

    //Creates Registration page
    Registration registrationPage = new Registration();

    //Creates JLabel named "username" from the Registration page
    JTextField username = (JTextField) TestUtils.getChildNamed(registrationPage, "username");

    //Creates JLabel named "email" from the Registration page
    JTextField email = (JTextField) TestUtils.getChildNamed(registrationPage, "email");

    //Creates JPasswordField named "password" from the Registration page
    JPasswordField password = (JPasswordField) TestUtils.getChildNamed(registrationPage, "password");

    //Creates JTextField named "warningText" from the Registration page
    JLabel warningText = (JLabel) TestUtils.getChildNamed(registrationPage, "warningText");

    //Creates JButton named "signUpButton" from theRegistration page
    JButton signUp = (JButton) TestUtils.getChildNamed(registrationPage, "signUpButton");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {

        //Sets initial username as "aaslan"
        username.setText("aaslan");

        //Sets initial email as "aaaslan@gmail.com"
        email.setText("aaaslan@gmail.com");

        //Sets initial password with 8 length password
        password.setText("pass1234");

    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the Registration page after tests
        registrationPage.dispose();
    }

    //Checks Sign Up button action event with existing username with correct expected result
    @Test
    public void testSignUpButtonAlreadyExistsUsernamePositive() {
        //Sets correct expected result 
        String exp_result = "Username or email is already exists!";

        //Runs Sign Up Button action event
        signUp.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

  //Checks Sign Up button action event with existing username with incorrect expected result
    @Test
    public void testSignUpButtonAlreadyExistsUsernameNegative() {
        //Sets incorrect expected result 
        String exp_result = "Hello World";

        //Runs Sign Up Button action event
        signUp.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }

}
