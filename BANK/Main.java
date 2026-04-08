import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<customer> customers = new ArrayList<>();
            
            customer c1 = new customer(
                    "101",
                    "Aarav",
                    "Sharma",
                    "aarav.sharma@gmail.com",
                    "9871112233",
                    "Bangalore",
                    "11112222333",
                    "LMNOPQRSTUV"
            );
           
            customer c2 = new customer(
                    "102",
                    "Meera",
                    "Patel",
                    "meera.patel@gmail.com",
                    "9898989898",
                    "Ahmedabad",
                    "22223333444",
                    "ABCDEFGXYZA"
            );
            
            customer c3 = new customer(
                    "103",
                    "Rahul",
                    "Verma",
                    "rahul.verma@gmail.com",
                    "9123451234",
                    "Chennai",
                    "33334444555",
                    "QRSTUVWXYZAB"
            );
            
            customers.add(c1);
            customers.add(c2);
            customers.add(c3);
            
            ArrayList<Account> accounts = new ArrayList<>();
            
            SavingsAccount sa1 = new SavingsAccount(3001, 7000, c1);
            CurrentAccount ca1 = new CurrentAccount(4001, 12000, c1);
            accounts.add(sa1);
            accounts.add(ca1);
            
            SavingsAccount sa2 = new SavingsAccount(3002, 9000, c2);
            CurrentAccount ca2 = new CurrentAccount(4002, 20000, c2);
            accounts.add(sa2);
            accounts.add(ca2);
            
            SavingsAccount sa3 = new SavingsAccount(3003, 4500, c3);
            accounts.add(sa3);
            
            System.out.println("\n  Performing Transactions \n");
            sa1.deposit(1500);
            sa1.withdraw(500);
            sa1.calculateInterest();
            System.out.println();
            
            Loan loan = new Loan(20000, 10);
            loan.displayLoan();
            loan.payEMI(sa1);
        }
        catch(InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    public static void displayInfo(ArrayList<customer> customers, ArrayList<Account> accounts) {
        
        for(customer cust : customers) {
            System.out.println("---- CUSTOMER DETAILS ----");
            cust.displayCustomer();
            
            System.out.println("\n---- ACCOUNTS ----");
            double totalBalance = 0;
            int accountCount = 0;
            
            for(Account acc : accounts) {
                if(acc.customer.customerID.equals(cust.customerID)) {
                    System.out.println("Account Number: " + acc.accountNumber);
                    System.out.println("Account Type: " + acc.getClass().getSimpleName());
                    System.out.println("Balance: Rs. " + acc.balance);
                    totalBalance += acc.balance;
                    accountCount++;
                    System.out.println();
                }
            }

            if(accountCount > 0) {
                System.out.println("Total Accounts: " + accountCount);
                System.out.println("Total Balance Across All Accounts: Rs. " + totalBalance);
            } else {
                System.out.println("No accounts found for this customer.");
            }
        }
    }
}
