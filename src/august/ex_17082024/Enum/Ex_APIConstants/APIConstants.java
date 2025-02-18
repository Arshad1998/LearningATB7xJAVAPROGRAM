package august.ex_17082024.Enum.Ex_APIConstants;

public enum APIConstants {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");


    public final String name;

    APIConstants(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }

}
