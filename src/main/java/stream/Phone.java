package stream;

class Phone {
    Long number;
    PhoneType type;

    public Phone(Long number, PhoneType type) {
        this.number = number;
        this.type = type;
    }

    public Long getNumber() {
        return number;
    }

    public PhoneType getType() {
        return type;
    }

    enum PhoneType {
        STATIONARY,
        MOBIL
    }
}