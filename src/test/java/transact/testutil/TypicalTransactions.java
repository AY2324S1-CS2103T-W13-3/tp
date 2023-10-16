package transact.testutil;

import static transact.testutil.TypicalPersons.ALICE;

import transact.model.TransactionBook;
import transact.model.transaction.Transaction;
import transact.model.transaction.info.Amount;
import transact.model.transaction.info.Date;
import transact.model.transaction.info.Description;
import transact.model.transaction.info.TransactionId;
import transact.model.transaction.info.Type;

/**
 * A utility class containing a list of {@code Transaction} objects to be used in
 * tests.
 */
public class TypicalTransactions {
    public static final Transaction APPLES = new Transaction(new TransactionId(), Type.E, new Description("Apples"),
            new Amount(1.50), new Date(), ALICE);
    public static final Transaction BANANAS = new Transaction(new TransactionId(), Type.E, new Description("Bananas"),
            new Amount(1.50), new Date());
    public static final Transaction CARROTS = new Transaction(new TransactionId(), Type.E, new Description("Carrots"),
            new Amount(1.50), new Date());
    public static final Transaction DATES = new Transaction(new TransactionId(), Type.E, new Description("Dates"),
            new Amount(4.50), new Date());
    public static final Transaction EGGS = new Transaction(new TransactionId(), Type.E, new Description("Eggs"),
            new Amount(5.00), new Date());
    public static final Transaction FISH = new Transaction(new TransactionId(), Type.I, new Description("Fish"),
            new Amount(6.50), new Date());

    /**
     * Returns a {@code TransactionBook} with all the typical transactions.
     */
    public static TransactionBook getTypicalTransactionBook() {
        TransactionBook tb = new TransactionBook();
        for (Transaction transaction : getTypicalTransactions()) {
            tb.addTransaction(transaction);
        }
        return tb;
    }

    public static Transaction[] getTypicalTransactions() {
        return new Transaction[] {APPLES, BANANAS, CARROTS, DATES, EGGS, FISH};
    }
}
