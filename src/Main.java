public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var papper = 763789;
        System.out.println(papper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        papper = papper + 4;
        System.out.println(papper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        papper = papper - 7639;
        System.out.println(papper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightOneBoxer + weightSecondBoxer;
        System.out.println("Общая масса бойцов " + totalWeight + "кг");
        var massDifference = weightOneBoxer - weightSecondBoxer;
        System.out.println("разница масс " + massDifference + "кг!");
        var massDifferenceSportsman = weightSecondBoxer - weightOneBoxer;
        System.out.println("разница масс спортсменов" + massDifferenceSportsman + "кг!");
        var massDiffSportsman = weightSecondBoxer % weightOneBoxer;
        System.out.println("разница масс спортсменов" + massDiffSportsman + "кг!");
        var totalTime = 640;
        var manTime = 8;
        var man = totalTime / manTime;
        System.out.println("Всего работников в комании - " + man + " человек");
        man = man + 94;
        manTime = manTime * man;
        System.out.println("Если в компании работает " + man + " человек, то всего " + manTime + " часов работы может быть поделено между сотрудниками");


    }
}