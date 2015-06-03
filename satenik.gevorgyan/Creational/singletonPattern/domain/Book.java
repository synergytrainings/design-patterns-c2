package singletonPattern.domain;

/**
 * Created by TikSat on 04.06.2015.
 */
public class Book {
    public Integer idNumber;
    public  Integer rang;
    public  String name;

    public Book(Integer idNumber, Integer rang, String name) {
        this.idNumber = idNumber;
        this.rang = rang;
        this.name = name;
    }

    //---------------- getters and setters --------------//
    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getRang() {
        return rang;
    }

    public void setRang(Integer rang) {
        this.rang = rang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
