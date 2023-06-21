package Screens;

//imports libraries
import javax.swing.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ContactCompanyTest_MissingContactTextAndCompany {
    //Creates contactCompanyPage
    ContactCompany contactCompanyPage = new ContactCompany();

    //Creates JButton named "submitButton" from the ContactCompany page
    JButton submitButton = (JButton) TestUtils.getChildNamed(contactCompanyPage, "submitButton");

    //Creates JComboBox<String>named "companies" from the ContactCompany page
    JComboBox<String> comboboxCompany = (JComboBox<String>) TestUtils.getChildNamed(contactCompanyPage, "companies");

    //Creates JLabel named "warningText" from the ContactCompany page
    JLabel warningText = (JLabel) TestUtils.getChildNamed(contactCompanyPage, "warningText");

    //Creates JTextArea named "contactText" from the ContactCompany page
    JTextArea contactText = (JTextArea) TestUtils.getChildNamed(contactCompanyPage, "contactText");

    
    //Sets initial values to the objects before running test methods
    //Runs before each test method
    @Before
    public void setUp() {
        //Selects no company
        comboboxCompany.setSelectedIndex(0);

        //Sets initial Contact text area as ampty
        contactText.setText("");
    }

    
    //Runs after each test method
    @After
    public void tearDown() {
        //Dispose the ContactCompany page after tests
        contactCompanyPage.dispose();
    }

    
    //Checks Submit Button action event with missing Company and Contact text and correct expected result
    @Test
    public void testContactCompanyMissingContactTextAndCompanyPositive() {
        //Sets correct expected result 
        String exp_result = "All fields should be filled!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertEquals(exp_result, warningText.getText());
    }

    
     //Checks Submit Button action event with missing Company and Contact text and incorrect expected result
    @Test
    public void testContactCompanyMissingContactTextAndCompanyNegative() {
        //Sets incorrect expected result 
        String exp_result = "It is done!";

        //Runs Submit Button action event
        submitButton.doClick();

        //Returns test result with comparing actual result and expected result
        assertNotSame(exp_result, warningText.getText());
    }
}
