package ru.netology.javaqa.films;

public class FilmsManager {
    private String[] films = new String[0];
    private int limitViewCount;

    public FilmsManager() {
        limitViewCount = 5;
    }

    public FilmsManager(int limitViewCount) {
        if (limitViewCount > 0) {
            this.limitViewCount = limitViewCount;
        }else{
            this.limitViewCount = 5;
        }
    }


    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public String[] findAll() {
        return films;
    }


    public String[] findLast() {
        int resultLenght;
        if (films.length < limitViewCount) {
            resultLenght = films.length;
        } else {
            resultLenght = limitViewCount;
        }
        String[] last = new String[resultLenght];
        for (int i = 0; i < last.length; i++) {
            last[i] = films[films.length - 1 - i];
        }
        return last;
    }

}
