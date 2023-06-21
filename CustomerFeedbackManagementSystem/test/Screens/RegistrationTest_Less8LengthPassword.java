package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class RegistrationTest_Less8LengthPassword {

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

        //Sets initial username that does not exist 
        username.setText("new_user111");

        //Sets initial email that does not exist
        email.setText("new_user1111@gmail.com");

        //Sets initial inputs of password with less than 8 length password
        password.setText("pass12");

    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the Registration page after tests
        registrationPage.dispose();
    }

    //Checks Sign Up button action event with less then 8 characters password and correct expected result
    @Test
    public void testSignUpButtonLess8PasswordPositive() {
        //Sets correct expected result 
        String exp_result = "Password should be at least 8 characters!";

        //Runs Sign Up Button action event
        signUp.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

    //Checks Sign Up button action event with less then 8 characters password and incorrect expected result
    @Test
    public void testSignUpButtonLess8PasswordNegative() {
        //Sets incorrect expected result 
        String exp_result = "Hello World";

        //Runs Sign Up Button action event
        signUp.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }

}
