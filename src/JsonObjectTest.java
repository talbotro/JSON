import org.json.simple.JSONObject;

class Main {

    public static void main(String[] args){

        JSONObject obj = new JSONObject();

        obj.put("name","Shem");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip",new Boolean(true));
        obj.put("Number_Of_Frisbees",5700);

        System.out.print(obj);
    }
}