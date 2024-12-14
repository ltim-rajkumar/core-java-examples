import com.lt.ecommerce.services.UserService;
import com.lt.ecommerce.utils.Utils;

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
            System.out.println("5 Create order");
            System.out.println("9 Exit");
            option = Integer.parseInt(scanner.nextLine());
            UserService user = new UserService(Utils.UserInput.CUSTOMER.value);
            UserService seller = new UserService(Utils.UserInput.SELLER.value);
            UserService deliveryAgent = new UserService(Utils.UserInput.DELIVERY_AGENT.value);

            switch (option) {
                case 1: {
                    user.createUser();
                    break;
                }
                case 2: {
                    seller.createUser();
                }
                case 3: {
                    deliveryAgent.createUser();
                }
            }

        } while(option != 9);
    }
}
