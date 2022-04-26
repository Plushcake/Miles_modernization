public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int bonusForTheTicketLow = service.calculate(100, 20);
        System.out.println("Низкий:Бонус милей " + bonusForTheTicketLow);

        int bonusForTheTicketAverage = service.calculate(500, 20);
        System.out.println("Средний:Бонус милей " + bonusForTheTicketAverage);

        int bonusForTheTicketHight = service.calculate(1_000, 20);
        System.out.println("Высокий:Бонус милей " + bonusForTheTicketHight);
    }
}
