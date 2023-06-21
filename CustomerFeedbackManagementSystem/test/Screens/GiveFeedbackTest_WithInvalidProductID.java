package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class GiveFeedbackTest_WithInvalidProductID {

    //Creates GiveFeedbackPage
    GiveFeedback giveFeedbackPage = new GiveFeedback();

    //Creates JComboBox<String> which is name "companies" from the GiveFeedbackPage
    JComboBox<String> comboboxCompany = (JComboBox<String>) TestUtils.getChildNamed(giveFeedbackPage, "companies");

    //Creates JComboBox<String> which is name "categories" from the GiveFeedbackPage
    JComboBox<String> comboboxCategory = (JComboBox<String>) TestUtils.getChildNamed(giveFeedbackPage, "categories");

    //Creates JTextArea which is name "feedbackText" from the GiveFeedbackPage
    JTextArea feedbackText = (JTextArea) TestUtils.getChildNamed(giveFeedbackPage, "feedbackText");

    //Creates JButton which is name "submitButton" from the GiveFeedbackPage
    JButton submitButton = (JButton) TestUtils.getChildNamed(giveFeedbackPage, "submitButton");

    //Creates JLabel which is name "warningText" from the GiveFeedbackPage
    JLabel warningText = (JLabel) TestUtils.getChildNamed(giveFeedbackPage, "warningText");

    //Creates JTextField which is name "productID" from the GiveFeedbackPage
    JTextField productID = (JTextField) TestUtils.getChildNamed(giveFeedbackPage, "productID");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {
        //Selects a category
        comboboxCategory.setSelectedIndex(2);

         //Selects a company
        comboboxCompany.setSelectedIndex(1);

        //Sets invalid Product ID 
        productID.setText("40");

        //Sets initial Feedback as "new feedbacks"
        feedbackText.setText("new feedbacks");

        //Sets initial product rate 
        giveFeedbackPage.setRate(3);

    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the GiveFeedback page after tests
        giveFeedbackPage.dispose();
    }

    //Checks Submit Button action event with invalid productID and correct expectation
    @Test
    public void testGiveFeedbackInvalidProductIDPositive() {
        //Sets correct expected result 
        String exp_result = "There is no product with this product ID!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

    //Checks Delete Button action event with invalid productID and incorrect expectation
    @Test
    public void testGiveFeedbackInvalidProductIDNegative() {
        //Sets incorrect expected result 
        String exp_result = "It is done!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }
}
