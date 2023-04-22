package kalender;

import javafx.beans.property.SimpleIntegerProperty;

public class ToDay {

    private SimpleIntegerProperty tag;

    public ToDay() {
        this(0);
    }

    public ToDay(int tag) {
        this.tag = new SimpleIntegerProperty(tag);
    }

    public int getTag() {
        return tag.get();
    }

    public void setTag(int tag) {
        this.tag.set(tag);
    }

    public SimpleIntegerProperty tagProperty() {
        return tag;
    }

}
