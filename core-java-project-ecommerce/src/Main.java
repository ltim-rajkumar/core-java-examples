import com.lt.ecommerce.services.User;
import com.lt.ecommerce.utils.UserInput;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("--------Ecommerce--------");
            System.out.println("Please choose the option");
            System.out.println("1 Create customer");
            System.out.println("2 Create seller");
            System.out.println("3 Create delivery agent");
            System.out.println("4 Create shop");
            System.out.println("5 Create product");
            System.out.println("6 Create order");
            System.out.println("9 Exit");
            option = Integer.parseInt(scanner.nextLine());
            User user = new User();
            User seller = new User();
            User deliveryAgent = new User();

            switch (option) {
                case 1: {
                    user.createUser(UserInput.CUSTOMER.value);
                    break;
                }
                case 2: {
                    seller.createUser(UserInput.SELLER.value);
                    break;
                }
                case 3: {
                    deliveryAgent.createUser(UserInput.DELIVERY_AGENT.value);
                    break;
                }
            }

        } while(option != 9);
    }
}
