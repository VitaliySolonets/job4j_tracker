package ru.job4j.tracker;

import java.util.*;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    public final List<Item> items = new ArrayList<>();

    /**
     * Метод реализующий добавление новой заявки в хранилище.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания.Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод возвращающий индекс элемента по входящему Id.
     *
     * @return index элемента.
     */
    private int getIndexById(String id) {
        int index = -1;
        for (int i = 0; i < this.items.size(); i++) {
            if (items.get(i).getId().contains(id)) {
                index = i;
                break;
            }
        }
        return index;
    }


    /**
     * Метод заменяет ячейку в массиве.
     *
     * @return boolean result удалось ли провести операцию
     */
    public boolean replace(String id, Item item) {
        int index = getIndexById(id);
        boolean res = index != -1;
        if (res) {
            item.setId(id);
            items.set(index, item);
        }
        return res;
        /*boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
                item.setId(id);
                result = true;
                break;
            }
        }
        return result;*/
    }

    /**
     * Метод удаляет ячейку в массиве по id. Смещая все значения справа от удаляемого элемента.
     *
     * @return true или false, удалось ли провести операцию
     */
    public boolean delete(String id) {
        return items.remove(this.items.contains(getIndexById(id)));
    }

    /**
     * Метод возвращает копию массива  this.items без null элементов
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Проверяет все элементы в цикле.Сравнивая name с аргументом метода String key.
     * Элементы у которых name совпадает копирует в результирующий массив и возвращает его
     */

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().contains(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    /**
     * Метод находит Item с нужный id
     */
    public Item findById(String id) {
        Item rsl = null;
        for (Item item : this.items) {
            if (item.getId().contains(id)) {
                rsl = item;
            }
        }
        return rsl;
    }
}
