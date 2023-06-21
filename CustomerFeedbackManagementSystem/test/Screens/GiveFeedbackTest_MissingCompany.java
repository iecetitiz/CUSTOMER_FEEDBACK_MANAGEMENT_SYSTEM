package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class GiveFeedbackTest_MissingCompany {

    //Creates GiveFeedbackPage
    GiveFeedback giveFeedbackPage = new GiveFeedback();

    //Creates JComboBox<String> named "companies" from the GiveFeedbackPage
    JComboBox<String> comboboxCompany = (JComboBox<String>) TestUtils.getChildNamed(giveFeedbackPage, "companies");

    //Creates JComboBox<String> named "categories" from the GiveFeedbackPage
    JComboBox<String> comboboxCategory = (JComboBox<String>) TestUtils.getChildNamed(giveFeedbackPage, "categories");

    //Creates JTextArea named "feedbackText" from the GiveFeedbackPage
    JTextArea feedbackText = (JTextArea) TestUtils.getChildNamed(giveFeedbackPage, "feedbackText");

    //Creates JButton named "submitButton" from the GiveFeedbackPage
    JButton submitButton = (JButton) TestUtils.getChildNamed(giveFeedbackPage, "submitButton");

    //Creates JLabel named "warningText" from the GiveFeedbackPage
    JLabel warningText = (JLabel) TestUtils.getChildNamed(giveFeedbackPage, "warningText");

    //Creates JTextField named "productID" from the GiveFeedbackPage
    JTextField productID = (JTextField) TestUtils.getChildNamed(giveFeedbackPage, "productID");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {

        //Selects a category
        comboboxCategory.setSelectedIndex(1);

        //Selects no company
        comboboxCompany.setSelectedIndex(0);

        //Sets initial Product ID as 5
        productID.setText("5");

        //Sets initial Feedback text as "new feedbacks"
        feedbackText.setText("new feedbacks");

        //Sets initial product rate as 3
        giveFeedbackPage.setRate(3);
    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the GiveFeedback page after tests
        giveFeedbackPage.dispose();
    }

    //Checks Submit Button action event with missing company and correct expected result
    @Test
    public void testGiveFeedbackMissingCompanyPositive() {
        //Sets correct expected result 
        String exp_result = "Please select company and category both!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

    //Checks Submit Button action event with missing company and incorrect expected result
    @Test
    public void testGiveFeedbackMissingCompanyNegative() {
        //Sets incorrect expected result 
        String exp_result = "It is done!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }

}
