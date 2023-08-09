package goose;

import duck.Quackable;

public class GooseAdpater implements Quackable {
    Goose goose;

    public GooseAdpater(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
