package transact.model.transaction;

import java.util.Scanner;

import transact.model.person.Person;
import transact.model.transaction.info.Amount;
import transact.model.transaction.info.Date;
import transact.model.transaction.info.Description;
import transact.model.transaction.info.TransactionId;
import transact.model.transaction.info.Type;

public class TransactionManualTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Manual Transaction Test");

        System.out.print("Enter Person Name: ");
        String personNameInput = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumberInput = scanner.nextLine();

        System.out.print("Enter Email: ");
        String emailInput = scanner.nextLine();

        System.out.print("Enter Address: ");
        String addressInput = scanner.nextLine();

        System.out.print("Enter Type: ");
        String typeInput = scanner.nextLine();

        System.out.print("Enter Description: ");
        String descriptionInput = scanner.nextLine();

        System.out.print("Enter Amount: ");
        double amountInput = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Date: ");
        String dateInput = scanner.nextLine();



        TransactionId transactionId = new TransactionId();
        Person person = new Person(new transact.model.person.Name(personNameInput),
                new transact.model.person.Phone(phoneNumberInput),
                new transact.model.person.Email(emailInput),
                new transact.model.person.Address(addressInput),
                new java.util.HashSet<>());
        Description description = new Description(descriptionInput);
        Amount amount = new Amount(amountInput);
        Type type = Type.getType(typeInput);

        // Create a Transaction object
        Transaction transaction = new Transaction(transactionId, type, description, amount, new Date(), person);

        // Print Transaction information for verification
        System.out.println("\nTransaction Information:");
        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Person: " + transaction.getPerson());
        System.out.println("Description: " + transaction.getDescription());
        System.out.println("Amount: " + transaction.getAmount());

        scanner.close();
    }
}
