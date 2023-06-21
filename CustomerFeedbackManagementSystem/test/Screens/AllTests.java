package Screens;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//Runs all test classes at the same time
@RunWith(Suite.class)
@Suite.SuiteClasses({
    ContactCompanyTest_MissingCompany.class,
    ContactCompanyTest_MissingContactText.class,
    ContactCompanyTest_MissingContactTextAndCompany.class,
    ContactCompanyTest_SuccessfulContact.class,
    DeleteFeedbackTest_InvalidFeedbackID.class,
    DeleteFeedbackTest_ValidFeedbackID.class,
    GiveFeedbackTest_MissingCategory.class,
    LoginTest_IncorrectPassword.class,
    GiveFeedbackTest_MissingCompany.class,
    GiveFeedbackTest_SuccessfulSubmission.class,
    GiveFeedbackTest_WithInvalidProductID.class,
    LoginTest_3TimesWrongAttempts.class,
    LoginTest_IncorrectPassword.class,
    LoginTest_IncorrectUsername.class,
    LoginTest_MissingPassword.class,
    LoginTest_MissingUserName.class,
    LoginTest_SuccessfulLogin.class,
    RegistrationTest_AlreadyExistsUsername.class,
    RegistrationTest_Less8LengthPassword.class,
    RegistrationTest_Less8LengthPasswordTR.class,
    RegistrationTest_MissingEmailTR.class,
    RegistrationTest_MissingPassword.class,
    RegistrationTest_MissingUsername.class,
    UpdateFeedbackTest_InvalidFeedbackID.class,
    UpdateFeedbackTest_MissingCategory.class,
    UpdateFeedbackTest_MissingCompany.class,
    UpdateFeedbackTest_MissingFeedbackID.class,
    UpdateFeedbackTest_MissingFeedbackText.class,
    UpdateFeedbackTest_MissingRateStars.class,
    UpdateFeedbackTest_SuccessfulUpdate.class})

public class AllTests {

}
