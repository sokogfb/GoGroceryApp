package app.infiniverse.grocery.serverutils;

public class URL {
    public static String SERVER_IP = "http://192.168.8.101/";
    public static String SERVER_FILES_URL = "glocery/";
    public static final String BASE_URL = SERVER_IP + SERVER_FILES_URL;

    //user/client authentication
    public static final String USER_LOGIN = BASE_URL + "auth/login.php";
    public static final String USER_REGISTER = BASE_URL + "auth/register.php";
    //Categories
    public static final String PRODUCT_CAT = BASE_URL + "product/categories.php";
}
