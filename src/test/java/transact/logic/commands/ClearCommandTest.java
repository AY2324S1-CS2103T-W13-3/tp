package transact.logic.commands;

import static transact.logic.commands.CommandTestUtil.assertCommandSuccess;
import static transact.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import transact.model.AddressBook;
import transact.model.Model;
import transact.model.ModelManager;
import transact.model.UserPrefs;

public class ClearCommandTest {

  @Test
  public void execute_emptyAddressBook_success() {
    Model model = new ModelManager();
    Model expectedModel = new ModelManager();

    assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
  }

  @Test
  public void execute_nonEmptyAddressBook_success() {
    Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    Model expectedModel = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    expectedModel.setAddressBook(new AddressBook());

    assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
  }

}
