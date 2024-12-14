package com.lt.ecommerce.services;
import com.lt.ecommerce.models.User;
import java.util.Scanner;

public class UserService {
    final int userType;
    private final Scanner scanner = new Scanner(System.in);

    public UserService(int userType) {
        this.userType = userType;
    }

    public void createUser() {

        User user = new User();

        String userByType = switch (userType) {
            case 1 -> "customer";
            case 2 -> "seller";
            case 3 -> "delivery agent";
            default -> "";
        };

        System.out.println("Enter "+userByType+" id: ");
        user.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter "+userByType+" first name");
        user.setFirstName(scanner.nextLine());

        System.out.println("Enter "+userByType+" last name");
        user.setLastName(scanner.nextLine());

        System.out.println("Enter "+userByType+" mobile number");
        user.setMobileNo(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter "+userByType+" address");
        user.setAddress(scanner.nextLine());

        user.setUserType(userType);

        System.out.println(userByType + " details = " + user);

    }

}
