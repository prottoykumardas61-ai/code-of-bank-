class Sports {
    void play() {
        System.out.println("Playing a sport...");
    }
}

class Football extends Sports {
    void play() {
        System.out.println("Playing Football!");
    }
}

class Basketball extends Sports {
    void play() {
        System.out.println("Playing Basketball!");
    }
}

class Rugby extends Sports {
    void play() {
        System.out.println("Playing Rugby!");
    }
}

public class SportsTest {
    public static void main(String[] args) {
        Football f = new Football();
        Basketball b = new Basketball();
        Rugby r = new Rugby();

        f.play();
        b.play();
        r.play();
    }
}

