package stream;

import java.util.List;

class Client {
    Integer id;
    String name;
    Integer age;
    List<Phone> phones;

    public Client(Integer id, String name, Integer age, List<Phone> phones) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Client{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", phones=" + phones +
            '}';
    }

    public static void main(String[] args) {
        Phone phone = new Phone(1234567L, Phone.PhoneType.MOBIL);
        Phone phone2 = new Phone(321434L, Phone.PhoneType.STATIONARY);
        Phone phone3 = new Phone(4214L, Phone.PhoneType.MOBIL);
        Client firstClient = new Client(1, "first client", 25, List.of(phone, phone2, phone3));
        Phone phone4 = new Phone(1234567L, Phone.PhoneType.MOBIL);
        Client secondClient = new Client(2, "second client", 48, List.of(phone4));
        Phone phone5 = new Phone(1234567L, Phone.PhoneType.MOBIL);
        Phone phone6 = new Phone(1234567L, Phone.PhoneType.STATIONARY);
        Client thirdClient = new Client(3, "third client", 48, List.of(phone5, phone6));


        //Найти самого возрастного клиента, которой пользуется стационарным телефоном
        List<Client> list = List.of(firstClient, secondClient, thirdClient);

//        Client newClient = list.stream()
//            .filter(x-> x.getPhones().stream()
//                .anyMatch(anyPhone->anyPhone.getType().equals(Phone.PhoneType.STATIONARY)))
//            .max(Comparator.comparing(x-> x.getAge())).get();
//
//        System.out.println(newClient);
    }
}

