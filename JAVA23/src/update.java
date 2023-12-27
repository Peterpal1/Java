public interface update {

    public static final double fee = 29000 + 17100;
    public static final String RegNo = "SIT/B/01-02907/2022";


    public abstract double pay();

    public abstract class sem implements update,updatee{

        @Override
        public double pay() {
            return fee;
        }
        @Override
        public String signin(){
            return null;}

    }
}
