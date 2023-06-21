package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class UpdateFeedbackTest_MissingCompany {

    //Creates UpdateFeedback page
    UpdateFeedback updateFeedbackPage = new UpdateFeedback();

    //CreatesJComboBox<String> named "companies" from the UpdateFeedback Page
    JComboBox<String> comboboxCompany = (JComboBox<String>) TestUtils.getChildNamed(updateFeedbackPage, "companies");

    //CreatesJComboBox<String> named "categories" from the UpdateFeedback Page
    JComboBox<String> comboboxCategory = (JComboBox<String>) TestUtils.getChildNamed(updateFeedbackPage, "categories");

    //Creates JTextArea named "feedbackText" from the UpdateFeedback Page
    JTextArea feedbackText = (JTextArea) TestUtils.getChildNamed(updateFeedbackPage, "feedbackText");

    //Creates JButton named "updateButton" from the UpdateFeedback Page
    JButton updateButton = (JButton) TestUtils.getChildNamed(updateFeedbackPage, "updateButton");

    //Creates JTextField named "feedBackID" from the UpdateFeedback Page
    JTextField feedbackID = (JTextField) TestUtils.getChildNamed(updateFeedbackPage, "feedBackID");

    //Creates JLabel named "warningText" from the UpdateFeedback Page
    JLabel warningText = (JLabel) TestUtils.getChildNamed(updateFeedbackPage, "warningText");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {
        //Selects no company
        comboboxCompany.setSelectedIndex(0);

        //Selects a category
        comboboxCategory.setSelectedIndex(2);

        //Sets initial Feedback text
        feedbackText.setText("new feedbacks");

        //Sets initial product rate
        updateFeedbackPage.setRate(3);

        //Sets initial feedbackID 
        feedbackID.setText("5");
    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the giveFeedbackPage after tests
        updateFeedbackPage.dispose();
    }

    //Checks Update Button action event with missing company and correct expected result
    @Test
    public void testUpdateFeedbackWithMissingCompanyPositive() {
        //Sets correct expected result 
        String exp_result = "Please select company and category both!";

        //Runs Update Button action event
        updateButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

    //Checks Update Button action event with missing company and incorrect expected result
    @Test
    public void testUpdateFeedbackWithMissingCompanyNegative() {
        //Sets incorrect expected result 
        String exp_result = "It is done!";

        //Runs Update Button action event
        updateButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }
}
