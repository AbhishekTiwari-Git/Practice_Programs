//package org.example;
//
//import org.apache.juneau.json.JsonSerializer;
//
//public class SerializeDeserialize {
//    public static void main(String[] args) {
//        String[] module = {"Receiving","Inventory","Slotting","Loading","Invoicing"};
//        MyPojo pojo = new MyPojo("Abhishek","Walmart",module,9835);
//        JsonSerializer jsonSerialize = JsonSerializer.DEFAULT_READABLE;
//        String serialized = jsonSerialize.serialize(pojo);
//        System.out.println(serialized);
//    }
//}
