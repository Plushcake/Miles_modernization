public class BonusMilesService {
    public int calculate(int cost, int accrualFormula) {

        int bonusMiles = cost / accrualFormula;

        return bonusMiles;
    }
}
