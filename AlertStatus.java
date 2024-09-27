import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlertStatus {


    private static final Map<Integer, String> alertMessages = new HashMap<>();

    static {
        alertMessages.put(200, "System is running smoothly.");
        alertMessages.put(300, "Warning: Potential issues detected.");
        alertMessages.put(400, "Error: An issue has occurred.");
        alertMessages.put(500, "Critical: Immediate action is required.");
    }


    public static String getAlertMessage(int statusCode) {

        return alertMessages.getOrDefault(statusCode, "Unknown status code.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a status code (e.g., 200, 300, 400, 500): ");
        int statusCode = scanner.nextInt();  

        String alertMessage = getAlertMessage(statusCode);
        System.out.println("Alert Status Code: " + statusCode);
        System.out.println(alertMessage);

        scanner.close();
    }
}
