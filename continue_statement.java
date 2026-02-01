public class continue_statement {
    public static void main(String[] args) {
        for(int i=1; i<=8; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
