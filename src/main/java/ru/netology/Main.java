package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 98765432";
        post.patronymic = "Федорович";
        post.phone = "+7 (905)-999-01-23";
        post.surname = "Крузенштерн";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}