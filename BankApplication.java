
import java.util.Scanner;//gets scanner class

public class BankApplication {//starts BankApplication class

    public static void main(String[] args) {//start main method

        Scanner input = new Scanner(System.in);//create scanner object
        int nOption = 0;//declare and initialize variable
        double dNewInterestRate = 0.0;//declare and initialize variable
        double nNewDeposit = 0.0;//declare and initialize variable
        double nNewWithdrawal = 0.0;//declare and initialize variable
        double setBalance = 0.0;//declare and initialize variable
        double setIntRate = 0.0;//declare and initialize variable

        /*
        menu of option that the user can choose from. the numbers are used in the program
        and the words decribe the function associated with the number.
        */
        System.out.println("ACCOUNT PROCESSING MENU");
        System.out.println("1. Create new account - empty account");
        System.out.println("2. Create new account - information available");
        System.out.println("3. Make deposit");
        System.out.println("4. Make withdrawal");
        System.out.println("5. Calculate monthly interest");
        System.out.println("6. View account balance");
        System.out.println("7. Next available account number");
        System.out.println("8. Update monthly interest rate");
        System.out.println("9. Print account information");
        System.out.println("10. Exit");

        System.out.println("");//space for neatness

        System.out.print("Please enter your preferred option: ");//ask user to choose from the menu
        nOption = input.nextInt();//store user input from menu

        if (nOption == 1) {//is this a empty account?
            BankAccount account0 = new BankAccount();//create bankaccount object
            System.out.println("Account #" + account0.getAccountNumber() + " successfully created.");//prints account number of the object
            System.out.println("");//space for neatness

            while (nOption > 0 && nOption < 10) {//repeats as long as the variable is between 0 and 10
                System.out.print("Please enter your preferred option: ");//ask user to choose from the menu
                nOption = input.nextInt();//store user input from menu

                if (nOption == 3) {//did the user choose 3?
                    System.out.print("Please enter the deposit amount: ");//ask user what aount they want to deposit
                    nNewDeposit = input.nextDouble();//store user input
                    account0.makeDeposit(nNewDeposit);//add to the balance of the account0 object
                    System.out.println("");//space for neatness

                } else if (nOption == 4) {//did the user choose 4?
                    System.out.print("Please enter the withdrawal amount: ");
                    nNewWithdrawal = input.nextDouble();//store user input
                    account0.makeWithdrawal(nNewWithdrawal);//subtract from the balance of the account0 object
                    System.out.println("");//space for neatness

                } else if (nOption == 5) {//did the user choose 5?
                    System.out.println("Monthly interest earned: $" + account0.monthlyInterest());//shows the dollar amount of interest
                    System.out.println("");//space for neatness

                } else if (nOption == 6) {//did the user choose 6?
                    System.out.println("Account balance: $" + account0.getBalance());//show money int the account
                    System.out.println("");//space for neatness

                } else if (nOption == 7) {//did the user choose 7?
                    System.out.println("Next available account number: " + BankAccount.getNextAccountNumber());//shows what account number can be used next
                    System.out.println("");//space for neatness

                } else if (nOption == 8) {//did the user choose 8?
                    System.out.print("What is the new monthly interest rate? ");
                    dNewInterestRate = input.nextDouble();//store user input
                    account0.setMonthlyInterestRate(dNewInterestRate);//sets the interst rate of the account0 object
                    System.out.println("");//space for neatness

                } else if (nOption == 9) {//did the user choose 9?
                    account0.printBankInfo();//shows the balance, account number and intrest of the account
                    System.out.println("");//space for neatness

                } else if (nOption == 10) {//did the user choose 10?
                    System.out.println("Exiting Program.");//tells user the program will close
                    System.exit(0);//closes program
                }
            }//end while loop
        } else if (nOption == 2) {//is there account data
            System.out.print("Please enter the starting balance: ");// ask user for inital account balance
            setBalance = input.nextDouble();//store user input
            System.out.print("Please enter the monthly interest rate: ");// ask user for inital interest rate
            setIntRate = input.nextDouble();//store user input
            BankAccount account0 = new BankAccount(setBalance, setIntRate);//create bankaccount object
            System.out.println("Account #" + account0.getAccountNumber() + " successfully created.");//prints account number of the object
            System.out.println("");//space for neatness

            while (nOption > 0 && nOption < 10) {//repeats as long as the variable is between 0 and 10
                System.out.print("Please enter your preferred option: ");//ask user to choose from the menu
                nOption = input.nextInt();//store user input from menu
                

                if (nOption == 3) {//did the user choose 3?
                    System.out.print("Please enter the deposit amount: ");//ask user what aount they want to deposit
                    nNewDeposit = input.nextDouble();//store user input
                    account0.makeDeposit(nNewDeposit);//add to the balance of the account0 object
                    System.out.println("");//space for neatness
                    
                } else if (nOption == 4) {//did the user choose 4?
                    System.out.print("Please enter the withdrawal amount: ");
                    nNewWithdrawal = input.nextDouble();//store user input
                    account0.makeWithdrawal(nNewWithdrawal);//subtract from the balance of the account0 object
                    System.out.println("");//space for neatness

                } else if (nOption == 5) {//did the user choose 5?
                    System.out.println("Monthly interest earned: $" + account0.monthlyInterest());//shows the dollar amount of interest
                    System.out.println("");//space for neatness

                } else if (nOption == 6) {//did the user choose 6?
                    System.out.println("Account balance: $" + account0.getBalance());//show money int the account
                    System.out.println("");//space for neatness

                } else if (nOption == 7) {//did the user choose 7?
                    System.out.println("Next available account number: " + BankAccount.getNextAccountNumber());//shows what account number can be used next
                    System.out.println("");//space for neatness

                } else if (nOption == 8) {//did the user choose 8?
                    System.out.print("What is the new monthly interest rate? ");
                    dNewInterestRate = input.nextDouble();//store user input
                    account0.setMonthlyInterestRate(dNewInterestRate);//sets the interst rate of the account0 object
                    System.out.println("");//space for neatness

                } else if (nOption == 9) {//did the user choose 9?
                    account0.printBankInfo();//shows the balance, account number and intrest of the account
                    System.out.println("");//space for neatness

                } else if (nOption == 10) {//did the user choose 10?
                    System.out.println("Exiting Program.");//tells user the program will close
                    System.exit(0);//closes program
                }
            }//end while loop
        } else {
            System.out.println("No account!");//tells the user an account hasnt been opened empty or with info
            System.exit(0);//closes program
        }//end if statment

    }//end main method
}//end BankApplication class
