public class RollFactory implements Factory{
    //Generate different rolls based on the customer type.
    public static Roll createRoll(String type)
    {
        if (type == null || type.isEmpty())
            return null;
        if ("Egg Roll".equals(type)) {
            return new EggRoll();
        }
        else if ("Spring Roll".equals(type)) {
            return new SpringRoll();
        }
        else if ("Pastry Roll".equals(type)) {
            return new PastryRoll();
        }
        else if ("Jelly Roll".equals(type)) {
            return new JellyRoll();
        }
        else if ("Sausage Roll".equals(type)) {
            return new SausageRoll();
        }
        return null;
    }
}
