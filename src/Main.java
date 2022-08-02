public class Main {
    public static void main(String[] args) {
          // задача 1

            byte dog=3;
            short cat=4;
            int box=5;
            long elefant=150L;
            float sugarWeight=4.5f;
            double apples=5.4;
            char bar=33;
            boolean dogIsAdult=dog>3;


            //задача 2

            double oneBoxerWeight=78.2;
            double twoBoxerWeight=82.7;

            double totalWeight=oneBoxerWeight+twoBoxerWeight;
            System.out.println("Общий вес бойцов "+totalWeight+ " кг!" );

            double differenceWeight=twoBoxerWeight-oneBoxerWeight;
            System.out.println("Разница между весами бойцов "+differenceWeight+" кг");

            // задача 3
            int bananas=5;
            int oneBananasWeight=80;
            int totalWeightBananas=bananas*oneBananasWeight;

            int milkVolume=200;
            int oneHundredMililitersWeight=105;
            int totalWeightMilk=oneHundredMililitersWeight*2;

            int sundea=2;
            int Inonesundea=100;
            int totalWeightSundea=sundea*Inonesundea;

            int eggs=4;
            int InOneEgg=70;
            int totalWeightEggs=eggs*InOneEgg;

            int breakfastWeight=totalWeightBananas+totalWeightMilk+totalWeightSundea+totalWeightEggs;
            double totalBreakfastWeight=breakfastWeight/1000.0;
            System.out.println("Общий вес спорт завтрака "+totalBreakfastWeight+ " кг!");

            //задача 4

            int lossOverallWeight=7000;
            int dailyWeightLoss1=250;
            int dayLossWeight1=lossOverallWeight/dailyWeightLoss1;

            int dailyWeightLoss2=500;
            int dayLossWeight2=lossOverallWeight/dailyWeightLoss2;

            int averageWeightLossDay=(dayLossWeight1+dayLossWeight2)/2;
            System.out.println("В среднем результат похудения достигается за "+averageWeightLossDay+" день");

            //задача 5

            double salaryPerMonth1=67760.0;
            double monthlySalaryAfterPromotion1=67760.0/10.0+67760.0;
            double annualIncomeBeforeIncrease1=67760.0*12;
            double annualIncomeAfterIncrease1=monthlySalaryAfterPromotion1*12;
            double differenceBetweenAnnualIncome1=annualIncomeAfterIncrease1-annualIncomeBeforeIncrease1;
            System.out.println("Маша теперь получает "+monthlySalaryAfterPromotion1+" рублей."+" Годовой доход вырос на "+differenceBetweenAnnualIncome1+" рублей.");

            double salaryPerMonth2=83690.0;
            double monthlySalaryAfterPromotion2=83690.0/10.0+83690.0;
            double annualIncomeBeforeIncrease2=83690.0*12;
            double annualIncomeAfterIncrease2=monthlySalaryAfterPromotion2*12;
            double differenceBetweenAnnualIncome2=annualIncomeAfterIncrease2-annualIncomeBeforeIncrease2;
            System.out.println("Денис теперь получает "+monthlySalaryAfterPromotion2+" рублей."+" Годовой доход вырос на "+differenceBetweenAnnualIncome2+" рублей.");

            double salaryPerMonth3=76230.0;
            double monthlySalaryAfterPromotion3=76230.0/10.0+76230.0;
            double annualIncomeBeforeIncrease3=76230.0*12;
            double annualIncomeAfterIncrease3=monthlySalaryAfterPromotion3*12;
            double differenceBetweenAnnualIncome3=annualIncomeAfterIncrease3-annualIncomeBeforeIncrease3;
            System.out.println("Кристина теперь получает "+monthlySalaryAfterPromotion3+" рублей."+" Годовой доход вырос на "+differenceBetweenAnnualIncome3+" рублей.");








    }
}