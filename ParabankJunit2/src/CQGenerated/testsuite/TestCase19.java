package CQGenerated.testsuite;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import CQGenerated.types.*;
import CQGenerated.utilities.*;
import CQGenerated.CQTestSuite;

/** Conformiq generated test case
	Request Loan (Accept/Deny)
*/
public class TestCase19
{

	public TestCase19()
	{
	}

	@Test
	public void test()
	{
		step1();
		step2();
		step3();
		step4();
		step5();
		step6();
		step7();
		step8();
		step9();
		step10();
		step11();
		step12();
		step13();
	}
	public void step1()
	{
		CQTestSuite.harness.log("Executing test step 1");

		CQTestSuite.harness.performCQRecordenter_URL_Action(
			new CQRecordenter_URL_Action(

			/**url*/
			"Enter URL as http://parabank2.parasoft.com/parabank/index.htm"
			));
	}
	public void step2()
	{
		CQTestSuite.harness.log("Executing test step 2");
		CQTestSuite.harness.verifyCQRecordParabank_Welcome_screen(
		/**Parabank_Welcome_screen*/
		new CQRecordParabank_Welcome_screen(
		/**Customer_Login_form*/
		new CQRecordCustomer_Login_form(
		/**Username*/
		""/* Creator [Don't Care] */,
		/**Username_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Password*/
		""/* Creator [Don't Care] */,
		/**Password_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**LOG_IN_button_Status*/
		""/* Creator [Don't Care] */,
		/**Register_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Forgot_login_info__hyperlink_Status*/
		""/* Creator [Don't Care] */
		),
		/**Admin_Page_hyperlink_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step3()
	{
		CQTestSuite.harness.log("Executing test step 3");
		CQTestSuite.harness.fillCQRecordFill_Customer_Login_form_Parabank_Welcome_screen(
		new CQRecordFill_Customer_Login_form_Parabank_Welcome_screen(
		/**Fill_Customer_Login_form*/
		new CQRecordFill_Customer_Login_form(
		/**Username*/
		"valid Username",
		/**Password*/
		"valid Password"
		)
		)
		);
	}
	public void step4()
	{
		CQTestSuite.harness.log("Executing test step 4");
		CQTestSuite.harness.clickCQRecordLOG_IN_button_Parabank_Welcome_screen_Customer_Login_form(
		new CQRecordLOG_IN_button_Parabank_Welcome_screen_Customer_Login_form(
		)
		);
	}
	public void step5()
	{
		CQTestSuite.harness.log("Executing test step 5");
		CQTestSuite.harness.verifyCQRecordAccount_Services_screen(
		/**Account_Services_screen*/
		new CQRecordAccount_Services_screen(
		/**Open_New_Account_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Account_Overview_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Transfer_Funds_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Bill_Pay_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Find_Transactions_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Update_Contact_Info_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Request_Loan_hyperlink_Status*/
		""/* Creator [Don't Care] */,
		/**Log_Out_hyperlink_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step6()
	{
		CQTestSuite.harness.log("Executing test step 6");

		CQTestSuite.harness.verifyCQRecordAccounts_Overview_Action(
			new CQRecordAccounts_Overview_Action(

			/**Account*/
			"Account Number",
			/**Balance*/
			"Balance",
			/**Available_Amount*/
			"Available Amount"
			));
	}
	public void step7()
	{
		CQTestSuite.harness.log("Executing test step 7");
		CQTestSuite.harness.clickCQRecordRequest_Loan_hyperlink_Account_Services_screen(
		new CQRecordRequest_Loan_hyperlink_Account_Services_screen(
		)
		);
	}
	public void step8()
	{
		CQTestSuite.harness.log("Executing test step 8");
		CQTestSuite.harness.verifyCQRecordApply_for_a_Loan_screen(
		/**Apply_for_a_Loan_screen*/
		new CQRecordApply_for_a_Loan_screen(
		/**Loan_form*/
		new CQRecordLoan_form(
		/**Loan_Amount*/
		""/* Creator [Don't Care] */,
		/**Loan_Amount_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**Down_Payment*/
		""/* Creator [Don't Care] */,
		/**Down_Payment_textbox_Status*/
		""/* Creator [Don't Care] */,
		/**From_Account*/
		"Existing Accounts",
		/**From_Account_dropdown_Status*/
		""/* Creator [Don't Care] */
		),
		/**Apply_Now_button_Status*/
		""/* Creator [Don't Care] */,
		/**Account_Overview_hyperlink_Status*/
		""/* Creator [Don't Care] */
		)
		);
	}
	public void step9()
	{
		CQTestSuite.harness.log("Executing test step 9");
		CQTestSuite.harness.fillCQRecordFill_Loan_form_Apply_for_a_Loan_screen(
		new CQRecordFill_Loan_form_Apply_for_a_Loan_screen(
		/**Fill_Loan_form*/
		new CQRecordFill_Loan_form(
		/**Loan_Amount*/
		"Loan Amount",
		/**Down_Payment*/
		"Down Payment",
		/**From_Account*/
		"Existing Accounts"
		)
		)
		);
	}
	public void step10()
	{
		CQTestSuite.harness.log("Executing test step 10");
		CQTestSuite.harness.clickCQRecordApply_Now_button_Apply_for_a_Loan_screen(
		new CQRecordApply_Now_button_Apply_for_a_Loan_screen(
		)
		);
	}
	public void step11()
	{
		CQTestSuite.harness.log("Executing test step 11");

		CQTestSuite.harness.verifyCQRecordLoan_Request_Processed_Action(
			new CQRecordLoan_Request_Processed_Action(

			/**Loan_Provider*/
			"Loan Provider",
			/**Date*/
			"Current Date",
			/**Status*/
			"Approved",
			/**message*/
			"Congratulations,your loan has been approved",
			/**Account_Number*/
			"Your new account number:XXXX"
			));
	}
	public void step12()
	{
		CQTestSuite.harness.log("Executing test step 12");
		CQTestSuite.harness.clickCQRecordAccount_Overview_hyperlink_Apply_for_a_Loan_screen(
		new CQRecordAccount_Overview_hyperlink_Apply_for_a_Loan_screen(
		)
		);
	}
	public void step13()
	{
		CQTestSuite.harness.log("Executing test step 13");

		CQTestSuite.harness.verifyCQRecordAccount_Overviews_for_Loan_Action(
			new CQRecordAccount_Overviews_for_Loan_Action(

			/**Account1*/
			"Account Number",
			/**Balance_of_Account1*/
			"Actual Balance Amount- Loan Down Paymentt",
			/**Available_Amount_of_Account_1*/
			"Available Amount",
			/**Account2*/
			"Account Number",
			/**Balance_Account2*/
			"Loan Requested Amount",
			/**Avilable_Amount_of_Account2*/
			"Available Amount",
			/**Total_Amount*/
			"Account1+Account2"
			));
	}
	@Before
	public void setUp()
	{
		CQData.setUp();
		CQTestSuite.harness.setUp("Request Loan (Accept/Deny)");
	}
	@After
	public void tearDown()
	{
		CQTestSuite.harness.tearDown("Request Loan (Accept/Deny)");
	}
}
