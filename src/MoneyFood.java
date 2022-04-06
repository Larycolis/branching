public class MoneyFood {
    public static void main(String[] args) {
        int countOfMoney = 200;
        if (countOfMoney > 3000) {
            System.out.println("Ресторан");
        } else if (countOfMoney >= 1500) {
            System.out.println("Кафе");
        } else if (countOfMoney >= 800) {
            System.out.println("Кофейня");
        } else if (countOfMoney >= 300){
            System.out.println("Столовая");
        } else {
            System.out.println("Замороженная еда из супермаркета");
        }
    }
}
