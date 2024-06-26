package entity;

import java.util.Objects;

public class Player {
    private String name;
    private SignType signType;

    public Player(String name, SignType signType) {
        this.name = Objects.requireNonNull(name, "Name can not be null");
        this.signType = Objects.requireNonNull(signType, "Sign Type can not be null");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SignType getSignType() {
        return signType;
    }

    public void setSignType(SignType signType) {
        this.signType = signType;
    }
}
