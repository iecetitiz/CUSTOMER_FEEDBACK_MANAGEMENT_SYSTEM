package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class DeleteFeedbackTest_InvalidFeedbackID {

    //Creates Feedback page
    DeleteFeedback deleteFeedbackPage = new DeleteFeedback();

    //Creates JButton  named "deleteButton" from the DeleteFeedback page
    JButton deleteButton = (JButton) TestUtils.getChildNamed(deleteFeedbackPage, "deleteButton");

    //Creates JLabel named "warningText" from the DeleteFeedback page
    JLabel warningText = (JLabel) TestUtils.getChildNamed(deleteFeedbackPage, "warningText");

    //Creates JTextField named "feedBackID" from the DeleteFeedback page
    JTextField feedBackID = (JTextField) TestUtils.getChildNamed(deleteFeedbackPage, "feedBackID");

    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {
        //Sets initital feedBackID with an invalid value
        feedBackID.setText("15000");
    }

    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the DeleteFeedback page after tests
        deleteFeedbackPage.dispose();
    }

    //Checks Delete Button action event with invalid FeedbackID and correct expectation
    @Test
    public void testDeleteFeedbackInvalidFeedbackIDPositive() {
        //Sets correct expected result 
        String exp_result = "There is no feedback with this Feedback ID!";

        //Runs Delete Button action event
        deleteButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

    //Checks Delete Button action event with invalid FeedbackID and incorrect expectation
    @Test
    public void testDeleteFeedbackInvalidFeedbackIDNegative() {

        //Sets incorrect expected result 
        String exp_result = "It is done!";

        //Runs Delete Button action event
        deleteButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }
}
