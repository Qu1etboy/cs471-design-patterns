import duck.*;
import goose.Goose;
import goose.GooseAdpater;
import pigeon.Pigeon;
import pigeon.PigeonAdapter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        // [1] - Quack 4 times
//        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
//        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
//        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
//        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));

        // [2] - Quack 8 times
        Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck = new QuackEcho(new QuackCounter(new RubberDuck()));

//        Quackable mallardDuck = duckFactory.createMailardDuck();
//        Quackable redheadDuck = duckFactory.createRedheadDuck();
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//
//        Quackable gooseDuck = new GooseAdpater(new Goose());
//        Quackable pigeon = new PigeonAdapter(new Pigeon());
//
//        System.out.println("\nDuck Simulator: With Abstract Factory");
//
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
//        flockOfDucks.add(gooseDuck);
//        flockOfDucks.add(pigeon);
//
//        Flock flockOfMallards = new Flock();
//
//        Quackable mallardOne = duckFactory.createMailardDuck();
//        Quackable mallardTwo = duckFactory.createMailardDuck();
//        Quackable mallardThree = duckFactory.createMailardDuck();
//        Quackable mallardFour = duckFactory.createMailardDuck();
//
//        flockOfMallards.add(mallardOne);
//        flockOfMallards.add(mallardTwo);
//        flockOfMallards.add(mallardThree);
//        flockOfMallards.add(mallardFour);
//
//        flockOfDucks.add(flockOfMallards);
//
        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
//
//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
