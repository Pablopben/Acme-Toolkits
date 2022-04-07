package acme.testing;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class AnyItemListTest extends TestHarness {

	// Lifecycle management ---------------------------------------------------

	// Test cases -------------------------------------------------------------

	@ParameterizedTest
	@CsvFileSource(resources = "/any/items/list.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void positiveTest(final int key, final String name, final String code, final String technology, final String description, final String retailPrice, final String info) {
		//super.signIn("inventor1", "inventor1");

		super.clickOnMenu("Lists", "Items list");
		super.checkListingExists();
		super.sortListing(1, "asc");
		
		super.checkColumnHasValue(key, 0, name);
		super.checkColumnHasValue(key, 1, code);
		super.checkColumnHasValue(key, 2, technology);

		super.clickOnListingRecord(key);
		super.checkFormExists();
		super.checkInputBoxHasValue("description", description);
		super.checkInputBoxHasValue("retailPrice", retailPrice);
		super.checkInputBoxHasValue("info", info);
//		super.checkInputBoxHasValue("type", type);
//		super.checkInputBoxHasValue("creationDate", creationDate);
//		super.checkInputBoxHasValue("startDate", startDate);
//		super.checkInputBoxHasValue("endDate", endDate);
//		super.checkInputBoxHasValue("info", info);
//		super.checkInputBoxHasValue("patron.identity.name", patronIdentityName);
//		super.checkInputBoxHasValue("patron.identity.surname", patronIdentitySurname);
//		super.checkInputBoxHasValue("patron.identity.email", patronIdentityEmail);
//		super.checkInputBoxHasValue("patron.company", patronCompany);
//		super.checkInputBoxHasValue("patron.company", patronCompany);
//		super.checkInputBoxHasValue("patron.statement", patronStatement);
//		super.checkInputBoxHasValue("patron.info", patronInfo);
		
		//super.signOut();
	}

	// Ancillary methods ------------------------------------------------------

}