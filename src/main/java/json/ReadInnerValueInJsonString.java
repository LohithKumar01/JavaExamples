package json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadInnerValueInJsonString {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"Lohith\",\"address\":{\"streetAddress1\":\"509\"}}";

        String streetAddress = getJsonValue(jsonString, "address.streetAddress1");
        System.out.println("Address: " + streetAddress);
    }

    public static String getJsonValue(String jsonString, String key) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String[] keys = key.split("\\.");

            for (String keyStr : keys) {
                jsonNode = jsonNode.get(keyStr);
            }
            return jsonNode.asText();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
