package WEEK_1;

public class VIPCustomerIdentification {

    //region PART C - Create Method

    static String validateCustomerId(String customerId) {

        //region PART C.1 - Check VIP Prefix

        if (customerId.startsWith("VIP-")) {

            return "VIP Customer";


        } else {


            return "Regular Customer";


        }

        //endregion
    }

    //endregion


    public static void main(String[] args) {

        //region PART A - Customer ID

        String customerId = "VIP-4589";

        //endregion


        //region PART B - Call the Method

        String result = validateCustomerId(customerId);

        //endregion


        //region PART D - Print Result

        System.out.println(result);

        //endregion
    }
}