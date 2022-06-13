package ru.netology.postermanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {
    Movie first = new Movie(101, "Криминальное чтиво");
    Movie second = new Movie(102, "Чужой");
    Movie third = new Movie(103, "Твин Пикс");
    Movie fourth = new Movie(104, "Зеленая миля");
    Movie fifth = new Movie(105, "Список Шиндлера");
    Movie sixth = new Movie(106, "Побег из Шоушенка");
    Movie seventh = new Movie(107, "Интертеллар");
    Movie eighth = new Movie(108, "Назад в будущее");
    Movie ninth = new Movie(109, "Бойцовский клуб");
    Movie tenth = new Movie(110, "Начало");
    Movie eleventh = new Movie(111, "Гладиатор");
    Movie twelfth = new Movie(112, "Шрэк");
    Movie thirteenth = new Movie(113, "Достучаться до небес");
    Movie fourteenth = new Movie(114, "Матрица");
    Movie fifteenth = new Movie(115, "Крестный отец");

    @Test
    public void shouldFindAll() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        Movie[] actual = manager.findAll();
        Movie[] expected = {first, second, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultMaximum10() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.add(thirteenth);
        manager.add(fourteenth);
        manager.add(fifteenth);
        Movie[] actual = manager.findLast();
        Movie[] expected = {fifteenth, fourteenth, thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMaximum5() {
        PosterManager manager = new PosterManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.findLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth};
        assertArrayEquals(expected, actual);
    }

}
