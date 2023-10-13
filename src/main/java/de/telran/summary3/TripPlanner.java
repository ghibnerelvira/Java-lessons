package de.telran.summary3;

public class TripPlanner {

    // Когда закончится учебный год (isYearFinished) и
    // если будет солнечная погода (isGoodWeather), то ребята пойдут в поход.
    // -> Если туркружок закупит дождевики (hasBoughtRaincoats) к концу учебного года,
    // то ребята пойдут в поход даже в плохую погоду.
    // -> В поход ребят должен кто-то повести.
    // ->Поведёт тренер Джим, если он освободится от сдачи тренерского экзамена (isJimFree),
    // или тренер Кейт, если она вернётся из путешествия (hasKateComeBack).
    // -> Вести детей может только один тренер. Если Джим и Кейт смогут вести детей вместе,
    // то они обязательно поссорятся из-за этого и никто никуда не пойдёт.
    // Напишите логическое выражение для вычисления того, состоится ли поход.
    // -> Подберите условия, при которых поход состоится.
    public static void main(String[] args) {

        boolean isYearFinished = true; //Когда закончится учебный год  если будет солнечная погода, то ребята пойдут в поход.
        boolean isGoodWeather = true; // если будет солнечная погода, то ребята пойдут в поход.
        boolean hasBoughtRaincoats = false; // или ребята пойдут в поход даже в плохую погоду-> Если туркружок закупит дождевики к концу учебного года
        boolean isJimFree = true; // Поведёт тренер Джим
        boolean hasKateComeBack = false; // или тренер Кейт
        boolean isTripHappened = isYearFinished && (isGoodWeather || hasBoughtRaincoats) && (isJimFree ^ hasKateComeBack);

        System.out.println("Поход состоится: "+isTripHappened);



        // Вариант 2.

        boolean isYearFinished1 = true;
        boolean isGoodWeather1 = true;
        boolean hasBoughtRaincoats1 = true;
        boolean isJimFree1 = true;
        boolean hasKateComeBack1 = false; // true -> будет показывать -> else

        boolean willGoOnTrip1 = false;
        if (isYearFinished1 && isGoodWeather1) {
            if (hasBoughtRaincoats1 || (isJimFree1 && !hasKateComeBack1)) {
                if (isJimFree1 ^ hasKateComeBack1) {
                    willGoOnTrip1 = true;
                    System.out.println("Поход состоится 1: " + willGoOnTrip1);
                }else{
                    System.out.println("Поход не состяится:  "+ willGoOnTrip1);
                }
            }
        }

    }
}
