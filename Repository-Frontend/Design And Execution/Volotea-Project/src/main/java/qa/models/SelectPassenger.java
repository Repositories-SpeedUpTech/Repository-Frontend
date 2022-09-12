package qa.models;

public class SelectPassenger {

    private int Adult;
    private int Child;
    private int Babys;

    public SelectPassenger(int adult, int child, int babys) {
        Adult = adult;
        Child = child;
        Babys = babys;
    }

    public int getAdult() {
        return Adult;
    }

    public int getChild() {
        return Child;
    }
    public int getBabys() {
        return Babys;
    }
}

