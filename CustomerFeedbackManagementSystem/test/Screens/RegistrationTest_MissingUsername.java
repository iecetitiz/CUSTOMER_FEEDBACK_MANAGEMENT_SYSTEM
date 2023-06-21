package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class RegistrationTest_MissingUsername {

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

        //Sets initial username as empty 
        username.setText("");

        //Sets initial email 
        email.setText("new_user2@gmail.com");

        //Sets initial password 
        password.setText("pass12345678");
    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the Registration page after tests
        registrationPage.dispose();
    }

    //Checks Sign Up button action event with missing username and correct expected result
    @Test
    public void testEmptyUserNamePositive() {
        //Sets correct expected result 
        String exp_result = "Please fill all fields!";

        //Runs Sign Up Button action event
        signUp.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

    //Checks Sign Up button action event with missing username and incorrect expected result
    @Test
    public void testEmptyUserNameNegative() {
        //Sets incorrect expected result 
        String exp_result = "Hello World";

        //Runs Sign Up Button action event
        signUp.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }

}
