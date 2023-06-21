package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class GiveFeedbackTest_SuccessfulSubmission {

  //Creates GiveFeedbackPage
    GiveFeedback giveFeedbackPage = new GiveFeedback();

    //Creates JComboBox<String> which is name "companies" from the GiveFeedbackPage
    JComboBox<String> comboboxCompany = (JComboBox<String>) TestUtils.getChildNamed(giveFeedbackPage, "companies");

    //Creates JComboBox<String> which is name "categories" from the GiveFeedbackPage
    JComboBox<String> comboboxCategory = (JComboBox<String>) TestUtils.getChildNamed(giveFeedbackPage, "categories");

    //Creates JTextArea which is name "feedbackText" from the GiveFeedbackPage
    JTextArea feedbackText = (JTextArea) TestUtils.getChildNamed(giveFeedbackPage, "feedbackText");

    //Creates JTextField which is name "productID" from the GiveFeedbackPage
    JButton submitButton = (JButton) TestUtils.getChildNamed(giveFeedbackPage, "submitButton");

    //Creates JLabel which is name "warningText" from the GiveFeedbackPage
    JLabel warningText = (JLabel) TestUtils.getChildNamed(giveFeedbackPage, "warningText");

    //Creates JTextField which is name "productID" from the GiveFeedbackPage
    JTextField productID = (JTextField) TestUtils.getChildNamed(giveFeedbackPage, "productID");
    
    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {
        //It selects a category
        comboboxCategory.setSelectedIndex(4);

        //It selects a company
        comboboxCompany.setSelectedIndex(1);

        //Sets valid Product ID 
        //Product is FlipFlop, category is Shoes
        productID.setText("39");

        //Sets initial Feedback as "Nice Shoes"
        feedbackText.setText("Nice Shoes");

        //Sets initial product rate 
        giveFeedbackPage.setRate(5);
        
        //Sets a customer ID
        giveFeedbackPage.setCustomerID(1);
    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the GiveFeedback page after tests
        giveFeedbackPage.dispose();
    }

    //Checks Submit Button action event with successful submission and correct expectation
    @Test
    public void testGiveFeedbackSuccessfulSubmissionPositive() {
        //Sets correct expected result 
        String exp_result = "Submitted Successfully, Email sended to Company!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());

    }

    //Checks Submit Button action event with successful submission and incorrect expectation
    @Test
    public void testGiveFeedbackSuccessfulSubmissionNegative() {
        //Sets incorrect expected result 
        String exp_result = "It is done!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }
}
